package entity;

public class VolunteersEntity {
	private int volunteer_id;
	private int location_id;
	private String first_name;
	private String last_name;
	private int phone_number;
	private String email;
	private String foster_dogs;
	private String foster_cats;
	private int current_foster_pets;
	
	public VolunteersEntity(int volunteer_id, int location_id, String first_name, String last_name, int phone_number,
			String email, String foster_dogs, String foster_cats, int current_foster_pets) {
		this.volunteer_id = volunteer_id;
		this.location_id = location_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.email = email;
		this.foster_dogs = foster_dogs;
		this.foster_cats = foster_cats;
		this.current_foster_pets = current_foster_pets;
	}

	public int getVolunteer_id() {
		return volunteer_id;
	}

	public void setVolunteer_id(int volunteer_id) {
		this.volunteer_id = volunteer_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoster_dogs() {
		return foster_dogs;
	}

	public void setFoster_dogs(String foster_dogs) {
		this.foster_dogs = foster_dogs;
	}

	public String getFoster_cats() {
		return foster_cats;
	}

	public void setFoster_cats(String foster_cats) {
		this.foster_cats = foster_cats;
	}

	public int getCurrent_foster_pets() {
		return current_foster_pets;
	}

	public void setCurrent_foster_pets(int current_foster_pets) {
		this.current_foster_pets = current_foster_pets;
	}
	
	
	
}
