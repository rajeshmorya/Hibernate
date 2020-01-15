package com.arteck;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		
		  Product v = new Product();
		  
		  v.setProductid(106); 
		  v.setProductname("java4s");
		  
		  Productfeature c1 = new Productfeature();
		  
		  c1.setProductfeatureid(5015); 
		  c1.setProductfeaturename("customer4");
		  
		  // one-to-many 
		  Set s = new HashSet();
		  
		  s.add(c1); 
		  
		  v.setChildren(s);
		  
		  // many-to-one
		  
		  c1.setParentObject(v);
		  
		  Transaction tx = session.beginTransaction();
		  
		  session.save(c1);
		 //session.save(v);
		  tx.commit();
		  
		  session.close();
		  System.out.println("One To Many Bi-Directional is Done..!!");
		  factory.close();
		 
	}

}
