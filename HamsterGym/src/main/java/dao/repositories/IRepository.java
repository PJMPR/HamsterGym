package dao.repositories;

import java.util.List;

import Lalunaa.HamsterGym.IHaveId;

public interface IRepository<TEntity extends IHaveId> {

	public List<TEntity> getAll();

	public TEntity get(int customerId);

	public void update(TEntity entity);

	public void add(TEntity entity);

	public void delete(TEntity entity);
	
	public int getLastId();

}