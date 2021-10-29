package br.com.gamastore.rentcar.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gamastore.rentcar.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {
	
	List<Car> findAllByBrand(String brand);
	
	//forma antiga utilizando o DAO => data access object
//	private CarDao dao;
//	
//	public CarService() {
//		dao = new CarDao();
//	}
//	
//	public List<Car> getAll(){
//		return dao.findAll();
//	}
}