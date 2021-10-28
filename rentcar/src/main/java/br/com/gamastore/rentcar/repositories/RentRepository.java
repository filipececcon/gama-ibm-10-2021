package br.com.gamastore.rentcar.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.gamastore.rentcar.entities.Rent;

public interface RentRepository extends JpaRepository<Rent, UUID> {
	
		
}
