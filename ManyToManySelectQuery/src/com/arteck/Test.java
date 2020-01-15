package com.arteck;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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
		

			Transaction tx = session.beginTransaction();
	         List employees = session.createQuery("FROM Employee").list(); 
	         
	         for (Iterator iterator1 = employees.iterator(); iterator1.hasNext();)
	         {
	            Employee employee = (Employee) iterator1.next(); 
	            System.out.print("First Name: " + employee.getEmployeeid()); 
	            System.out.print("  Last Name: " + employee.getEmployeename()); 
	           /* Set certificates = employee.getMeeting();
	            
	            for (Iterator iterator2 = certificates.iterator(); iterator2.hasNext();)
	            {
	               Meeting certName = (Meeting) iterator2.next(); 
	               System.out.println("Certificate: " + certName.getMeetingid());
	               System.out.println("Certificate: " + certName.getMeetingname()); 
	            }*/
	         }
	         tx.commit();
	     

/*		Employee s1 = new Employee();
		s1.setEmployeeid(100);
		s1.setEmployeename("James");

		Employee s2 = new Employee();
		s2.setEmployeeid(101);
		s2.setEmployeename("Lee");

		Meeting c1 = new Meeting();
		c1.setMeetingid(500);
		c1.setMeetingname("Hibernate");

		Meeting c2 = new Meeting();
		c2.setMeetingid(501);
		c2.setMeetingname("Java");

		Set s = new HashSet();
		s.add(c1);
		s.add(c2);

		s1.setMeeting(s);
		s2.setMeeting(s);

		Transaction tx = session.beginTransaction();

		session.save(s1);
		session.save(s2);

		tx.commit();*/

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		factory.close();
	}

}
