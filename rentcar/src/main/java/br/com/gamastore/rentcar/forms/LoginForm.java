package br.com.gamastore.rentcar.forms;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginForm {
	
	@Email @NotEmpty @NotBlank @NotNull
	public String email;
	
	@NotEmpty @NotBlank @NotNull
	public String password;

}
