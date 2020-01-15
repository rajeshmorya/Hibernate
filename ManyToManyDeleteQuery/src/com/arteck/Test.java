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
		
		Transaction tx = session.beginTransaction();
        User employee = (User)session.get(User.class,101);
       // employee.setGroup(null);
       // User e = (User)o;
        session.delete(employee); 
        tx.commit();

/*		User s1 = new User();
		s1.setUserid(100);
		s1.setUsername("James");

		User s2 = new User();
		s2.setUserid(101);
		s2.setUsername("Lee");


		Groups c1 = new Groups();
		c1.setGroupid(900);
		c1.setGroupname("Hibernate");

		Groups c2 = new Groups();
		c2.setGroupid(905);
		c2.setGroupname("Java");

		Set s = new HashSet();
		s.add(c1);
		s.add(c2);

		s1.setGroup(s);
		s2.setGroup(s);

		Transaction tx = session.beginTransaction();

		session.save(s1);
		session.save(s2);

		tx.commit();*/

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		factory.close();
		
	}

}
