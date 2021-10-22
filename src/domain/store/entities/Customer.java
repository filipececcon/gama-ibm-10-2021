package domain.store.entities;

import domain.shared.entities.Entity;
import domain.shared.valueObjects.Address;

public class Customer extends Entity {

	private String name;

	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
