package br.com.gamastore.rentcar.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.gamastore.rentcar.dto.ValidationDto;
import br.com.gamastore.rentcar.factories.ValidationDtoFactory;

@RestControllerAdvice
public class ValidationHandler {

	//@Autowired
	//private MessageSource messageSource;
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<ValidationDto> handle(MethodArgumentNotValidException exception) {
		
		List<FieldError> errors = exception.getBindingResult().getFieldErrors();
		
		//forma manual de fazer traduções das mensagens
//		List<ValidationDto> dtos = new ArrayList<ValidationDto>();
//		
//		errors.forEach(e ->{
//			var dto = new ValidationDto();
//			dto.field = e.getField();
//			dto.message = messageSource.getMessage(e, LocaleContextHolder.getLocale());
//			dtos.add(dto);
//		});
//		
//		return dtos;
		
		return errors.stream().map(ValidationDtoFactory::Create).collect(Collectors.toList());
	}
}
