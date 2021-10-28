package br.com.gamastore.rentcar.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gamastore.rentcar.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID>{
	
	
}
