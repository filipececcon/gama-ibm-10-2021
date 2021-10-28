package br.com.gamastore.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.repositories.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarRepository service;
	
//	@GetMapping
//	public List<Car> findAll(){
//		return service.findAll();
//	}
	
	@GetMapping
	public List<Car> findAll(@RequestParam(required=false, value="brandName") String brandName){
		
		return brandName != null 
				?service.findAllByBrand(brandName)
				:service.findAll();
	}
}
