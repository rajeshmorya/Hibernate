package com.arteck;

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
		
		  Object o = session.get(Employee.class,504);
		  Employee td = (Employee)o;
		  td.setEmployeename("raj");;
		
		  Transaction tx = session.beginTransaction();
		  
		  session.update(td);
		  tx.commit();
		
/*		Account a = new Account();
		a.setAccountid(101);
		a.setAccountname("morya");
		
		Employee e = new Employee();
		e.setEmployeeid(504);
		e.setEmployeename("rajesh");
		
		e.setParentObject(a);
		
		Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();*/
		session.close();
		factory.close();
		
		
		
	}

}
