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

		Object o = session.get(Company.class, new Integer(102));
		Company v = (Company)o;

		Transaction tx = session.beginTransaction();
		session.delete(v);
		tx.commit();
		
	/*	  Company v = new Company();
		  
		  v.setCompanyid(104); 
		  v.setCompanyname("java4s");
		  
		  Employee c1 = new Employee();
		  
		  c1.setEmployeeid(507); 
		  c1.setEmployename("customer4");
		  
		  // one-to-many 
		  Set s = new HashSet();
		  
		  s.add(c1); 
		  
		  v.setChildren(s);
		  
		  // many-to-one
		  
		  c1.setParentObject(v);
		  
		  Transaction tx = session.beginTransaction();
		  
		 // session.save(c1);
		 session.save(v);
		  tx.commit();*/
		  
		  session.close();
		  System.out.println("One To Many Bi-Directional is Done..!!");
		  factory.close();
	}

}
