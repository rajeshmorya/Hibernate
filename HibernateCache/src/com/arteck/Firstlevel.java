package com.arteck;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Firstlevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s1 = cfg.openSession();	

		Object o = s1.load(product.class, new Integer(2));
		product p = (product)o;
		
		System.out.println("Loaded object product name is___"+p.getPname());
		System.out.println("Object Loaded successfully.....!!");
		
		
		Object o1 = s1.load(product.class, new Integer(2));
		product p1 = (product)o;
		System.out.println("Loaded object product name is___"+p1.getPname());
		System.out.println("Object Loaded successfully.....!!");
		s1.close();
	}

}
