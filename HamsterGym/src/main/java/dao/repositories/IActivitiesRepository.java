package dao.repositories;

import java.util.List;

import Lalunaa.HamsterGym.Activities;


public interface IActivitiesRepository extends IRepository<Activities>{

	public List<Activities> withType(String type);
	public List<Activities> withTrainer(String trainer);
	public List<Activities> of(String customer);
}
