package dao.repositories;

public interface IRepositoryCatalog {

	public ICustomerRepository Customers();
	public IEnumDictionariesRepository Dictionaries();	
	public IActivitiesRepository Activities();
	public void save();
}
