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
		
		Object o=session.get(Division.class, new Integer(101));
		Division v=(Division)o;
		System.out.println(v.getDivisionid());
		System.out.println(v.getCircleid());
		System.out.println(v.getDivisionname());
		System.out.println(v.getDivisionaddress());

		Set s=v.getChildren();
		Iterator it = s.iterator();

		while(it.hasNext())
		{

		Object o1 = it.next();
		Division_has_role c = (Division_has_role) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		System.out.println("---------------------------");
		System.out.println(c.getDivisionroleid());
		System.out.println(c.getForeven_divisionid());
		System.out.println("---------------------------");
		}
		
/*		Division v =new Division();

		v.setDivisionid(101);
		v.setCircleid(5000);
		v.setDivisionname("rajesh1");
		v.setDivisionaddress("shanti nagar");
		

		//creating 3 child objects
		Division_has_role c1=new Division_has_role();

		c1.setDivisionroleid(504);

		Division_has_role c2=new Division_has_role();

		c2.setDivisionroleid(505);

		Division_has_role c3=new Division_has_role();

		c3.setDivisionroleid(506);

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setChildren(s);

		Transaction tx = session.beginTransaction();

		session.save(v);*/

		//tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		factory.close();
	}

}
