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
		

		Object o=session.get(Product.class, new Integer(103));
		Product v=(Product)o;
		System.out.println(v.getProductid());
		System.out.println(v.getProductname());

		Set s=v.getChildren();
		Iterator it = s.iterator();

		while(it.hasNext())
		{

		Object o1 = it.next();
		ProductComment c = (ProductComment) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		System.out.println("---------------------------");
		System.out.println(c.getProductcommentid());
		System.out.println(c.getProductcommentname());
		//System.out.println(c.getForevenid());
		System.out.println("---------------------------");
		}

		
/*		  Product v = new Product();
		  
		  v.setProductid(103); 
		  v.setProductname("java4s");
		  
		  ProductComment c1 = new ProductComment();
		  
		  c1.setProductcommentid(509); 
		  c1.setProductcommentname("customer4");
		  
		  // one-to-many 
		  Set s = new HashSet();
		  
		  s.add(c1); 
		  
		  v.setChildren(s);
		  
		  // many-to-one
		  
		  c1.setParentObject(v);
		  
		  Transaction tx = session.beginTransaction();
		  
		  //session.save(c1);
		 session.save(v);
		  tx.commit();*/
		  
		  session.close();
		  System.out.println("One To Many Bi-Directional is Done..!!");
		  factory.close();
		
	}

}
