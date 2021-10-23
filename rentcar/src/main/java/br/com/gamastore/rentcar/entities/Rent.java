package br.com.gamastore.rentcar.entities;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Rent extends Entity {

	private Car car;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Customer customer;
}
