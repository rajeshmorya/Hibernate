package com.arteck;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Object o = session.get(Teacher.class, new Integer(101));
		Teacher v = (Teacher)o;

		Transaction tx = session.beginTransaction();
		session.delete(v);
		tx.commit();

		session.close();
		System.out.println("One To Many is Done for deleting..!!");
		factory.close();
	}

}
