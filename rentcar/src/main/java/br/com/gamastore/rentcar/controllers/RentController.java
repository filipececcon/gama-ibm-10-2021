package br.com.gamastore.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamastore.rentcar.entities.Rent;
import br.com.gamastore.rentcar.repositories.RentRepository;

@RestController
@RequestMapping("/rents")
public class RentController {

	@Autowired
	private RentRepository service;

	@GetMapping
	public List<Rent> findAll(){
		return service.findAll();
	}
}
