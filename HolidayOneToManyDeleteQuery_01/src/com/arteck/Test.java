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
		
		Object o = session.get(Circle.class, new Integer(101));
		Circle v = (Circle)o;

		Transaction tx = session.beginTransaction();
		session.delete(v);
		
/*		Circle v =new Circle();

		v.setCircleid(101);
		v.setRegionid(1000);
		v.setCirclename("rajesh");
		v.setCircleaddress("shanti nagar");

		//creating 3 child objects
		Circle_has_role c1=new Circle_has_role();

		c1.setCircleroleid(504);

		Circle_has_role c2=new Circle_has_role();

		c2.setCircleroleid(505);

		Circle_has_role c3=new Circle_has_role();

		c3.setCircleroleid(506);

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setChildern(s);

		Transaction tx = session.beginTransaction();

		session.save(v);*/

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		factory.close();
	}

}
