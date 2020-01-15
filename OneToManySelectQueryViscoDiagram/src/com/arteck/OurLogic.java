package com.arteck;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Object o=session.get(Country.class, new Integer(101));
		Country v=(Country)o;
		System.out.println(v.getCountryid());
		System.out.println(v.getCountryname());

		Set s=v.getchildern();
		Iterator it = s.iterator();

		while(it.hasNext())
		{

		Object o1 = it.next();
		State c = (State) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		System.out.println("---------------------------");
		System.out.println(c.getStateid());
		System.out.println(c.getStatename());
		System.out.println(c.getForevenid());
		System.out.println("---------------------------");
		}

		session.close();
		System.out.println("One To Many is Done for selecting.....!");
		factory.close();
	}

}
