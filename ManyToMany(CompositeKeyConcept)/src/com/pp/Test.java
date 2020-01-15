package com.pp;

import java.util.HashSet;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session se = sf.openSession();
		
		Employees e = new Employees();
		e.setEmpId(101);
		e.setEmpName("shashank");
		
		Employees e1 = new Employees();
		e1.setEmpId(102);
		e1.setEmpName("Anurag");
		
		Certificates c = new Certificates();
		c.setCerNo(4568);
		c.setCerName("java");

		Certificates c1 = new Certificates();
		c1.setCerNo(1234);
		c1.setCerName("sql");
		
		Set s = new HashSet();
		
		s.add(c);
		s.add(c1);
		
		e.setCertificates(s);
		e1.setCertificates(s);
		
		Transaction tx = se.beginTransaction();
		
		se.save(e);
		se.save(e1);
		
		tx.commit();
		se.close();
		sf.close();

	}

}
