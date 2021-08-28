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
	public int getAnimals() {
		return pet_id;
	}
	public int getPet_id() {
		return pet_id;
	}

	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getPet_name() {
		return pet_name;
	}

	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImmunized() {
		return immunized;
	}

	public void setImmunized(String immunized) {
		this.immunized = immunized;
	}

	public String getDesexed() {
		return desexed;
	}

	public void setDesexed(String desexed) {
		this.desexed = desexed;
	}

	public java.sql.Date getIntake_date() {
		return intake_date;
	}

	public void setIntake_date(java.sql.Date intake_date) {
		this.intake_date = intake_date;
	}

	public AnimalsEntity(int pet_id, int location_id, String species, String pet_name, int age, String color,
			String gender) {
		
		this.pet_id = pet_id;
		this.location_id = location_id;
		this.species = species;
		this.pet_name = pet_name;
		this.age = age;
		this.color = color;
		this.gender = gender;
	
	}
	
	
}
