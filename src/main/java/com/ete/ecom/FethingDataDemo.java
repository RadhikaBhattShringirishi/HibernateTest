package com.ete.ecom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FethingDataDemo {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		 Session session = sessionFactory.openSession();
		 
//		 load is lazy
		 Student student = (Student)session.load(Student.class, 3 );
		 System.out.println(student);
		 
//		 getStudent of ID3... if Id not exist will give Object not found thts why its lazy loading
//		 Exception in thread "main" org.hibernate.ObjectNotFoundException: No row with the given identifier exists:
		 Address address = session.get(Address.class, 3);
		 System.out.println(address.getCity());
		 
//		 in case of get loading it will throw null value
		 session.close();
		 sessionFactory.close();
		 
		 

	}

}
