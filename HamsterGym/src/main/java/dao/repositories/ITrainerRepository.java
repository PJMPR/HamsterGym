package dao.repositories;

import java.util.List;

import Lalunaa.HamsterGym.Trainer;


public interface ITrainerRepository extends IRepository<Trainer> {

	public List<Trainer> withName(String name);
	public List<Trainer> withSurname(String surname);
	
	

}
