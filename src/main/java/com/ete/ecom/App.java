package com.ete.ecom;

import java.io.FileInputStream;
import java.io.IOException;
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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "project started!!!!!" );
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        System.out.println(sessionFactory);
//        System.out.println(sessionFactory.isClosed());
        
        //Creating Student Object
        Student std = new Student();
        
        std.setId(2);
        std.setName("BhaJi");
        std.setCity("NoidaJi");
        
        System.out.println(std);
        
        //Creating Address Object
        
        Address ad = new Address();
        ad.setAddressId(201);
        ad.setCity("Delhi");
        ad.setCreatedAt(new Date());
        
        //ReadImage Data
        
        FileInputStream fis = new FileInputStream("src/main/java/pic.png");
        byte [] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        
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
