package br.com.gamastore.rentcar.entities;

import lombok.Data;

@Data
public class Customer extends Entity {
	private String name;
	private String address;	
}
