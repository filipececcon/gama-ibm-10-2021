package br.com.gamastore.rentcar.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Car extends Entity {

	private String color;
	private String brand;
	private int yearManufactered;
	private int yearModel;
	private String licensePlate;
	private double price;
	
	public Car(String color, String brand, int yearManufactered, int yearModel, String licensePlate, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.yearManufactered = yearManufactered;
		this.yearModel = yearModel;
		this.licensePlate = licensePlate;
		this.price = price;
	}
	
	
}
