package com.gabrielvillarreal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://localhost:3306/animals_shelter?serverTimezone=UTC";
		String SELECT_SHELTER_QUERY = "SELECT * FROM shelter WHERE number_of_cats >= ?";
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Connection conn = DriverManager.getConnection(connectionString, "henry", "henry");
			System.out.println("Connected Successfully");
			System.out.println("Please enter a number of cats you would like to adopt. /n We can help you find a location with enough cats to adopt : ");
			String NumCat = scanner.next();
			PreparedStatement ps = conn.prepareStatement(SELECT_SHELTER_QUERY);
			ps.setString(1, NumCat);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println("location id = " + rs.getInt(1) + " clinic onsite = " + rs.getString(2)
				 + " number of cats = " + rs.getInt(3) + " number of dogs = " + rs.getInt(4));
		}
			
		} catch (SQLException e) {
			System.out.println("Error Loading the Database");
			e.printStackTrace();
		}
				
	}

}
