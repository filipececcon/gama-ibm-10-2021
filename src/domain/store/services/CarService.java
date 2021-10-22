package domain.store.services;

import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import domain.shared.interfaces.IService;
import domain.store.entities.Car;
import infra.data.repositories.CarRepository;

public class CarService implements IService<Car> {

	private CarRepository repository;
	
	public CarService(CarRepository repository) {
		this.repository = repository;
	}

	@Override
	public Car getOnly(Predicate<Car> predicate) {
		return repository.getCars().stream().filter(predicate).findFirst().orElse(null);
	}
	
	@Override
	public List<Car> getMany(Predicate<Car> predicate) {
		return repository.getCars().stream().filter(predicate).collect(Collectors.toList());//.orElse(null);
	}

	@Override
	public void add(Car entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Car entity) {
		// TODO Auto-generated method stub
		
	}
	
	public void meuMetodo() {
		
	}
	
	
	
//	private CarRepository repository;
//	
//	public CarService(CarRepository repository) {
//		this.repository = repository;
//	}
	
//	public Car getCarById(UUID id) {
//		
//		Predicate<Car> predicate = carro -> carro.getId() == id;
//				
//		return repository.getCars().stream().filter(predicate).findFirst().orElse(null);
//	}
//	
//	public Car getOnly(Predicate<Car> predicate) {
//		return repository.getCars().stream().filter(predicate).findFirst().orElse(null);
//	}
//	
//	public List<Car> getMany(Predicate<Car> predicate) {
//		return repository.getCars().stream().filter(predicate).collect(Collectors.toList());//.orElse(null);
//	}
//	
//	public void add(Car car) {
//		repository.add(car);
//	}
}
