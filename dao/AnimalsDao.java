package dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class AnimalsDao {

private Connection connection;
private final String GET_ANIMALS_QUERY = "SELECT * FROM animals";
private final String CREATE_ANIMALS_QUERY = "INSERT INTO animals VALUES(?,?,?,?,?,?,?,?,?,?)";
private Scanner sc = new Scanner(System.in)
;
public AnimalsDao() {
	connection = DBConnection.getConnection();
	
}

public void createAnimals () throws SQLException {
	
PreparedStatement ps = connection.prepareStatement(CREATE_ANIMALS_QUERY);
System.out.print("Enter a new pet id (int)");
Integer pet_id = Integer.parseInt(sc.nextLine());
ps.setInt(1,pet_id);

System.out.print("Enter a location id (int)");
ps.setInt(2,Integer.parseInt(sc.nextLine()));

System.out.print("Enter either cat or dog(String)");
ps.setString(3, sc.nextLine());

System.out.print("Enter the name of the pet (String)");
ps.setString(4, sc.nextLine());

System.out.print("Enter the pet's age (int)");
ps.setInt(5, Integer.parseInt(sc.nextLine()));

System.out.print("Enter the color of the pet");
ps.setString(6, sc.nextLine());

System.out.print("Enter the pet's gender - M or F");
ps.setString(7, sc.nextLine());

System.out.print("Enter the pet's gender - M or F");
ps.setString(8, sc.nextLine());

System.out.print("Desexed? Y/N");
ps.setString(9, sc.nextLine());

System.out.print("Intake Date (Year-Month-Day)");
ps.setDate(10, Date.valueOf(sc.nextLine()));

//System.out.print("Enter a new pet id (int)");
//Integer pet_id = Integer.parseInt(sc.nextLine());

System.out.print("Enter a location id (int)");
Integer locationId = Integer.parseInt(sc.nextLine());

System.out.print("Enter either cat or dog(String)");
String catOrDog = sc.nextLine();

System.out.print("Enter the name of the pet (String)");
String pname = sc.nextLine();

System.out.print("Enter the pet's age (int)");
Integer page = Integer.parseInt(sc.nextLine());

System.out.print("Enter the color of the pet");
String pcolor = sc.nextLine();

System.out.print("Enter the pet's gender - M or F");
String gender = sc.nextLine();

System.out.print("Immunized? Y/N");
String y_n = sc.nextLine();

System.out.print("Desexed? Y/N");
String y_n2 = sc.nextLine();

System.out.print("Intake Date (Year-Month-Day)");
String date = sc.nextLine();

int row = ps.executeUpdate();
System.out.println(row);

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
