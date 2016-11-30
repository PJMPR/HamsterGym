package Lalunaa.HamsterGym;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import dao.RepositoryCatalog;
import dao.repositories.IRepositoryCatalog;
import dao.uow.IUnitOfWork;
import dao.uow.UnitOfWork;


public class App {
	public static void main(String[] args) {
		
		Customer one = new Customer();
		one.setName("Damian");
		one.setSurname("Nowak");
		
		Activities abt = new ABT();
		
		
					
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			
		IUnitOfWork uow = new UnitOfWork(connection);
		IRepositoryCatalog catalogOf = new RepositoryCatalog(connection, uow);
		
				
		catalogOf.Customers().add(one);

		catalogOf.Activities().add(abt);
		
		catalogOf.save();
	
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
    	
    	
    	
    	

		
	}

}
