package br.com.gamastore.rentcar.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.factories.ConnectionFactory;

public class CarDao {
	
	private EntityManager em;
	
	public CarDao() {
		this.em = ConnectionFactory.getEntityManager();
	}
		
	public List<Car> findAll() {
		
		String jpql = "SELECT c FROM Car c";
			
		return em.createQuery(jpql, Car.class).getResultList();
	}	
}
