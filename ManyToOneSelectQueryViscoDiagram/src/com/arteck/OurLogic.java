package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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

		
		 Query qry=session.createQuery("from City c");
		  
		  List l=qry.list();
		  Iterator it = l.iterator();
		  while(it.hasNext())
		  {
			  Object o = it.next();
			  City c = (City)o;
			  System.out.println(c.getCityname());
			  State v=c.getParentObject();
			  System.out.println(v.getStatename());
		 }

/*		State c = new State();

		c.setStateid(101);
		c.setStatename("java4s");

		City c1 = new City();

		c1.setCityid(504);
		c1.setCityname("customer4");
		c1.setParentObject(c);

		City c2 = new City();

		c2.setCityid(505);
		c2.setCityname("customer5");
		c2.setParentObject(c);

		City c3 = new City();

		c3.setCityid(506);
		c3.setCityname("customer6");
		c3.setParentObject(c);

		Transaction tx = session.beginTransaction();

		session.save(c1);
		session.save(c2);
		session.save(c3);

		tx.commit();*/
		session.close();
		System.out.println("One To Many is Done..!!");
		factory.close();
	}

}
