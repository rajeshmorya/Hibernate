package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession(); 
	                    
	    //Hibernate Named Query    
		Query query = session.getNamedQuery("xyz");
		//Query query = session.getNamedQuery("findEmployeeByName");
		query.setParameter("name","morya");

		//List<Employee> employees = query.getResultList();
		List re = query.list();
		Iterator itr = re.iterator();
		while (itr.hasNext()) {
			Employee01 e = (Employee01) itr.next();
			
			System.out.println(e.getName());
		}
		session.close();     
	  } 
	}


