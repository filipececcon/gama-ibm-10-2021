package br.com.gamastore.rentcar.services;

import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.forms.CarForm;
import br.com.gamastore.rentcar.repositories.CarRepository;

@ExtendWith(MockitoExtension.class)
class CarServiceTest {
		
	private CarService service;
	
	@Mock //mock é um duble do objeto injetado, nessa caso nao ira na base de dados
	private CarRepository repository;
		
	@BeforeEach
	void setUp() throws Exception {	
		this.service = new CarService(repository);	
	}

	@Test
	void deveRemoverUmCarroPeloId() {
		try {
			service.remove(UUID.randomUUID());
			Assertions.assertTrue(true);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			Assertions.assertTrue(false);
		}
	}
	
	
	@Test
	void deveRetornarUmErroQuandoAdicionarUmCarroComAPlacaJaExistente() {
		
		try {
			
			CarForm form = new CarForm();
			
			form.color = "cornova";
			form.brand = "marca";
			form.licensePlate = "AAA0000";
			form.price = 100.0;
			form.yearManufactered= 2015;
			form.yearModel = 2015;
						
			//quando o service rodar o metodos para obter um carro pela placa
			//devolvelmos um carro ter um retorno esperado e cair na exceçao
			Mockito
			.when(repository.findByLicensePlate(form.licensePlate))
			.thenReturn(new Car());
						
			service.add(form);
			
			Assertions.assertTrue(false);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			
			Assertions.assertTrue(true);
		}
		
	}

}
