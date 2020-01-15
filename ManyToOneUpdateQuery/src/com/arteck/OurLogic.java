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
		
		  Object o = session.get(User.class,101);
		  User td = (User)o;
		  td.setUsername("India1");
		  Transaction tx = session.beginTransaction();
		  session.update(td);
		  tx.commit();

/*		User v =new User();

		            v.setUserid(101);
		            v.setUsername("java4s");

		 UserAddress c1=new UserAddress();

		             c1.setUseraddressid(504);
		             c1.setUseraddressname("customer4");
		             c1.setParentObject(v);

		UserAddress c2=new UserAddress();

		             c2.setUseraddressid(505);
		             c2.setUseraddressname("customer5");
		             c2.setParentObject(v);

		UserAddress c3=new UserAddress();

		             c3.setUseraddressid(506);
		             c3.setUseraddressname("customer6");
		             c3.setParentObject(v);           		             

		    Transaction tx = session.beginTransaction();

		                      session.save(c1);
		                      session.save(c2);
		                      session.save(c3);

		    tx.commit();*/
		    session.close();
		    System.out.println("Many to one is Done..!!");
		    factory.close();
	}

}
