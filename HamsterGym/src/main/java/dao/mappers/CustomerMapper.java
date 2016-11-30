package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import Lalunaa.HamsterGym.Customer;

public class CustomerMapper implements IMapResultSetIntoEntity<Customer>{

	public Customer map(ResultSet rs) throws SQLException {
		Customer customer = new Customer();
		customer.setId(rs.getInt("id"));
		customer.setName(rs.getString("name"));
		customer.setSurname(rs.getString("surname"));
		return customer;
	}

}
