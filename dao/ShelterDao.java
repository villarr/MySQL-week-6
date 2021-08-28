package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShelterDao {
	
	private Connection connection;
	
	public ShelterDao(Connection connection) {
		this.connection = connection;
	}

	private String sql = "SELECT * FROM animals";
	
	public ShelterDao() {
		
	}
	public ShelterDao(Integer id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(sql);
		while (rs.next()) {
		System.out.println("field 1 = " + (rs.getInt(1)) + (rs.getString(2)));	
		}
	}

public static void main(String[] args) throws SQLException {
	
}
}