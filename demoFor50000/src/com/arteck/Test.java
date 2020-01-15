package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
		
		long f = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		Query qur = session.createQuery("from User");
		List l = qur.list();
		System.out.println("Total record"+l.size());
		Iterator it = l.iterator();
		while(it.hasNext()) 
		{
			Object o = (Object)it.next();
			User p = (User)o;
			System.out.println(p.getUserid());
			System.out.println(p.getUsername());
			System.out.println(p.getUserrole());
			
		}
		System.out.println(System.currentTimeMillis());
		long la = System.currentTimeMillis();
		System.out.println("Total record in time"+(la-f));
		
		
		
/*		for(int i=31433;i<=51000;i++) {
		
		User u = new User();
		u.setUserid(i);
		u.setUsername("test");
		u.setUserrole("admin");
		
		Transaction tx = session.beginTransaction();
		session.save(u);
		
		tx.commit();
		}	*/
	}

}
