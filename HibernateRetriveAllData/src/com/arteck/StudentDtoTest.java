package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDtoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Query q = s.createQuery("from StudentDto");
		
		List l = q.list();
		Iterator i = l.iterator();
		
		StudentDto st;
		while(i.hasNext()) 
		{
			st = (StudentDto)i.next();
			System.out.println(st.getRollno());
			System.out.println(st.getFirstname());
			System.out.println(st.getLastname());
		}
	}

} 
