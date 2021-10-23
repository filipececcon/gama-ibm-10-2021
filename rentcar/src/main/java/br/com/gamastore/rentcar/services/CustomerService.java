package br.com.gamastore.rentcar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gamastore.rentcar.entities.Customer;

@Service
public class CustomerService {

	private static List<Customer> customers = new ArrayList<Customer>(
			List.of(
					new Customer("Azdrubal","R. Machado de Assim 234"),
					new Customer("Roziwilson","R. Marechal Deodoro 256")
					)
			);
	
	
	
	public List<Customer> getAll(){
		return customers;
	}
	
	
	
}
