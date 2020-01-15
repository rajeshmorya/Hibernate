package com.arteck;

import java.util.HashSet;
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
		
		Cart c = new Cart();
		c.setCartid(101);
		c.setCartname("rajesh");
		
		Item i = new Item();
		i.setItemid(501);
		i.setItemname("itemnames");
		
		Item i1 = new Item();
		i1.setItemid(502);
		i1.setItemname("itemnames1");
		
		Set s = new HashSet();
		s.add(i);
		s.add(i1);
		
		c.setChildren(s);
		
		Transaction tx = session.beginTransaction();
		session.save(c);
		tx.commit();
		session.close();
		factory.close();
		
		
		
	}

}
