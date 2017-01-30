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
		activities.setDay(rs.getString("day"));
		activities.setTime(rs.getString("time"));
		activities.setDuration(rs.getString("duration"));
		activities.setGroupSize(rs.getInt("groupSize"));
		return activities;
	}
}