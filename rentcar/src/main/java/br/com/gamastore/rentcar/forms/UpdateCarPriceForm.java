package br.com.gamastore.rentcar.forms;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UpdateCarPriceForm {

	@NotNull @Min(value = 1)
	public double price;
	
}
