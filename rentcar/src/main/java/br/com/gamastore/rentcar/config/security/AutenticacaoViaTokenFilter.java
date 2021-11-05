package br.com.gamastore.rentcar.config.security;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import br.com.gamastore.rentcar.entities.User;
import br.com.gamastore.rentcar.repositories.UserRepository;
import br.com.gamastore.rentcar.services.TokenService;

public class AutenticacaoViaTokenFilter extends OncePerRequestFilter {

	private UserRepository userRepository;
	
	private TokenService tokenService;
	
	public AutenticacaoViaTokenFilter(TokenService tokenService, UserRepository userRepository) {
		this.tokenService = tokenService;
		this.userRepository = userRepository;
	}
	
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		
		String token = recuperarToken(request);
		
		System.out.println(token);
		
		boolean valido = tokenService.isTokenValido(token);
		
		if (valido) autenticarCliente(token);
				
		filterChain.doFilter(request, response);	
	}

	private void autenticarCliente(String token) {
		
		String email = tokenService.getEmailUsuario(token);
		
		User usuario = userRepository.findByEmail(email).get();
		
		System.out.println(usuario.getUsername());
		
		UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
	}


	private String recuperarToken(HttpServletRequest request) {
		
		String token = request.getHeader("Authorization");
		
		if (token == null || token.isEmpty() || !token.startsWith("Bearer ")) {
			return null;
		}
		
		return token.substring(7, token.length());
	}

	

}
