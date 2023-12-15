package com.ete.ecom;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started!!!!!" );
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println(sessionFactory);
//        System.out.println(sessionFactory.isClosed());
        
        //Creating Student Object
        Student std = new Student();
        
        std.setId(102);
        std.setName("SarRadhika");
        std.setCity("NoidaWest");
        
        System.out.println(std);
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        session.save(std);
         
        transaction.commit();
        
        session.close();
    }
}
