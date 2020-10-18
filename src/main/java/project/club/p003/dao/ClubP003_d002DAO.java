package project.club.p003.dao;

import java.util.Map;

public interface ClubP003_d002DAO {
	public void joinClub(Map<String, Object> insertMap);
	public void leaveClub(Map<String, Object> deleteMap);
	public void reportClub(Map<String, Object> insertMap);
}
