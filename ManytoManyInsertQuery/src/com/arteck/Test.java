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

		Student s1 = new Student();
		s1.setStudentid(100);
		s1.setStudentname("James");
		s1.setMarks(98);

		Student s2 = new Student();
		s2.setStudentid(101);
		s2.setStudentname("Lee");
		s2.setMarks(99);

		Course c1 = new Course();
		c1.setCourseid(500);
		c1.setCoursename("Hibernate");
		c1.setDuration(7);

		Course c2 = new Course();
		c2.setCourseid(501);
		c2.setCoursename("Java");
		c2.setDuration(30);

		Set s = new HashSet();
		s.add(c1);
		s.add(c2);

		s1.setCourse(s);
		s2.setCourse(s);

		Transaction tx = session.beginTransaction();

		session.save(s1);
		session.save(s2);

		tx.commit();

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		factory.close();
	}

}
