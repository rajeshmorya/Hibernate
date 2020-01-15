package com.arteck;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	      Transaction tx = null;
	      try {
	         tx = session.beginTransaction();
	         Bank employee = (Bank)session.get(Bank.class, 101); 
	         employee.setBankname("rajesh");
	         session.update(employee);
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }*/
/*		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//parent object
		Bank v =new Bank();

		v.setBankid(101);
		v.setBankname("java4s");

		//creating 3 child objects
		CustomerBank c1=new CustomerBank();

		c1.setCustomerbankid(504);
		c1.setCustomerbankname("customer4");

		CustomerBank c2=new CustomerBank();

		c2.setCustomerbankid(505);
		c2.setCustomerbankname("customer5");

		CustomerBank c3=new CustomerBank();

		c3.setCustomerbankid(506);
		c3.setCustomerbankname("customer6");

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setchildern(s);

		Transaction tx = session.beginTransaction();

		session.save(v);

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		factory.close();*/	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Bank b = new Bank();
		b.setBankid(101);
		b.setBankname("test");
		
		CustomerBank cb = new CustomerBank();
		cb.setCustomerbankname("sbi");
		Set s = new HashSet();
        s.add(cb);
		b.setchildern(s);
		
		//Transaction tx = session.beginTransaction();
		//session.save(b);
		Integer bankid = b.getBankid();
		System.out.println(bankid);
        Bank b1 = (Bank)session.get(Bank.class,bankid);
        b1.setchildern(b.getchildern());
        session.update(b1);
       // tx.commit();
		
	}

}
