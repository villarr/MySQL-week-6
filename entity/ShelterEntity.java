package entity;

public class ShelterEntity {
	private int location_id;
	private String clinic_onsite;
	private int number_of_cats;
	private int number_of_dogs;
	
	public ShelterEntity(int location_id, String clinic_onsite, int number_of_cats, int number_of_dogs) {
		
		this.location_id = location_id;
		this.clinic_onsite = clinic_onsite;
		this.number_of_cats = number_of_cats;
		this.number_of_dogs = number_of_dogs;
	}

	public ShelterEntity(int int1, String string) {
		// TODO Auto-generated constructor stub
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getClinic_onsite() {
		return clinic_onsite;
	}

	public void setClinic_onsite(String clinic_onsite) {
		this.clinic_onsite = clinic_onsite;
	}

	public int getNumber_of_cats() {
		return number_of_cats;
	}

	public void setNumber_of_cats(int number_of_cats) {
		this.number_of_cats = number_of_cats;
	}

	public int getNumber_of_dogs() {
		return number_of_dogs;
	}

	public void setNumber_of_dogs(int number_of_dogs) {
		this.number_of_dogs = number_of_dogs;
	}
	
}
