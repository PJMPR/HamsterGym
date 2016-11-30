package Lalunaa.HamsterGym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.RepositoryCatalog;
import dao.repositories.IRepositoryCatalog;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;


public class App {
	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			
		IUnitOfWork uow = new UnitOfWork(connection);
		IRepositoryCatalog catalogOf = new RepositoryCatalog(connection, uow);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
    	
    	//List<Customer> customers = catalogOf.Customers().withName("janek");
    	
    	

		
	}

}
