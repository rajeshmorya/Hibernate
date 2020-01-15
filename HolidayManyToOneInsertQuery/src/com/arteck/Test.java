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

		Region c = new Region();

		c.setRegionid(101);
		c.setCompanyid(201);
		c.setRegionname("java4s");
		c.setRegionaddress("shanti nagar");

		Circle c1 = new Circle();

		c1.setCircleid(504);
		c1.setCirclename("customer4");
		c1.setCircleaddress("xyz address");
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
	//	session.save(c2);
		//session.save(c3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		factory.close();
	}

}
