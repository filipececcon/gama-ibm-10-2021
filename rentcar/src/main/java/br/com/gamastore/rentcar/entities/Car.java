package br.com.gamastore.rentcar.entities;

import javax.persistence.Entity;

@Entity
public class Car extends SuperEntity {

	private String color;
	private String brand;
	private int yearManufactered;
	private int yearModel;
	private String licensePlate;
	private double price;
	
	public Car() {
		
	}
		
	public Car(String color, String brand, int yearManufactered, int yearModel, String licensePlate, double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.yearManufactered = yearManufactered;
		this.yearModel = yearModel;
		this.licensePlate = licensePlate;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYearManufactered() {
		return yearManufactered;
	}

	public void setYearManufactered(int yearManufactered) {
		this.yearManufactered = yearManufactered;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
