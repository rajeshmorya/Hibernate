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
		
		 Distcenter_zone sub = (Distcenter_zone)session.get(Distcenter_zone.class, new Integer(504)); 
		 System.out.println(sub);
		 
		 Transaction tx = session.beginTransaction();
       session.delete(sub); 
 
/*		Subdivision c = new Subdivision();

		c.setSubdivisionid(101);
		c.setDivisionid(201);
		c.setSubdivisionname("java4s");
		c.setSubdivisionaddress("shanti nagar");

		Distcenter_zone c1 = new Distcenter_zone();

		c1.setDistcenter_zoneid(504);
		c1.setDistcenter_zonename("customer4");
		c1.setDistcenter_zoneaddress("xyz address");
		c1.setSubdivision_subdivisionid(c);

		Transaction tx = session.beginTransaction();

		session.save(c1);*/

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		factory.close();
	}

}
