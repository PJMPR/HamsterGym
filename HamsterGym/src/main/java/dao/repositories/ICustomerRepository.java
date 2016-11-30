package dao.repositories;

import java.util.List;

import Lalunaa.HamsterGym.Customer;


public interface ICustomerRepository extends IRepository<Customer> {

	public List<Customer> withName(String name);
	public List<Customer> withSurname(String surname);

}
