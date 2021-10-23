package br.com.gamastore.rentcar.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.entities.Customer;
import br.com.gamastore.rentcar.entities.Rent;


@Service
public class RentService {

	private static List<Rent> rents = new ArrayList<Rent>(
			List.of(
					new Rent(
							new Car("preto","VW",2013,2014,"AAA0000",100),
							LocalDateTime.now(),
							LocalDateTime.now(),
							new Customer("Azdrubal","R. Machado de Assim 234")
							),
					new Rent(
							new Car("preto","VW",2013,2014,"AAA0000",100),
							LocalDateTime.now(),
							LocalDateTime.now(),
							new Customer("Roziwilson","R. Marechal Deodoro 256")
							)
					)
			);
	
	
	
	public List<Rent> getAll(){
		return rents;
	}
	
	
}
