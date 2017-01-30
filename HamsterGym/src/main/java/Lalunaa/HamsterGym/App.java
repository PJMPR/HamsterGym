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
		
		Customer one = new Customer();
		one.setName("Damian");
		one.setSurname("Nowak");
				
		Customer two = new Customer();
		two.setName("Czarek");
		two.setSurname("Kowalski");		
		
		Activities abt = new ABT();
		
		Activities joga = new Joga();
		
		Activities powerPump = new PowerPump();
		
		Activities salsation = new Salsation();
		
		Activities step = new Step();
		
		Activities stretching = new Stretching();
		
		Activities tbc = new TBC();
		
		Trainer a = new Trainer();
		a.setName("Dawid");
		a.setSurname("Nowy");
		
		Trainer b = new Trainer();
		b.setName("Rafał");
		b.setSurname("Kowalski");
		
							
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			
		IUnitOfWork uow = new UnitOfWork(connection);
		IRepositoryCatalog catalogOf = new RepositoryCatalog(connection, uow);
		
				
		catalogOf.Customers().add(one);		
		catalogOf.Customers().add(two);
		
		catalogOf.Activities().add(abt);
		catalogOf.Activities().add(joga);
		catalogOf.Activities().add(powerPump);
		catalogOf.Activities().add(salsation);
		catalogOf.Activities().add(step);
		catalogOf.Activities().add(stretching);
		catalogOf.Activities().add(tbc);
		
		catalogOf.Trainers().add(a);
		catalogOf.Trainers().add(b);
		
						
		catalogOf.save();
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 	
    	

		
	}

}
