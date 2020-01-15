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
		
		  Object o = session.get(Role.class,101);
		  Role td = (Role)o;
		  td.setRolename("India12");
		  Transaction tx = session.beginTransaction();
		  session.update(td);
		
/*		Role c = new Role();

		c.setRoleid(101);
		c.setRolename("java4s");

		User_has_role c1 = new User_has_role();

		c1.setUser_has_roleid(504);
		c1.setRole_roleid(c);

		Transaction tx = session.beginTransaction();

		session.save(c1);*/

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		factory.close();
	}

}
