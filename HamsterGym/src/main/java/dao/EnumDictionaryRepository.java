package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.mappers.IMapResultSetIntoEntity;
import dao.repositories.IEnumDictionariesRepository;
import dao.uow.IUnitOfWork;
import Lalunaa.HamsterGym.EnumDictionary;

public class EnumDictionaryRepository extends RepositoryBase<EnumDictionary> 
	implements IEnumDictionariesRepository{

	protected PreparedStatement selectWithDictionaryName;
	protected PreparedStatement getEnumValuesByString;
	protected PreparedStatement getEnumValuesByInt;
	
	protected String selectWithDictionaryName() {
		return "SELECT * FROM enumDictionary WHERE enumerationName=?";
	}
	
	protected String getEnumValuesByString() {
		return "SELECT value FROM enumDictionary WHERE enumerationName=? AND stringKey=?";
	}
	
	protected String getEnumValuesByInt() {
		return "SELECT value FROM enumDictionary WHERE enumerationName=? AND intKey=?";
	}
	
	public EnumDictionaryRepository(Connection connection,
			IMapResultSetIntoEntity<EnumDictionary> mapper, IUnitOfWork uow) {
		super(connection, mapper, uow);
		try {
			selectWithDictionaryName = connection.prepareStatement(selectWithDictionaryName());
			getEnumValuesByString = connection.prepareStatement(getEnumValuesByString());
			getEnumValuesByInt = connection.prepareStatement(getEnumValuesByInt());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected String createTableSql() {
		return "CREATE TABLE enumDictionary("
				+ "id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,"
				+ "intKey bigint," 
				+ "stringKey varchar(50),"
				+ "value varchar(50)," 
				+ "enumerationName varchar(50)" 
				+ ")";
	}

	@Override
	protected String tableName() {
		return "enumDictionary";
	}

	protected String insertSql() {
		return "INSERT INTO enumDictionary(intKey, stringKey, value, enumerationName) VALUES (?,?,?,?)";
	}

	protected String updateSql() {
		return "UPDATE enumDictionary SET (intKey, stringKey, value, enumerationName)=(?,?,?,?) WHERE id=?";
	}

	@Override
	protected void setUpdate(EnumDictionary entity) throws SQLException {
		update.setInt(1, entity.getIntKey());
		update.setString(2, entity.getStringKey());
		update.setString(3, entity.getValue());
		update.setString(4, entity.getEnumerationName());	
	}

	@Override
	protected void setInsert(EnumDictionary entity) throws SQLException {
		insert.setInt(1, entity.getIntKey());
		insert.setString(2, entity.getStringKey());
		insert.setString(3, entity.getValue());
		insert.setString(4, entity.getEnumerationName());
	}

	public List<EnumDictionary> withDictionaryName(String enumName) {
		List<EnumDictionary> result = new ArrayList<EnumDictionary>();
		try {
			selectWithDictionaryName.setString(1, enumName);
			ResultSet rs = selectWithDictionaryName.executeQuery();
			while (rs.next()) {
				result.add(mapper.map(rs));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public List<EnumDictionary> getEnumValues(String enumName, String stringKey) {
		List<EnumDictionary> result = new ArrayList<EnumDictionary>();
		try {
			getEnumValuesByString.setString(1, enumName);
			getEnumValuesByString.setString(2, stringKey);
			ResultSet rs = getEnumValuesByString.executeQuery();
			while (rs.next()) {
				result.add(mapper.map(rs));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public List<EnumDictionary> getEnumValues(String enumName, int intKey) {
		List<EnumDictionary> result = new ArrayList<EnumDictionary>();
		try {
			getEnumValuesByInt.setString(1, enumName);
			getEnumValuesByInt.setInt(2, intKey);
			ResultSet rs = getEnumValuesByString.executeQuery();
			while (rs.next()) {
				result.add(mapper.map(rs));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return result;
	}

}
