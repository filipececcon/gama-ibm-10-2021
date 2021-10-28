package br.com.gamastore.rentcar.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.gamastore.rentcar.entities.Car;
import br.com.gamastore.rentcar.factories.ConnectionFactory;

public class CarDao {
	
	private EntityManager em;
	
	public CarDao() {
		this.em = ConnectionFactory.getEntityManager();
	}
	
	//utilizando JPQL
	public List<Car> findAll() {
		
		String jpql ="SELECT c FROM Car c" ;
			
		return em.createQuery(jpql, Car.class).getResultList();
	}
	
	//forma manual
//	public List<Car> getAll() {
//		
//		try {
//			
//			List<Car> cars = new ArrayList<>();
//			
//			String sql = "SELECT color, brand, yearmanufactured, yearmodel, licenseplate, price FROM CAR";
//
//			var connection = ConnectionFactory.getConnection();
//						
//			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
//				
//				pstm.execute();
//
//				try (ResultSet rst = pstm.getResultSet()) {
//					
//					while (rst.next()) {
//						
//						Car car = new Car(rst.getString(1), rst.getString(2), rst.getInt(3), rst.getInt(4), rst.getString(5), rst.getDouble(6) );
//
//						cars.add(car);
//					}
//				}
//			}
//			
//			return cars;
//			
//		} catch (SQLException e) {
//			
//			throw new RuntimeException(e);
//		}
//	}
}
