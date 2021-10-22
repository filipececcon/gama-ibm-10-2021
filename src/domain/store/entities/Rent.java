package domain.store.entities;

import java.time.LocalDate;
import java.time.Period;

import domain.shared.entities.Entity;

public class Rent extends Entity {

	private double totalPrice;
	private LocalDate startDate;
	private LocalDate endDate;
	private Car car;
	
	private double getTotalPrice() {
		
		var days = Period.between(startDate, endDate).getDays();
		
		return days * car.getPrice();
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
		
}