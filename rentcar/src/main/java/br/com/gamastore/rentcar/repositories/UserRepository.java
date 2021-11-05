package br.com.gamastore.rentcar.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gamastore.rentcar.entities.User;

public interface UserRepository extends JpaRepository<User, UUID>{

	Optional<User> findByEmail(String email);
	
}
