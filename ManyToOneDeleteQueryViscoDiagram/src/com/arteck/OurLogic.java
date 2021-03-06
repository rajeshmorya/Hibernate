package com.arteck;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Customer c = new Customer();

		c.setCustomerid(101);
		c.setCustomername("java4s");

		Order c1 = new Order();

		c1.setOrderid(504);
		c1.setOrdername("customer4");
		c1.setParentObject(c);

		Order c2 = new Order();

		c2.setOrderid(505);
		c2.setOrdername("customer5");
		c2.setParentObject(c);

		Order c3 = new Order();

		c3.setOrderid(506);
		c3.setOrdername("customer6");
		c3.setParentObject(c);

		Transaction tx = session.beginTransaction();

		session.save(c1);
		session.save(c2);
		session.save(c3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		factory.close();
	}

}
