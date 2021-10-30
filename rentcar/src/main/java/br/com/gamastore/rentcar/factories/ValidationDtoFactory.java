package br.com.gamastore.rentcar.factories;

import org.springframework.validation.FieldError;

import br.com.gamastore.rentcar.dto.ValidationDto;

public class ValidationDtoFactory {
	
	public static ValidationDto Create(FieldError error) {

		var dto = new ValidationDto();
				
		dto.field = error.getField();
		dto.message = error.getDefaultMessage();
		
		return dto;
	}
}
