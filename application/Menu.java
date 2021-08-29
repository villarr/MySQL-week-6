package application;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import dao.AnimalsDao;
import dao.VolunteersDao;
import dao.ShelterDao;
import dao.FosteringDao;

public class Menu {
	private AnimalsDao animalDao = new AnimalsDao();
	private VolunteersDao volunteerDao = new VolunteersDao();
	private FosteringDao fosterDao = new FosteringDao();
	private ShelterDao shelterDao = new ShelterDao();
	private Scanner scanner = new Scanner(System.in);
	
	private List<String> options = Arrays.asList(
			"Dislay Animals",
			"Display Volunteers",
			"Display Fostering",
			"Display Shelter",
			"Create Animals",
			"Delete Animals",
			"Create Volunteers",
			"Delete Volunteers",
			"Update Animals",
			"Update Volunteers"
			);
	
	
	public void start() throws SQLException {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
		if (selection.equals("1")) {
			animalDao.getAnimals();
			System.out.println("\n");
			
		} else if (selection.equals("2")) {
			volunteerDao.getVolunteers();
			System.out.println("\n");
			
		} else if (selection.equals("3")) {
			fosterDao.getFostering();
			System.out.println("\n");
			
		} else if (selection.equals("4")) {
			shelterDao.getShelter();
			System.out.println("\n");
			
		} else if (selection.equals("5")) {
			animalDao.createAnimals();
			System.out.println("\n");
		
		} else if (selection.equals("6")) {
			//deleteAnimals();
			
		} else if (selection.equals("7")) {
			//createVolunteers();
			
		} else if (selection.equals("8")) {
			//deleteVolunteers();
			
		} else if (selection.equals("9")) {
			//updateAnimals();
			
		} else if (selection.equals("10")) {
			//updateVolunteers();
		}
			
		} while (!selection.equals("-1"));
			System.out.println("Press enter to continue.....");
			scanner.nextLine();
			start();
	}
	
private void printMenu () {
	System.out.println("Welcome to the Animal Shelter Database. Please make a selection...");
	for (int i = 0; i < options.size(); i ++) {
		System.out.println(i + 1 + ") " + options.get(i));
	}
}
}

