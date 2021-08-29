package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShelterDao {
	
	private Connection connection;
	private final String GET_SHELTER_QUERY = "SELECT * FROM shelter";

	public ShelterDao() {
		connection = DBConnection.getConnection();	
	}
	// @villarr - method for reading the shelter table data.
	public void getShelter() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_SHELTER_QUERY).executeQuery();
		while (rs.next()) {
		System.out.println("Location id = " + rs.getInt(1) + " Clinic Onsite (Y/N) = " + rs.getString(2)
		 + " Number of Cats = " + rs.getInt(3) + " Number of Dogs = " + rs.getInt(4) + "\n");
	}

	}
}