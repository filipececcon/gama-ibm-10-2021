package br.com.gamastore.rentcar.services;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import br.com.gamastore.rentcar.dto.CarDto;
import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.factories.CarFactory;
import br.com.gamastore.rentcar.forms.CarForm;
import br.com.gamastore.rentcar.forms.UpdateCarPriceForm;
import br.com.gamastore.rentcar.repositories.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository repository;
	
	public Page<CarDto> findAll(Pageable pageable){ 
		
		int size = pageable.getPageSize();
	
		if(pageable.getPageSize() > 10) size = 10;
		else if(pageable.getPageSize() < 0) size = 0;
		
		Pageable _p = PageRequest.of(pageable.getPageNumber(), size,pageable.getSort());
		
		return repository.findAll(_p).map(CarFactory::Create);
		//return repository.findAll().stream().map(CarFactory::Create).collect(Collectors.toList());
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
	
		var result = repository.findById(id);
		
		if(!result.isPresent()) return null;
		
		var car = result.get();
		
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
	
	public CarDto updatePrice(UpdateCarPriceForm form, UUID id) {
		
		var result = repository.findById(id);
		
		if(!result.isPresent()) return null;
		
		var car = result.get();
	
		car.setPrice(form.price);
		car.setUpdatedAt(LocalDateTime.now());
		
		repository.save(car);
		
		return CarFactory.Create(car);
	}
}
