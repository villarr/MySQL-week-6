package dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class AnimalsDao {

private Connection connection;
private final String GET_ANIMALS_QUERY = "SELECT * FROM animals";
private final String CREATE_ANIMALS_QUERY = "INSERT INTO animals (pet_id, location_id, species, pet_name, age,\n"
+ "color, gender, immunized, desexed, intake_date) VALUES(?,?,?,?,?,?,?,?,?,?)";
private final String DELETE_ANIMALS_QUERY = "DELETE from animals WHERE pet_id = ?"; 
private Scanner sc = new Scanner(System.in);

public AnimalsDao() {
	connection = DBConnection.getConnection();
	
}
public void createAnimals () throws SQLException {

int n = 0; 

PreparedStatement ps = connection.prepareStatement(CREATE_ANIMALS_QUERY);

System.out.println("Enter no. of animals to insert"); 
n = sc.nextInt();

for (int i = 1; i <= n; i++) {
	
	System.out.println("Enter a new pet id > 1000 (int)");
	Integer pet_id = sc.nextInt();

	System.out.println("Enter a location id 1-10(int)");
	Integer locationId = sc.nextInt();

	System.out.println("Enter either cat or dog(String)");
	String catOrDog = sc.next();

	System.out.println("Enter the name of the pet (String)");
	String name = sc.next();

	System.out.println("Enter the pet's age (int)");
	Integer age = sc.nextInt();

	System.out.println("Enter the color of the pet");
	String color = sc.next();

	System.out.println("Enter the pet's gender - male or female");
	String gender = sc.next();

	System.out.println("Immunized? Y/N");
	String y_n = sc.next();

	System.out.println("Desexed? Y/N");
	String y_n2 = sc.next();

	System.out.println("Intake Date (Year-Month-Day)");
	Date date = Date.valueOf(sc.next());

ps.setInt(1,pet_id);
ps.setInt(2,locationId);
ps.setString(3, catOrDog);
ps.setString(4, name);
ps.setInt(5, age);
ps.setString(6, color);
ps.setString(7, gender);
ps.setString(8, y_n);
ps.setString(9, y_n2);
ps.setDate(10, date);
}
int rows = ps.executeUpdate();

if (rows > 0) {
	System.out.println("New information has been added to the animals table. Thank you." + "\n");
} else System.out.println("No records were updated.");
}

public void deleteAnimals() throws SQLException {
	ResultSet rs = connection.prepareStatement(GET_ANIMALS_QUERY).executeQuery();
	while (rs.next()) {
	System.out.println("pet id = " + rs.getInt(1) + " pet name = " + rs.getString(4));
	}
	System.out.println("\n");
	int n = 0; 

	PreparedStatement ps = connection.prepareStatement(DELETE_ANIMALS_QUERY);

	System.out.println("Enter no. of animals to delete"); 
	n = sc.nextInt();

	for (int i = 1; i <= n; i++) {
		System.out.println("Enter a pet id to delete 1 - 1000 (int)");
		Integer pet_id = sc.nextInt();
		ps.setInt(1,pet_id);
	}
	int rows = ps.executeUpdate();

	if (rows > 0) {
		System.out.println(n + " records have been deleted from the animals table." + "\n");
	} else System.out.println("No records were updated.");		
	
}
public void getAnimals() throws SQLException {
	ResultSet rs = connection.prepareStatement(GET_ANIMALS_QUERY).executeQuery();
	while (rs.next()) {
	System.out.println("pet id = " + rs.getInt(1) + " location = " + rs.getString(2)
	 + " species = " + rs.getString(3) + " pet name = " + rs.getString(4)
	 + " age = " + rs.getInt(5) + " color = " + rs.getString(6) + "\n");
}

}
}
