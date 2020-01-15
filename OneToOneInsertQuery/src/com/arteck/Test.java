package com.arteck;

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

		Student s = new Student();
		s.setStudentid(102);
		s.setStudentname("java4s");

		Address ad = new Address();
		//ad.setAddressid(511);
		ad.setCity("Carry");
		ad.setState("NC");
		ad.setS(s);
		

		Transaction tx = session.beginTransaction();

		session.save(ad);

		tx.commit();

		session.close();
		System.out.println("One to One is Done..!!");
		factory.close();
	}

}
