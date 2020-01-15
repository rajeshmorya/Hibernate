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
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Student s = new Student();
		s.setStudentid(1);
		s.setStudentname("rajesh");
		
		Student s1 = new Student();
		s1.setStudentid(2);
		s1.setStudentname("morya");
		
		Course c = new Course();
		c.setCourseid(1);
		c.setCoursename("mca");
		
		Course c1 = new Course();
		c1.setCourseid(2);
		c1.setCoursename("bsc");
		
		Set ss = new HashSet();
		ss.add(c);
		ss.add(c1);
		
		s.setCourse(ss);
		s1.setCourse(ss);
		
		Transaction t = session.beginTransaction();
		session.save(s);
		session.save(s1);
		t.commit();
		session.close();
		factory.close();
		
		
		
	}

}
