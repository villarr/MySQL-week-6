package dao;

import entity.ShelterEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShelterDao {
	
	private Connection connection;
	
	private final String GET_ANIMALS_BY_LOCATION_ID = "SELECT * FROM animals WHERE location ID = ?";
	
	public ShelterDao() {
		
	}
	public List<ShelterEntity> getAnimalsByLocationID(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_ANIMALS_BY_LOCATION_ID);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		List<ShelterEntity> shelter = new ArrayList<ShelterEntity>();
		while (rs.next()) {
		shelter.add(new ShelterEntity (rs.getInt(1), rs.getString(2)));	
		}
		return shelter;
	}

}
