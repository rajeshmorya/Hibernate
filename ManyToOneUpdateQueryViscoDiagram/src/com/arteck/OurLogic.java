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
		
		  Object o = session.get(Project.class,101);
		  Project td = (Project)o;
		  td.setProjectname("India1");
		  Transaction tx = session.beginTransaction();
		  session.update(td);
		  tx.commit();

/*		Project v = new Project();

		v.setProjectid(101);
		v.setProjectname("java4s");

		Developer c1 = new Developer();

		c1.setDeveloperid(504);
		c1.setDevelopername("customer4");
		c1.setParentObject(v);

		Developer c2 = new Developer();

		c2.setDeveloperid(505);
		c2.setDevelopername("customer5");
		c2.setParentObject(v);

		Developer c3 = new Developer();

		c3.setDeveloperid(506);
		c3.setDevelopername("customer6");
		c3.setParentObject(v);

		Transaction tx = session.beginTransaction();

		session.save(c1);
		session.save(c2);
		session.save(c3);

		tx.commit();*/
		session.close();
		System.out.println("Many to one is Done..!!");
		factory.close();
	}

}
