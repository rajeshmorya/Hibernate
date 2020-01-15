package com.arteck.mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		    Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml"); 

			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			 Employee e1=new Employee(); 

			 e1.setId(7);    
			 e1.setFirstname("Gaurav");    
			 e1.setLastname("Chawla"); 

			Transaction tx = session.beginTransaction();
			session.save(e1);
			System.out.println("Object saved successfully.....!!");
			tx.commit();
			session.close();
			factory.close();
		        
		} 
	}

