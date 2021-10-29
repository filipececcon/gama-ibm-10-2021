package br.com.gamastore.rentcar.factories;

import br.com.gamastore.rentcar.dto.CarDto;
import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.forms.CarForm;

public class CarFactory {
	
	public static Car Create(CarForm form) {
		return new Car(form.color, form.brand, form.yearManufactered, form.yearModel, form.licensePlate, form.price);
	}
	
	public static CarDto Create(Car car) {
	
		var dto = new CarDto(); 
		
		dto.Id = car.getId();
		dto.color = car.getColor();
		dto.brand = car.getBrand();
		dto.yearManufactered = car.getYearManufactered();
		dto.yearModel = car.getYearModel();
		dto.licensePlate = car.getLicensePlate();
		dto.price = car.getPrice();
		
		return dto;
	}

}
