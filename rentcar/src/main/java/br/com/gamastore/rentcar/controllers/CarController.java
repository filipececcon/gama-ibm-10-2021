package br.com.gamastore.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.services.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService service;
	
	@GetMapping
	public List<Car> findAll(){
		return service.getAll();
	}
	
}
