package dao;

import dao.mappers.EnumDictionaryMapper;

import dao.mappers.CustomerMapper;
import dao.mappers.ActivitiesMapper;
import dao.repositories.*;
import dao.uow.IUnitOfWork;

import java.sql.Connection;

public class RepositoryCatalog implements IRepositoryCatalog {

	private Connection connection;
	private IUnitOfWork uow;

	public RepositoryCatalog(Connection connection, IUnitOfWork uow) {
		super();
		this.connection = connection;
		this.uow = uow;
	}

	public ICustomerRepository Customers() {
		return new CustomerRepository(connection, new CustomerMapper(), uow);
	}

	public IEnumDictionariesRepository Dictionaries() {
		return new EnumDictionaryRepository(connection,
				new EnumDictionaryMapper(), uow);
	}

	
	public void save() {
		uow.saveChanges();
	}

	public IActivitiesRepository Activities() {
		return new ActivitiesRepository(connection, new ActivitiesMapper(), uow);
	
	}
}