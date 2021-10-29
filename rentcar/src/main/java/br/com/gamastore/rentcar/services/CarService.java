package br.com.gamastore.rentcar.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gamastore.rentcar.dto.CarDto;
import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.factories.CarFactory;
import br.com.gamastore.rentcar.forms.CarForm;
import br.com.gamastore.rentcar.repositories.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository repository;
	
	public List<CarDto> findAll(){
		return repository.findAll().stream().map(CarFactory::Create).collect(Collectors.toList());
	}
	
	public CarDto findById(UUID id) {
		var result = repository.findById(id);
		return result.isPresent() ? CarFactory.Create(result.get()) : null;
	}
	
	public CarDto add(CarForm form) {
		Car car = CarFactory.Create(form);
		repository.save(car);
		return CarFactory.Create(car);
	}
	
	public CarDto update(CarForm form, UUID id) {
	
		var car = repository.findById(id).get();
		
		car.setColor(form.color);
		car.setBrand(form.brand);
		car.setYearManufactered(form.yearManufactered);
		car.setYearModel(form.yearModel);
		car.setLicensePlate(form.licensePlate);
		car.setPrice(form.price);
		car.setUpdatedAt(LocalDateTime.now());
		
		repository.save(car);
		
		return CarFactory.Create(car);	
	}
	
	
	public void remove(UUID id) {
		repository.deleteById(id);
	}
	
}
