package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
	
import dao.mappers.IMapResultSetIntoEntity;
import dao.repositories.IActivitiesRepository;
import dao.uow.IUnitOfWork;
import Lalunaa.HamsterGym.Activities;
		

	public class ActivitiesRepository extends RepositoryBase<Activities> 
	implements IActivitiesRepository {
		
		private PreparedStatement getType;
	    private PreparedStatement getTrainer;
	    private PreparedStatement getDay;
	    private PreparedStatement getTime;	    
	    

		public ActivitiesRepository(Connection connection, 
			IMapResultSetIntoEntity<Activities> mapper, IUnitOfWork uow) {
			super(connection,mapper, uow);
		
		
		try{
		    getType = connection.prepareStatement(getTypeSql());
		    getTrainer = connection.prepareStatement(getTrainerSql());
		    getDay = connection.prepareStatement(getDaySql());
		    getTime = connection.prepareStatement(getTimeSql());
        }catch(SQLException e){
		    e.printStackTrace();
        }
		
		}
	
				
		protected String getTypeSql(){return "SELECT * FROM activities where type = ?";}
		protected String getTrainerSql(){return "SELECT * FROM activities where trainer=?";}
		protected String getDaySql(){return "SELECT * FROM activities where day=?";}
		protected String getTimeSql(){return "SELECT * FROM activities where time=?";}
		

			@Override
			protected String createTableSql() {
				return "" + "CREATE TABLE activities(" 
						+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
						+ "type varchar(20)," 
						+ "trainer varchar(50)," 
						+ "description text," 
						+ "day varchar(20)," 
						+ "time varchar(10)," 
						+ "duration varchar(10)," 
						+ "groupSize tinyint," 
						+ "numberOfCustomers tinyint," + ")";
			}

			@Override
			protected String tableName() {
				return "activities";
			}
			
			protected String insertSql() {
				return "INSERT INTO activities(type, trainer, description, day, time, duration, groupSize, numberOfCustomers) VALUES (?,?,?,?,?,?,?,?)";
			}
			
			protected String updateSql() {
				return "UPDATE activities SET (type, trainer, description, day, time, duration, groupSize, numberOfCustomers)=(?,?,?,?,?,?,?,?) WHERE id=?";
			}
			
			protected String deleteSql() {				
				return "DELETE FROM activities WHERE id=?";
			}
			
			protected String selectAllSql() {
				return "SELECT * FROM activities";
			}
			
			@Override
			protected void setUpdate(Activities entity) throws SQLException {
				
				update.setString(1, entity.getType());
				update.setString(2, entity.getTrainer());
				update.setString(3, entity.getDescription());
				update.setString(4, entity.getDay().toString());
				update.setString(5, entity.getTime());
				update.setString(6, entity.getDuration());
				update.setInt(7, entity.getGroupSize());
				update.setInt(8, entity.getNumberOfCustomers());
				
			}

			@Override
			protected void setInsert(Activities entity) throws SQLException {
				

				insert.setString(1, entity.getType());
				insert.setString(2, entity.getTrainer());
				insert.setString(3, entity.getDescription());
				insert.setString(4, entity.getDay().toString());
				insert.setString(5, entity.getTime());
				insert.setString(6, entity.getDuration());
				insert.setInt(7, entity.getGroupSize());
				insert.setInt(8, entity.getNumberOfCustomers());
				
			}

			private List<Activities> searchBy(String value){
		        List<Activities> activities = new ArrayList<Activities>();
		        try{
		            getType.setString(1,value);
		            ResultSet resultSet = getType.executeQuery();
		            while(resultSet.next()){
		                activities.add(mapper.map(resultSet));
		            }
		        }catch (SQLException e){
		            e.printStackTrace();
		        }
		        return activities;
		    }


			public List<Activities> withType(String type) {
				return searchBy(type);				
			}


			public List<Activities> withTrainer(String trainer) {
				return searchBy(trainer);				
			}


			public List<Activities> of(String customer) {
				return searchBy(customer);				
			}	
			
		}




