package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QueryLevelCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s1 = cfg.openSession();	
/*		  System.out.println(System.currentTimeMillis());
		Object o = s1.load(Product.class, new Integer(2));
		  System.out.println(System.currentTimeMillis());
		Product s = (Product)o;

		
		System.out.println("Loaded object product name is___"+s.getPname());
		System.out.println("Object Loaded successfully.....!!");
		
		s1.close();
		o.setCacheable(true);
		
		Session session2 = cfg.openSession();
		Transaction tx = session2.beginTransaction();
		  System.out.println(System.currentTimeMillis());
		Object o2=session2.load(Product.class,new Integer(2));
		  System.out.println(System.currentTimeMillis());
		Product s2=(Product)o2;
		System.out.println("Loaded object product name is___"+s2.getPname());
	//	s2.setPname("blue11");
		
		//System.out.println("Loaded object product name is___"+s2.getPname());
		System.out.println("Object loaded from the database...!!");
		tx.commit();
		session2.close();*/
		
		  System.out.println(System.currentTimeMillis());
		Query q = s1.createQuery("from Product");
		q.setCacheable(true);
		
		System.out.println(System.currentTimeMillis());
			//q.setCacheRegion("employee");
		System.out.println();
		List l= q.list();
		Iterator i = l.iterator();
		
		Product pr;
		while(i.hasNext()) 
		{
			pr = (Product)i.next();
			System.out.print(pr.getPid()+"  ");
			System.out.print(pr.getPname()+"  ");
			System.out.print(pr.getPcolor());
			System.out.println();
		}

		s1.close();
		
		
		Session s2 = cfg.openSession();	
		  System.out.println(System.currentTimeMillis());
		Query q1 = s2.createQuery("from Product");
		q1.setCacheable(true);
		//Query q5 = s2.createQuery("from Product");
		  System.out.println(System.currentTimeMillis());
		
		System.out.println();
		List l1= q1.list();
		Iterator i1 = l1.iterator();
		
		Product pr1;
		while(i1.hasNext()) 
		{
			pr1 = (Product)i1.next();
			System.out.print(pr1.getPid()+"  ");
			System.out.print(pr1.getPname()+"  ");
			System.out.print(pr1.getPcolor());
			System.out.println();
		}
		s2.close();
		

		cfg.close();
	}

}
