package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QuerylevelCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s1 = cfg.openSession();	
		
		Query q = s1.createQuery("from product1");
		
		List l= q.list();
		Iterator i = l.iterator();
		
		product pr;
		while(i.hasNext()) 
		{
			pr = (product)i.next();
			System.out.print(pr.getPid()+"  ");
			System.out.print(pr.getPname()+"  ");
			System.out.print(pr.getPcolor());
			System.out.println();
		}
		/*Object o = s1.load(product.class, new Integer(2));
		product s = (product)o;

		System.out.println("Loaded object product name is___"+s.getPname());
		
		System.out.println("Object Loaded successfully.....!!");
		*/
		s1.close();

	}

}
