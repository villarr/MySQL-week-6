package com.gabrielvillarreal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {

	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://localhost:3306/animals_shelter?serverTimezone=UTC";
		final String SELECT_SHELTER_QUERY = "SELECT * FROM shelter";
		try {
			Connection conn = DriverManager.getConnection(connectionString, "henry", "henry");
			System.out.println("Connected Successfully");
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(SELECT_SHELTER_QUERY);
			
			while (rs.next()) {
				System.out.println("shelter id = " + rs.getInt(1));
		}
			
		} catch (SQLException e) {
			System.out.println("Error Loading the Database");
			e.printStackTrace();
		}
				
	}

}
