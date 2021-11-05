package br.com.gamastore.rentcar.services;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.gamastore.rentcar.entities.User;
import br.com.gamastore.rentcar.repositories.UserRepository;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {

	//@Autowired
	//private UserRepository userRepository;
	
	@Value("${rentcar.jwt.expiration}")
	private String umDiaEmMilisegundos;
	
	@Value("${rentcar.jwt.secret}")
	private String secret;
	
	public String gerarToken(Authentication autenticacao) {
	
		User logado = (User) autenticacao.getPrincipal();
	
		//User entidade = userRepository.findByEmail(logado.getUsername()).get();
		
		Date hoje = new Date();
		
		Date dataExpiracao = new Date(hoje.getTime() + Long.parseLong(umDiaEmMilisegundos));
		
		return Jwts.builder()
				.setIssuer("br.com.gamastore.rentcar")
				.setSubject(logado.getUsername())
				.setIssuedAt(hoje)
				.setExpiration(dataExpiracao)
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}
	
	public boolean isTokenValido(String token) {
		try {
			
			Jwts.parser()
			.setSigningKey(secret) // sem a chave secreta do token, um jwt jamais será valido
			.parseClaimsJws(token); //para passar o token a ser verificar utilizamos o método parseClaimsJws
			
			return true;
			
		} catch (Exception e) {
			
			System.out.println(e);
			
			return false;
		}
	}

	public String getEmailUsuario(String token) {
	
		var claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token); 
				
		return claims.getBody().getSubject();		
	}
	
	
}
