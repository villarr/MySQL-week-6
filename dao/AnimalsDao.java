package dao;
import entity.AnimalsEntity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class AnimalsDao {

private Connection connection;
private ShelterDao shelterDao;
private final String GET_ANIMALS_QUERY = "SELECT * FROM animals";

	
public AnimalsDao() {
	connection = DBConnection.getConnection();
}

public List<AnimalsEntity> getAnimals() throws SQLException {
	ResultSet rs = connection.prepareStatement(GET_ANIMALS_QUERY).executeQuery();
	List<AnimalsEntity> animals = new ArrayList<AnimalsEntity>();
	
	while (rs.next()) {
		animals.add(populateAnimals(rs.getInt(1),(rs.getString(4))));
	}
	return animals;
}
private AnimalsEntity populateAnimals (int id, String name) throws SQLException {
	return new AnimalsEntity(id, name, shelterDao.getAnimalsByLocationID(id));
}
}
