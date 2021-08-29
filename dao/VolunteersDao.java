package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class VolunteersDao {
	private Connection connection;
	private final String GET_VOLUNTEERS_QUERY = "SELECT * FROM volunteers";
	private final String CREATE_VOLUNTEERS_QUERY = "INSERT INTO volunteers (volunteer_id, location_id, first_name, last_name, phone_number,\n"
	+ "email, foster_dogs, foster_cats, current_foster_pets) VALUES(?,?,?,?,?,?,?,?,?)";
	private final String DELETE_VOLUNTEERS_QUERY = "DELETE from volunteers WHERE volunteer_id = ?"; 
	private Scanner sc = new Scanner(System.in);
	
	
	public VolunteersDao() {
		connection = DBConnection.getConnection();	
	}
	
	public void createVolunteers () throws SQLException {

		int n = 0; 

		PreparedStatement ps = connection.prepareStatement(CREATE_VOLUNTEERS_QUERY);

		System.out.println("Enter no. of volunteers to insert"); 
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			System.out.println("Enter a volunteer id > 100 (int)");
			Integer volunteerId = sc.nextInt();

			System.out.println("Enter a location id 1-10 (int)");
			Integer locationId = sc.nextInt();

			System.out.println("Enter their first name (String)");
			String fistName = sc.next();

			System.out.println("Enter their last name (String)");
			String lastName = sc.next();

			System.out.println("Enter their phone number 10 digits (held as string)");
			String phone = sc.next();

			System.out.println("Enter their email address with @ domain");
			String email = sc.next();

			System.out.println("Can foster dogs? Y/N");
			String dogs = sc.next();

			System.out.println("Can foster cats? Y/N");
			String cats = sc.next();

			System.out.println("Current amount of pets fostered?");
			Integer petCount = sc.nextInt();


		ps.setInt(1,volunteerId);
		ps.setInt(2,locationId);
		ps.setString(3, fistName);
		ps.setString(4, lastName);
		ps.setString(5, phone);
		ps.setString(6, email);
		ps.setString(7, dogs);
		ps.setString(8, cats);
		ps.setInt(9, petCount);
		}
		int rows = ps.executeUpdate();

		if (rows > 0) {
			System.out.println("New information has been added to the volunteers table. Thank you." + "\n");
		} else System.out.println("No records were updated.");
		}

		public void deleteVolunteers() throws SQLException {
			ResultSet rs = connection.prepareStatement(GET_VOLUNTEERS_QUERY).executeQuery();
			while (rs.next()) {
			System.out.println("volunteer id = " + rs.getInt(1) + " first name = " + rs.getString(3) + " last name = " 
			+ rs.getString(4));
			}
			System.out.println("\n");
			int n = 0; 

			PreparedStatement ps = connection.prepareStatement(DELETE_VOLUNTEERS_QUERY);

			System.out.println("Enter no. of volunteers to delete"); 
			n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.println("Enter a volunteer id to delete 1 - 100 (int)");
				Integer volunteer_id = sc.nextInt();
				ps.setInt(1,volunteer_id);
			}
			int rows = ps.executeUpdate();

			if (rows > 0) {
				System.out.println(n + " records have been deleted from the animals table." + "\n");
			} else System.out.println("No records were updated.");		
			
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
