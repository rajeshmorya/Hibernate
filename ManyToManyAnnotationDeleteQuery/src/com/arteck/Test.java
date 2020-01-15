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
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Object o = session.get(Stock.class, new Integer(101));
		Stock v = (Stock)o;

		Transaction tx = session.beginTransaction();
		session.delete(v);
		
/*		Stock s = new Stock();
		s.setStockid(101);
		s.setStockname("rajesh");
		
		Stock s1= new Stock();
		s1.setStockid(102);
		s1.setStockname("morya");
		
		Category c = new Category();
		c.setCatid(501);
		c.setCatname("test");
		
		Category c1 = new Category();
		c1.setCatid(502);
		c1.setCatname("test1");
		
		Set ss = new HashSet();
		ss.add(c);
		ss.add(c1);
		
		s.setCategory(ss);
		s1.setCategory(ss);
		
		Transaction tx = session.beginTransaction();
		session.save(s);
		session.save(s1);*/
		tx.commit();
		session.close();
		factory.close();
	}

}
