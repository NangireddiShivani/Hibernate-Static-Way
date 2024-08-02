package com.example.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.id.uuid.StandardRandomStrategy;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       Configuration conn=new Configuration().configure("hibernate.cfg.xml");
////       connection from database
//       SessionFactory sf=conn.buildSessionFactory();
////       database created
//       Session s=sf.openSession();
////       database open
//       s.beginTransaction();
////       create tables
//       s.save(s);
////       data insert
//       s.getTransaction().commit();
////   output
    	
    	
    	
    	
    	
//    	Configuration conn=new Configuration().configure("hibernate.cfg.xml");
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
    	Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory sf=md.buildSessionFactory();
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	hibernate h=new hibernate();
    	h.setName("shivani");
    	h.setEmail("shivani@123");
    	h.setPassword("shiv");
    	s.save(h);
    	t.commit();
    	System.out.println("data inserted successfully");
    	sf.close();
    	s.close();
    	
       
       
    }
}
