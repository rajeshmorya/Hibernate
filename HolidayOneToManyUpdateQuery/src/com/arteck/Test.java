package com.arteck;

import java.util.HashSet;
import java.util.Iterator;
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
		
		  Object o = session.get(Distcenter_zone.class,101);
		  Distcenter_zone td = (Distcenter_zone)o;
		  td.setSubdivisionid(700);
		
		  Transaction tx = session.beginTransaction();
		  
		  session.update(td);
		  tx.commit();
		
/*		Distcenter_zone v =new Distcenter_zone();

		v.setDistcenter_zoneid(101);
		v.setSubdivisionid(5000);
		v.setDistcenter_zonename("rajesh1");
		v.setDistcenter_zoneaddress("shanti nagar");
		

		//creating 3 child objects
		Distcenter_zone_has_role c1=new Distcenter_zone_has_role();

		c1.setDistcenter_zoneroleid(504);

		Distcenter_zone_has_role c2=new Distcenter_zone_has_role();

		c2.setDistcenter_zoneroleid(505);

		Distcenter_zone_has_role c3=new Distcenter_zone_has_role();

		c3.setDistcenter_zoneroleid(506);

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setChildren(s);

		Transaction tx = session.beginTransaction();

		session.save(v);

		tx.commit();*/
		session.close();
		System.out.println("One To Many is Done..!!");
		factory.close();
	}

}
