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
		//parent object
		
		Object o=session.get(Subdivision.class, new Integer(101));
		Subdivision v=(Subdivision)o;
		System.out.println(v.getSubdivisionid());
		System.out.println(v.getDivisionid());
		System.out.println(v.getSubdivisionname());
		System.out.println(v.getSubdivisionaddress());

		Set s=v.getChildren();
		Iterator it = s.iterator();

		while(it.hasNext())
		{

		Object o1 = it.next();
		Subdivision_has_role c = (Subdivision_has_role) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		System.out.println("---------------------------");
		System.out.println(c.getSubdivisionroleid());
		System.out.println(c.getForeven_divisionid());
		System.out.println("---------------------------");
		}
		
/*		Subdivision v =new Subdivision();

		v.setSubdivisionid(101);
		v.setDivisionid(5000);
		v.setSubdivisionname("rajesh1");
		v.setSubdivisionaddress("shanti nagar");
		

		//creating 3 child objects
		Subdivision_has_role c1=new Subdivision_has_role();

		c1.setSubdivisionroleid(504);

		Subdivision_has_role c2=new Subdivision_has_role();

		c2.setSubdivisionroleid(505);

		Subdivision_has_role c3=new Subdivision_has_role();

		c3.setSubdivisionroleid(506);

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
