package Lalunaa.HamsterGym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class App 
{
    public static void main( String[] args )
    {
    	 try {
             Connection connection =
                     DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
             CustomerRepository customerRepository = new CustomerRepository(connection);
    	 } catch (SQLException e) {
        e.printStackTrace();
    }
    	 
    	ABT joga = new ABT();
    	joga.setType("Joga");
    	Customer customer = new Customer(1, "A", "B");
    	System.out.println(customer.getName());
    	joga.info();
    	 
    	 
    	
    
}
    
}
