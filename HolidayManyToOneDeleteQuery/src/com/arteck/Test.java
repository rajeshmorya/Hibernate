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
		
		 Subdivision sub = (Subdivision)session.get(Subdivision.class, new Integer(504)); 
		 System.out.println(sub);
		 
		 Transaction tx = session.beginTransaction();
       session.delete(sub); 
 
		
		

/*		Division c = new Division();

		c.setDivisionid(101);
		c.setCircleid(201);
		c.setDivisionname("java4s");
		c.setDivisionaddress("shanti nagar");

		Subdivision c1 = new Subdivision();

		c1.setSubdivisionid(504);
		c1.setSubdivisionname("customer4");
		c1.setSubdivisionaddress("xyz address");
		c1.setDivision_iddivision(c);

		Transaction tx = session.beginTransaction();

		session.save(c1);*/

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		factory.close();
	}

}
