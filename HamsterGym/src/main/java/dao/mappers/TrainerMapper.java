package dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import Lalunaa.HamsterGym.Activities;
import Lalunaa.HamsterGym.Trainer;

public class TrainerMapper implements IMapResultSetIntoEntity<Trainer>{

	public Trainer map(ResultSet rs) throws SQLException {
		Trainer trainer = new Trainer();
		trainer.setId(rs.getInt("id"));
		trainer.setName(rs.getString("name"));
		trainer.setSurname(rs.getString("surname"));
		return trainer;
	}

}
