package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FosteringDao {
	
	private Connection connection;
	private final String GET_FOSTER_QUERY = "SELECT * FROM fostering";

	public FosteringDao() {
		connection = DBConnection.getConnection();	
	}

	public void getFostering() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_FOSTER_QUERY).executeQuery();
		while (rs.next()) {
		System.out.println("Fostering id = " + rs.getInt(1) + " Pet ID = " + rs.getInt(2)
		 + " Volunteer ID = " + rs.getInt(3) + " Foster Date = " + rs.getDate(4) + "\n");
	}

	}
}