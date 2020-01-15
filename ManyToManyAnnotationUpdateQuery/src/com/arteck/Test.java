package com.arteck;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Object o = session.get(Customer.class, 101);
		Customer td = (Customer) o;
		td.setCustomername("rajesh1");

		Transaction tx = session.beginTransaction();

		session.update(td);
		//tx.commit();

		/*
		 * Customer c = new Customer(); c.setCustomerid(101);
		 * c.setCustomername("rajesh");
		 * 
		 * Customer c1 = new Customer(); c1.setCustomerid(102);
		 * c1.setCustomername("morya");
		 * 
		 * Item i = new Item(); i.setItemid(501); i.setItemname("test");
		 * 
		 * Item i1 = new Item(); i1.setItemid(502); i1.setItemname("test1");
		 * 
		 * Set s = new HashSet(); s.add(i); s.add(i1);
		 * 
		 * c.setItem(s); c1.setItem(s); Transaction tx = session.beginTransaction();
		 * session.save(c); session.save(c1);
		 */
		tx.commit();
		factory.close();
		session.close();

	}

}
