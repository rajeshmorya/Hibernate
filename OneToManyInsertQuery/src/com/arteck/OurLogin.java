package com.arteck;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class OurLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//parent object
		Vendor v =new Vendor();

		v.setVendorid(101);
		v.setVendorname("java4s");

		//creating 3 child objects
		Customer c1=new Customer();

		c1.setCustomerid(504);
		c1.setCustomerName("customer4");

		Customer c2=new Customer();

		c2.setCustomerid(505);
		c2.setCustomerName("customer5");

		Customer c3=new Customer();

		c3.setCustomerid(506);
		c3.setCustomerName("customer6");

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setchildern(s);

		Transaction tx = session.beginTransaction();

		session.save(v);

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		factory.close();
	}

}
