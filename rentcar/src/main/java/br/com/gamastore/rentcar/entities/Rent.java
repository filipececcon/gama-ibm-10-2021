package br.com.gamastore.rentcar.entities;

import java.time.LocalDateTime;

import javax.persistence.ManyToOne;

@javax.persistence.Entity
public class Rent extends Entity {

	@ManyToOne
	private Car car;
	
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	
	@ManyToOne
	private Customer customer;
	
	public Rent(Car car, LocalDateTime startDate, LocalDateTime endDate, Customer customer) {
		super();
		this.car = car;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customer = customer;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
