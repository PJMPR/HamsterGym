package Lalunaa.HamsterGym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import dao.CustomerRepository;
import dao.repositories.IRepositoryCatalog;
import Lalunaa.HamsterGym.Customer;

public class App {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
			CustomerRepository customerRepository = new CustomerRepository(connection, null, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

}
