package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AnimalsDao {

private Connection connection;
private final String GET_ANIMALS_QUERY = "SELECT * FROM animals";

public AnimalsDao() {
	connection = DBConnection.getConnection();
	
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
