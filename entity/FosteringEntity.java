package entity;

import java.sql.Date;

public class FosteringEntity {
	private int fostering_id;
	private int pet_id;
	private int volunteer_id;
	private Date foster_date;


public FosteringEntity(int fostering_id, int pet_id, int volunteer_id, Date foster_date) {
	this.fostering_id = fostering_id;
	this.pet_id = pet_id;
	this.volunteer_id = volunteer_id;
	this.foster_date = foster_date;
}

public int getFostering_id() {
	return fostering_id;
}

public void setFostering_id(int fostering_id) {
	this.fostering_id = fostering_id;
}

public int getPet_id() {
	return pet_id;
}

public void setPet_id(int pet_id) {
	this.pet_id = pet_id;
}

public int getVolunteer_id() {
	return volunteer_id;
}

public void setVolunteer_id(int volunteer_id) {
	this.volunteer_id = volunteer_id;
}
public Date getFoster_date() {
	return foster_date;
}

public void setFoster_date(Date foster_date) {
	this.foster_date = foster_date;
}

}