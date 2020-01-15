package com.arteck;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Secondlevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s1 = cfg.openSession();	

		Object o = s1.load(product.class, new Integer(2));
		product s = (product)o;

		
		System.out.println("Loaded object product name is___"+s.getPname());
		System.out.println("Object Loaded successfully.....!!");
		
		s1.close();

		System.out.println("------------------------------");
		System.out.println("Waiting......");

		try{
			Thread.sleep(10000);
		}
		catch (Exception e) {
		}	

		System.out.println("6 seconds compelted......!!!!!!!!");
		
		Session session2 = cfg.openSession();
		Transaction tx = session2.beginTransaction();
		Object o2=session2.load(product.class,new Integer(2));

		product s2=(product)o2;

		s2.setPname("blue11");
		
		//System.out.println("Loaded object product name is___"+s2.getPname());
		System.out.println("Object loaded from the database...!!");
		tx.commit();
		session2.close();

		
		Session session3 = cfg.openSession();
		Object o3=session3.load(product.class,new Integer(2));

		product s3=(product)o3;
		System.out.println("Loaded object product name is___"+s3.getPname());
		System.out.println("Object loaded from the database...!!");
		//tx.commit();
		session3.close();
		
		
		Session session4 = cfg.openSession();
		Object o4=session4.load(product.class,new Integer(2));

		product s4=(product)o4;
		System.out.println("Loaded object product name is___"+s4.getPname());
		System.out.println("Object loaded from the database...!!");
		//tx.commit();
		session4.close();
		
		cfg.close();
	}

}
