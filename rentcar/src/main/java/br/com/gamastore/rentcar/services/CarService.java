package br.com.gamastore.rentcar.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gamastore.rentcar.dao.CarDao;
import br.com.gamastore.rentcar.entities.Car;

@Service
public class CarService {
	
	private CarDao dao;
	
	public CarService() {
		dao = new CarDao();
	}
	
	public List<Car> getAll(){
		return dao.findAll();
	}
}