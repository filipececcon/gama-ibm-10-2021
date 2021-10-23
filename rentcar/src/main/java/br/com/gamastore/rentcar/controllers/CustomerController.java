package br.com.gamastore.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamastore.rentcar.entities.Customer;
import br.com.gamastore.rentcar.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping
	public List<Customer> findAll(){
		return service.getAll();
	}
	
}
