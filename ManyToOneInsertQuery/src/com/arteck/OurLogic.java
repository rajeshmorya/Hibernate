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

		Cards c =new Cards();

		            c.setCid(101);
		            c.setCname("java4s");

		 CardUser c1=new CardUser();

		             c1.setCarduserid(504);
		             c1.setCardusername("customer4");
		             c1.setParentObject(c);

     	 CardUser c2=new CardUser();

		             c2.setCarduserid(505);
		             c2.setCardusername("customer5");
		             c2.setParentObject(c);

		 CardUser c3=new CardUser();

		             c3.setCarduserid(506);
		             c3.setCardusername("customer6");
		             c3.setParentObject(c);           		             

		    Transaction tx = session.beginTransaction();

		                      session.save(c1);
		                      session.save(c2);
		                      session.save(c3);

		    tx.commit();
		    session.close();
		    System.out.println("One To Many is Done..!!");
		    factory.close();
	}

}
