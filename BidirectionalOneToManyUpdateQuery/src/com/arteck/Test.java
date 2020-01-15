package com.arteck;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

		Object o = session.get(Building.class, 103);
		Building td = (Building) o;
		td.setBuildingname("India1");

		Object o1 = session.get(Flat.class, 509);
		Flat pd = (Flat) o1;
		pd.setFlatname("Shikhar");

		Transaction tx = session.beginTransaction();
		session.update(td);
		session.update(pd);

		tx.commit();

		/*
		 * Building v = new Building();
		 * 
		 * v.setBuildingid(104); v.setBuildingname("java4s");
		 * 
		 * Flat c1 = new Flat();
		 * 
		 * c1.setFlatid(510); c1.setFlatname("customer4");
		 * 
		 * // one-to-many Set s = new HashSet();
		 * 
		 * s.add(c1);
		 * 
		 * v.setChildren(s);
		 * 
		 * // many-to-one
		 * 
		 * c1.setParentObject(v);
		 * 
		 * Transaction tx = session.beginTransaction();
		 * 
		 * session.save(c1); //session.save(v); tx.commit();
		 */

		session.close();
		System.out.println("One To Many Bi-Directional is Done..!!");
		factory.close();
	}

}
