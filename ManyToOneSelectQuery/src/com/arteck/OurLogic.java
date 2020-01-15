package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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

		Query qry=session.createQuery("from Child c");

	    List l=qry.list();
	    Iterator it = l.iterator();
	    while(it.hasNext())
	    {
	    	Object o = it.next();
	    	Child c = (Child)o;
	    	System.out.println(c.getChildname());
	    	Mother v=c.getParentObject();
	    	System.out.println(v.getMothername());
	    }
		
/*		Mother c =new Mother();

		            c.setMotherid(101);
		            c.setMothername("java4s");

		 Child c1=new Child();

		             c1.setChildid(504);
		             c1.setChildname("customer4");
		             c1.setParentObject(c);

		 Child c2=new Child();

		             c2.setChildid(505);
		             c2.setChildname("customer5");
		             c2.setParentObject(c);

		Child c3=new Child();

		             c3.setChildid(506);
		             c3.setChildname("customer6");
		             c3.setParentObject(c);           		             

		    Transaction tx = session.beginTransaction();

		                      session.save(c1);
		                      session.save(c2);
		                      session.save(c3);*/

		   // tx.commit();
		    session.close();
		    System.out.println("One To Many is Done..!!");
		    factory.close();
		
	}

}
