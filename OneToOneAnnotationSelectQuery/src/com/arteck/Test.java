package com.arteck;

import java.util.Iterator;
import java.util.List;
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
		
	      // Transaction tx = session.beginTransaction();
	        List account = session.createQuery("FROM profile").list(); 
	        for (Iterator iterator = account.iterator(); iterator.hasNext();){
	           profile acc = (profile) iterator.next(); 
	           System.out.print("First Name: " + acc.getPid()); 
	           System.out.print("  Last Name: " + acc.getPname()); 
	        }
		
		
/*		profile p = new profile();
		p.setPid(101);
		p.setPname("rajesh");
		
		user u = new user();
		u.setUserid(201);
		u.setUsername("test");
		
		u.setParent(p);
		Transaction tx = session.beginTransaction();
		session.save(u);
		tx.commit();*/
		session.close();
		factory.close();
		
	}

}
