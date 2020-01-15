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
		
		Object o = session.get(Detail.class, new Integer(501));
		Detail v = (Detail)o;

		Transaction tx = session.beginTransaction();
		session.delete(v);
		tx.commit();
		
/*		Book b = new Book();
		b.setBookid(101);
		b.setBookname("rajesh");
		
		Detail d = new Detail();
		d.setDetailid(501);
		d.setDetailname("test");
		
		d.setParentobject(b);
		
		Transaction tx = session.beginTransaction();
		session.save(d);
		tx.commit();*/
		session.close();
		factory.close();
		
	}

}
