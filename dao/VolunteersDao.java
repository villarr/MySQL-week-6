package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VolunteersDao {
	private Connection connection;
	private final String GET_VOLUNTEERS_QUERY = "SELECT * FROM volunteers";

	public VolunteersDao() {
		connection = DBConnection.getConnection();	
	}

	public void getVolunteers() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_VOLUNTEERS_QUERY).executeQuery();
		while (rs.next()) {
		System.out.println("volunteer id = " + rs.getInt(1) + " location = " + rs.getString(2)
		 + " first name = " + rs.getString(3) + " last name = " + rs.getString(4)
		 + " phone number = " + rs.getString(5) + " email = " + rs.getString(6) + "\n");
	}

	}
}
