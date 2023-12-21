package com.ete.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private int personId;
	
	private String personName;
    
	
//	changing column name..Unidirectional ways ...Person has passport
	@OneToOne
	@JoinColumn(name = "p_id")
	private Passport passport;


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(int personId, String personName, Passport passport) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.passport = passport;
	}


	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personId) {
		this.personId = personId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", passport=" + passport + "]";
	}
	
	

	
	
	

}
