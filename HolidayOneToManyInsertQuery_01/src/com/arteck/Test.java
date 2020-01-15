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
		//parent object
		User v =new User();

		v.setUserid(101);
		v.setUsername("java4s");
		v.setMobile(478965231);
		v.setPhone(123456);
		v.setPassword("rajesh");
		v.setEmail("rmorya1@gmail.com");
		

		//creating 3 child objects
		User_has_role c1=new User_has_role();

		c1.setUserroleid(504);

		User_has_role c2=new User_has_role();

		c2.setUserroleid(505);

		User_has_role c3=new User_has_role();

		c3.setUserroleid(506);

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
