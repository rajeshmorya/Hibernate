package com.arteck;

import java.util.Iterator;
import java.util.List;

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

		
        Transaction tx = session.beginTransaction();
        List account = session.createQuery("FROM Account").list(); 
        for (Iterator iterator = account.iterator(); iterator.hasNext();){
           Account acc = (Account) iterator.next(); 
           System.out.print("First Name: " + acc.getAccountid()); 
           System.out.print("  Last Name: " + acc.getAccountname()); 

          /* Employee add = acc.getE();
           System.out.println("Address ");
           System.out.println("\tStreet: " +  add.getEmployeeid());
           System.out.println("\tCity: " + add.getEmployeename());*/

        }
        tx.commit();
		

/*		Employee s = new Employee();
		s.setEmployeeid(103);
		s.setEmployeename("java4s");

		Account ad = new Account();
		ad.setAccountid(511);
		ad.setAccountname("Carry");
		//ad.setState("NC");
		ad.setE(s);
		
		Account ad1 = new Account();
		ad.setAccountid(512);
		ad.setAccountname("Carry1");

		ad.setE(s);
		

		Transaction tx = session.beginTransaction();

		session.save(ad);

		tx.commit();*/

		session.close();
		System.out.println("One to One is Done..!!");
		factory.close();
	}

}
