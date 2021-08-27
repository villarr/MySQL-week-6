package entity;

import java.sql.Date;

public class AnimalsEntity {
	private int pet_id;
	private int location_id;
	private String species;
	private String pet_name;
	private int age;
	private String color;
	private String gender;
	private String immunized;
	private String desexed;
	private java.sql.Date intake_date;
	
	public AnimalsEntity(int pet_id, int location_id, String species, String pet_name, int age, String color,
			String gender, String immunized, String desexed, Date intake_date) {
		this.pet_id = pet_id;
		this.location_id = location_id;
		this.species = species;
		this.pet_name = pet_name;
		this.age = age;
		this.color = color;
		this.gender = gender;
		this.immunized = immunized;
		this.desexed = desexed;
		this.intake_date = intake_date;
	}

	public AnimalsEntity(int pet_id, int location_id, String species, String pet_name, int age, String color,
			String gender) {
		super();
		this.pet_id = pet_id;
		this.location_id = location_id;
		this.species = species;
		this.pet_name = pet_name;
		this.age = age;
		this.color = color;
		this.gender = gender;
	}
	
	
}
