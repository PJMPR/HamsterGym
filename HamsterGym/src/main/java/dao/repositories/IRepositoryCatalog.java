package dao.repositories;

public interface IRepositoryCatalog {

	public ICustomerRepository Customers();
	public IEnumDictionariesRepository Dictionaries();	
	public IActivitiesRepository Activities();
	public ITrainerRepository Trainers();
	public void save();
}
