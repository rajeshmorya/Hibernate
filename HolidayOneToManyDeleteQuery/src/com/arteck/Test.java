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
		
		Object o = session.get(Region.class, new Integer(101));
		Region v = (Region)o;

		Transaction tx = session.beginTransaction();
		session.delete(v);
		
/*		Region v =new Region();

		v.setRegionid(101);
		v.setCompanyid(1000);
		v.setRegionname("rajesh");
		v.setRegionaddress("shanti nagar");

		//creating 3 child objects
		Region_has_role c1=new Region_has_role();

		c1.setRegionroleid(504);

		Region_has_role c2=new Region_has_role();

		c2.setRegionroleid(505);

		Region_has_role c3=new Region_has_role();

		c3.setRegionroleid(506);

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
