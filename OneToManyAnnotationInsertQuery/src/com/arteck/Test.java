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

	      Vendor v=new Vendor();
	      v.setVendorid(100);
	      v.setVendorname("java4s");

	      Customer c1=new Customer();
	      c1.setCustomerid(500);
	      c1.setCustomername("customer1");

	      Customer c2=new Customer();
	      c2.setCustomerid(501);
	      c2.setCustomername("customer2");

	      Set s=new HashSet();
	      s.add(c1);
	      s.add(c2);

	      v.setChildren(s);

	      Transaction tx=session.beginTransaction();
	      session.save(v);
	      tx.commit();

		session.close();
		System.out.println("One to Many Annotatios Done...!!!!!!");
		factory.close();
	}

}
