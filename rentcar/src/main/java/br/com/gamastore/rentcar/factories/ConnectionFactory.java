package br.com.gamastore.rentcar.factories;

import java.sql.Connection;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;


public class ConnectionFactory {

	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("loja");
	
	public static EntityManager getEntityManager() { 
		return FACTORY.createEntityManager();
	}
	
//	public static Connection getConnection() {
//
//		JdbcDataSource dataSource = new JdbcDataSource();
//	    dataSource.setURL("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1"); // Set `DB_CLOSE_DELAY` to `-1` to keep in-memory database in existence after connection closes.
//	    dataSource.setUser("scott");
//	    dataSource.setPassword("tiger");
//
//		//DataSource dataSource = comboPooledDataSource;
//			
//		try {
//			return dataSource.getConnection();
//		} catch (SQLException e) {
//			throw new RuntimeException(e);
//		}
//	}	
}
