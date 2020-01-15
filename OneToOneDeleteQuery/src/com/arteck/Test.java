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
		
		Object o = session.get(Country.class, new Integer(102));
		Country v = (Country)o;

		Transaction tx = session.beginTransaction();
		session.delete(v);
		tx.commit();

	/*	Country s = new Country();
		s.setCountryid(102);
		s. setCountryname("java4s");

		Capital ad = new Capital();
		ad.setCapitalid(511);
		ad.setCapitalname("Carry");
		ad.setC(s);
		
		Transaction tx = session.beginTransaction();

		session.save(ad);

		tx.commit();*/

		session.close();
		System.out.println("One to One is Done..!!");
		factory.close();
	}

}
