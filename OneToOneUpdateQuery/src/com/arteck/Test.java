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
		
		Transaction tx = session.beginTransaction();
        Car employee = (Car)session.get(Car.class, 102); 
        employee.setCarname("honda");
        session.update(employee);
        tx.commit();
		
/*		Car s = new Car();
		s.setCarid(102);
		s.setCarname("java4s");

		Engin ad = new Engin();
		ad.setEngineid(511);
		ad.setEnginename("Carry");

		ad.setC1(s);		

		Transaction tx = session.beginTransaction();

		session.save(ad);

		tx.commit();*/

		session.close();
		System.out.println("One to One is Done..!!");
		factory.close();
	}

}
