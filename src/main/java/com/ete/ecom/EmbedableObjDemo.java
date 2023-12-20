package com.ete.ecom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedableObjDemo {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		//Creating Student Object
        Student std1 = new Student();
        std1.setId(1001);
        std1.setName("Radha");
        std1.setCity("Jhansi");
        
        //Creating Certification Objects
        
        Certification certification1 = new Certification();
        certification1.setCourseName("Java");
        certification1.setCourseDuration("3 months");
        
        std1.setCertification(certification1);
        
        Student std2 = new Student();
        std2.setId(1002);
        std2.setName("RadhaRani");
        std2.setCity("JhansiKiRani");
        
        //Creating Certification Objects
        
        Certification certification2 = new Certification();
        certification2.setCourseName("JavaBackend");
        certification2.setCourseDuration("5 months");
        
        std2.setCertification(certification2);
        
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.save(std1);
        session.save(std2);
          
        transaction.commit();
        
        session.close();
        
        sessionFactory.close();
        
        
	}

}
