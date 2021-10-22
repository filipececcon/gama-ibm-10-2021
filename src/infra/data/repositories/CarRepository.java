package infra.data.repositories;

import java.util.ArrayList;
import java.util.List;

import domain.store.entities.Car;

public class CarRepository {

	private List<Car> cars;
	
	public CarRepository() {
		cars = new ArrayList<Car>();
	}

	public List<Car> getCars() {
		return cars;
	}
	
	public void add(Car car) {
		cars.add(car);
	}

	
}
