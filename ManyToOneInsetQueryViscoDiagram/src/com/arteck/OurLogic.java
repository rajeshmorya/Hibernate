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

		Author c = new Author();

		c.setAuthorid(101);
		c.setAuthorname("java4s");

		Book c1 = new Book();

		c1.setBookid(504);
		c1.setBookname("customer4");
		c1.setParentObject(c);

		Book c2 = new Book();

		c2.setBookid(505);
		c2.setBookname("customer5");
		c2.setParentObject(c);

		Book c3 = new Book();

		c3.setBookid(506);
		c3.setBookname("customer6");
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
