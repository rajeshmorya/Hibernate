package com.arteck;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//parent object
		Teacher v =new Teacher();

		v.setTeacherid(101);
		v.setTeachername("java4s");

		//creating 3 child objects
		Classes c1=new Classes();

		c1.setClassid(504);
		c1.setClassname("customer4");

		Classes c2=new Classes();

		c2.setClassid(505);
		c2.setClassname("customer5");

		Classes c3=new Classes();

		c3.setClassid(506);
		c3.setClassname("customer6");

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
