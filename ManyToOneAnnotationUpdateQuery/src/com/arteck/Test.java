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
		
		  Object o = session.get(Vendor.class,100);
		  Vendor td = (Vendor)o;
		  td.setVendorName("India12");
		  Transaction tx = session.beginTransaction();
		  session.update(td);

/*		Vendor v = new Vendor();

		v.setVendorId(100);
		v.setVendorName("java4s6");

		Customers c1 = new Customers();

		c1.setCustomerId(504);
		c1.setCustomerName("customer4");
		c1.setParent(v);

		Customers c2 = new Customers();

		c2.setCustomerId(505);
		c2.setCustomerName("customer5");
		c2.setParent(v);

		Customers c3 = new Customers();

		c3.setCustomerId(506);
		c3.setCustomerName("customer6");
		c3.setParent(v);

		Transaction tx = session.beginTransaction();

		// session.save(v);
		session.save(c2);
		session.save(c2);
		session.save(c3);*/

		tx.commit();
		session.close();
		System.out.println("Many to One with annotation done...!!");
		factory.close();
	}

}
