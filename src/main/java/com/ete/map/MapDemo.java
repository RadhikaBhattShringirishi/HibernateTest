package com.ete.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		// creating Person Object
		
		Person person = new Person();
		person.setPersonId(4);;
		person.setPersonName("JankiMata");
		
		Passport passport = new Passport();
		passport.setPassportId(104);;
		passport.setPassportDetails("Janki129");
		passport.setPerson(person);
		person.setPassport(passport);
		
		
		// Creating Person1 Object
		
		Person person1 = new Person();
		person1.setPersonId(5);;
		person1.setPersonName("Mata");
		
//		creating Passport object
		
		Passport passport1 = new Passport();
		passport1.setPassportId(105);;
		passport1.setPassportDetails("Mata1257");
		passport1.setPerson(person1);
		person1.setPassport(passport1);
		
		
		//session Stage
		
	    Session session = sessionFactory.openSession();
	       
	    Transaction transaction = session.beginTransaction();
	       
	    session.save(person);
	    session.save(person1);
	    session.save(passport);
	    session.save(passport1);
	         
	    transaction.commit();
	    
	    Person newPerson = session.get(Person.class, 1);
	    System.out.println(newPerson.getPersonName());
	    System.out.println(newPerson.getPassport().getPassportDetails());
	       
	    session.close();
		
		
	}

}
