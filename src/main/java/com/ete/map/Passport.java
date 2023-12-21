package com.ete.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "passport_id")
	private int passportId;
	
	private String passportDetails;
	
//	Birectional ways
	
	@OneToOne(mappedBy = "passport")
	private Person person;

	public Passport(int passportId, String passportDetails, Person person) {
		super();
		this.passportId = passportId;
		this.passportDetails = passportDetails;
		this.person = person;
	}

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportDetails() {
		return passportDetails;
	}

	public void setPassportDetails(String passportDetails) {
		this.passportDetails = passportDetails;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportDetails=" + passportDetails + ", person=" + person
				+ "]";
	}

    
	

	
	
	
	}
