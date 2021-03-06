package dao.repositories;

import java.util.List;

import Lalunaa.HamsterGym.EnumDictionary;

public interface IEnumDictionariesRepository extends IRepository<EnumDictionary>{

	public List<EnumDictionary> withDictionaryName(String enumName);
	public List<EnumDictionary> getEnumValues(String enumName, String stringKey);
	public List<EnumDictionary> getEnumValues(String enumName, int intKey);
}
