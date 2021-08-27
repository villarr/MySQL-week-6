package application;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import dao.AnimalsDao;
import entity.AnimalsEntity;

public class Menu {
	private AnimalsDao animalDao;
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Dislay Animals",
			"Display Volunteers",
			"Display Fostering",
			"Display Shelter",
			"Create Animals",
			"Delete Animals",
			"Create Volunteers",
			"Delete Volunteers"
			);
	
	
	public void start() throws SQLException {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
		try {	
			if (selection.equals("1")) {
				displayAnimals();
				
			} else if (selection.equals("2")) {
				//displayVolunteers();
				
			} else if (selection.equals("3")) {
				//displayFostering();
				
			} else if (selection.equals("4")) {
				//displayShelter();
				
			} else if (selection.equals("5")) {
				//createAnimals();
				
			} else if (selection.equals("6")) {
				//deleteAnimals();
				
			} else if (selection.equals("7")) {
				//createVolunteers();
				
			} else if (selection.equals("7")) {
				//deleteVolunteers();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		} while (!selection.equals("-1"));
			System.out.println("Press enter to continue.....");
			scanner.nextLine();
			
	}	



private void printMenu () {
	System.out.println("Welcome to the Animal Shelter Database. Please make a selection........");
	for (int i = 0; i < options.size(); i ++) {
		System.out.println(i + 1 + ") " + options.get(i));
	}
}
private void displayAnimals() throws SQLException {
	List<AnimalsEntity> animals = animalDao.getAnimals();
	for (AnimalsEntity animal : animals) {
		System.out.println(animal.getPet_id() + ": " + animal.getPet_name());
	}
}
}
