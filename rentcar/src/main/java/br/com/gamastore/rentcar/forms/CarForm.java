package br.com.gamastore.rentcar.forms;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CarForm {

	@NotNull @NotEmpty @NotBlank
	public String color;
	public String brand;
	public int yearManufactered;
	public int yearModel;
	public String licensePlate;
	public double price;
}
