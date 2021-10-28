package br.com.gamastore.rentcar.entities;

import javax.persistence.Entity;

@Entity
public class Customer extends SuperEntity {
	private String name;
	private String address;
	
	public Customer(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
