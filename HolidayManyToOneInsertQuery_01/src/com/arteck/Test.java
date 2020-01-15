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

		Circle c = new Circle();

		c.setCircleid(101);
		c.setRegionid(201);
		c.setCirclename("java4s");
		c.setCircleaddress("shanti nagar");

		Division c1 = new Division();

		c1.setDivisionid(504);
		c1.setCircleid(601);
		c1.setDivisionname("rajesh");
		c1.setDivisionaddress("abc address");
		c1.setParentObject(c);

/*		Circle c2 = new Circle();

		c2.setCircleid(505);
		c2.setCirclename("customer5");
		c1.setCircleaddress("abc address");
		c2.setParentObject(c);

		Circle c3 = new Circle();

		c3.setCircleid(506);
		c3.setCirclename("customer6");
		c3.setCircleaddress("qwe address");
		c3.setParentObject(c);*/

		Transaction tx = session.beginTransaction();

		session.save(c1);
		//session.save(c2);
		//session.save(c3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		factory.close();
	}

}
