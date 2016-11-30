package dao.mappers;


import java.sql.ResultSet;
import java.sql.SQLException;

import Lalunaa.HamsterGym.Day;
import Lalunaa.HamsterGym.Activities;

public class ActivitiesMapper implements IMapResultSetIntoEntity<Activities>{

	public Activities map(ResultSet rs) throws SQLException {
		Activities activities = new Activities();
		activities.setId(rs.getInt("id"));
		activities.setType(rs.getString("type"));
		activities.setTrainer(rs.getString("trainer"));
		activities.setDay((Day) rs.getObject("day"));
		activities.setTime(rs.getString("time"));
		activities.setDuration(rs.getString("duration"));
		activities.setGroupSize(rs.getInt("groupSize"));
		activities.setNumberOfCustomers(rs.getInt("numberOfCustomers"));
		return activities;
	}
}