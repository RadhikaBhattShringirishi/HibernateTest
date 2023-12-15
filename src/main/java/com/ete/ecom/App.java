package com.ete.ecom;

import java.util.Date;

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
        
        std.setId(103);
        std.setName("SarBhatt");
        std.setCity("NoidaWestGreater");
        
        System.out.println(std);
        
        //Creating Address Object
        
        Address ad = new Address();
        ad.setAddressId(2);
        ad.setCity("NoidaWest");
        ad.setCreatedAt(new Date());
//        ad.setImage();
        ad.setOpen(true);
        ad.setStreet("B324,Noida,Greater Noida West");
        ad.setXyz(123.678);
        
        System.out.println(ad);
       
      
        
       Session session = sessionFactory.openSession();
       
       Transaction transaction = session.beginTransaction();
       
       session.save(std);
       session.save(ad);
         
       transaction.commit();
       
     session.close();
    }
}
