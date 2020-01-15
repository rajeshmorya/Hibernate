package com.arteck;

import java.util.HashSet;
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
		
		Transaction tx = session.beginTransaction();
	     Book employee = (Book)session.get(Book.class,100); 
	     employee.setBookname("salary");
	     session.update(employee);
	     tx.commit();
		
/*		Book s1 = new Book();
		s1.setBookid(100);
		s1.setBookname("James");

		Book s2 = new Book();
		s2.setBookid(101);
		s2.setBookname("Lee");

		Publisher c1 = new Publisher();
		c1.setPublisherid(500);
		c1.setPublishername("Hibernate");

		Publisher c2 = new Publisher();
		c2.setPublisherid(501);
		c2.setPublishername("Java");

		Set s = new HashSet();
		s.add(c1);
		s.add(c2);

		s1.setPublisher(s);
		s2.setPublisher(s);

		Transaction tx = session.beginTransaction();

		session.save(s1);
		session.save(s2);

		tx.commit();*/

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		factory.close();
	}

}
