package com.arteck.mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//StudentDTO st = new StudentDTO();
		
	       Object o=session.load(StudentDTO.class,new Integer(1));
	        StudentDTO p=(StudentDTO)o;

	        Transaction tx = session.beginTransaction();
	        session.delete(p);
	        System.out.println("Object Deleted successfully.....!!");
	        tx.commit();
	        session.close();
	        factory.close();
		
	}

}
