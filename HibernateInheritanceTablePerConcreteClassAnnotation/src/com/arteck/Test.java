package com.arteck;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
//import org.hibernate.boot.Metadata;  
//import org.hibernate.boot.MetadataSources;  
//import org.hibernate.boot.registry.StandardServiceRegistry;  
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
import org.hibernate.cfg.Configuration;
  
public class Test {  
   
    public static void main(String[] args) {  
              
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession(); 
          
        Transaction t=session.beginTransaction();  
          
        Employee e1=new Employee();  
        e1.setname("Gaurav Chawla");  
          
        Regular_Employee e2=new Regular_Employee();  
        e2.setname("Vivek Kumar");  
        e2.setSalary(50000);  
        e2.setBonus(5);  
          
        Contract_Employee e3=new Contract_Employee();  
        e3.setname("Arjun Kumar");  
        e3.setPay_per_hour(1000);  
        e3.setContract_duration("15 hours");  
          
        session.persist(e1);  
        session.persist(e2);  
        session.persist(e3);  
          
        t.commit();  
        session.close();  
        System.out.println("success");        
    }   
} 