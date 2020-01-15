package com.arteck;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o=session.load(UserDTO.class,new Integer(2));
		UserDTO s=(UserDTO)o;
		// For loading Transaction scope is not necessary...
		System.out.println(s.getId()+" "+s.getUserName()+" "+s.getAddress());
		//System.out.println(s.getUserName());
		//System.out.println(s.getUserName());
		System.out.println("Object Loaded successfully.....!!");
		session.close();
		factory.close();
	}

}
