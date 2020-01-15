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
		
		Employee s1 = new Employee();
		s1.setEmployeeid(100);
		s1.setEmployename("James");

		Employee s2 = new Employee();
		s2.setEmployeeid(101);
		s2.setEmployename("Lee");


		Project c1 = new Project();
		c1.setProjectid(900);
		c1.setProjectname("Hibernate");

		Project c2 = new Project();
		c2.setProjectid(905);
		c2.setProjectname("Java");

		Set s = new HashSet();
		s.add(c1);
		s.add(c2);

		s1.setProject(s);
		s2.setProject(s);

		Transaction tx = session.beginTransaction();

		session.save(s1);
		session.save(s2);

		tx.commit();

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		factory.close();
	}

}
