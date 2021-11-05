package br.com.gamastore.rentcar.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamastore.rentcar.dto.TokenDto;
import br.com.gamastore.rentcar.forms.LoginForm;
import br.com.gamastore.rentcar.services.TokenService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private TokenService tokenService;
			
	@PostMapping
	public ResponseEntity<TokenDto> login(@RequestBody @Valid LoginForm form) {
		
		UsernamePasswordAuthenticationToken dadosLogin = new UsernamePasswordAuthenticationToken(form.email, form.password); 
				
		Authentication autenticacao = authManager.authenticate(dadosLogin);
		
		var token = tokenService.gerarToken(autenticacao);
		
		return ResponseEntity.ok(new TokenDto(token, "Bearer"));
		
		
//		UsernamePasswordAuthenticationToken dadosLogin = form.converter();
//		
//		try {
//			Authentication authentication = authManager.authenticate();
//			
//			String token = tokenService.gerarToken(authentication);
//			
//			return ResponseEntity.ok(new TokenDto(token, "Bearer"));
//			
//		} catch (AuthenticationException e) {
//			
//			return ResponseEntity.badRequest().build();
//		}
	}
	
}
