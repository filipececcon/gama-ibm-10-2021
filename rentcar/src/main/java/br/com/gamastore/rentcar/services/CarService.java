package br.com.gamastore.rentcar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.context.annotation.Bean;

import br.com.gamastore.rentcar.entities.Car;

@Service
public class CarService {
	
	private static List<Car> cars = new ArrayList<Car>(
			List.of(
					new Car("preto","VW",2013,2014,"AAA0000",100),
					new Car("azul","GM",2012,2013,"BBB0000",100),
					new Car("azul","GM",2012,2013,"BBB0000",100)
					)
			);
	
	
	
	public List<Car> getAll(){
		return cars;
	}
}