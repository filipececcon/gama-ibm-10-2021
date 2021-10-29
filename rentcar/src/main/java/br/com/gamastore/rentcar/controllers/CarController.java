package br.com.gamastore.rentcar.controllers;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.gamastore.rentcar.dto.CarDto;
import br.com.gamastore.rentcar.forms.CarForm;
import br.com.gamastore.rentcar.services.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService service;
	
	@GetMapping
	public ResponseEntity<List<CarDto>> findAll(@RequestParam(required=false, value="brandName") String brandName){
		return  ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CarDto> findById(@PathVariable UUID id) {
		var result =  service.findById(id);
		return result != null ? ResponseEntity.ok(result) : ResponseEntity.notFound().build() ; 
	}
	
	@PostMapping
	public ResponseEntity<CarDto> add(@RequestBody CarForm form, UriComponentsBuilder uriBuilder) {
		var dto = service.add(form); 
		URI uri = uriBuilder.path("/cars/{id}").buildAndExpand(dto.Id).toUri();
		return ResponseEntity.created(uri).body(dto);    
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<CarDto> update(@PathVariable UUID id, @RequestBody CarForm form) {
		return ResponseEntity.ok(service.update(form, id));
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<CarDto> update(@PathVariable UUID id) {
		service.remove(id);
		return ResponseEntity.ok(null);
	}
	
	
	
}
