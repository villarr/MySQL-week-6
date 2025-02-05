package application;
import java.sql.SQLException;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import dao.AnimalsDao;
import dao.FosteringDao;
import dao.VolunteersDao;
import dao.ShelterDao;

//@villarr - insances of the Dao classes. Important to create instances to avoid null pointer errors when calling methods. 
public class Menu {
	private AnimalsDao animalDao = new AnimalsDao();
	private VolunteersDao volunteerDao = new VolunteersDao();
	private ShelterDao shelterDao = new ShelterDao();
	private FosteringDao fosterDao = new FosteringDao();
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
	
	//@villarr - start method for application using if else loop. Thank you Nick S. for the helpful videos.
	
	public void start() throws SQLException {
		String selection = "";
	
	//@villarr - CRUD methods by entity depending on the selection made by the user.
		
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
			animalDao.deleteAnimals();
			System.out.println("\n");
			
		} else if (selection.equals("7")) {
			volunteerDao.createVolunteers();
			System.out.println("\n");
			
		} else if (selection.equals("8")) {
			volunteerDao.deleteVolunteers();
			System.out.println("\n");
			
		} else if (selection.equals("9")) {
			animalDao.updateAnimals();
			System.out.println("\n");
			
		} else if (selection.equals("10")) {
			volunteerDao.updateVolunteers();
			System.out.println("\n");
		}
			
		} while (!selection.equals("-1"));
			System.out.println("Press enter to continue.....");
			scanner.nextLine();
			start();
	}

//@villarr - initial welcome message in the application.
	
private void printMenu () {
	System.out.println("Welcome to the Animal Shelter Database. Please make a selection...");
	for (int i = 0; i < options.size(); i ++) {
		System.out.println(i + 1 + ") " + options.get(i));
	}
}
}

