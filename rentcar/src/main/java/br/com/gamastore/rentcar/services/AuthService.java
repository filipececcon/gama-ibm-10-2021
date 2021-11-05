package br.com.gamastore.rentcar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.gamastore.rentcar.repositories.UserRepository;

@Service
public class AuthService implements UserDetailsService {

	@Autowired
	private UserRepository repository;
		
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		var result = repository.findByEmail(username);
			
		if(!result.isPresent()) throw new UsernameNotFoundException("usuário não encontrado");
	
		return result.get();
	}
}
