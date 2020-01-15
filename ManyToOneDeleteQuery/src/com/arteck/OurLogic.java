package com.arteck;

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
		 
		 CarParts employee = (CarParts)session.get(CarParts.class, new Integer(504)); 
		 System.out.println(employee);
		 
		 Transaction tx = session.beginTransaction();
        session.delete(employee); 
        tx.commit();
		
/*		
		Car c =new Car();

		            c.setCarid(101);
		            c.setCarname("java4s");

		 CarParts c1=new CarParts();

		             c1.setCarpartsid(504);
		             c1.setCarpartsname("customer4");
		             c1.setParentObject(c);          		             

		    Transaction tx = session.beginTransaction();

		                      session.save(c1);

		    tx.commit();*/
		    session.close();
		    System.out.println("Many To One is Done..!!");
		    factory.close();
		
	}

}
