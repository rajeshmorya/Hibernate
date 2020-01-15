package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
		
		Query qry=session.createQuery("from dtaMFM c");

	    List l=qry.list();
	    Iterator it = l.iterator();
	    while(it.hasNext())
	    {
	    	Object o = it.next();
	    	dtaMFM c = (dtaMFM)o;
	    	System.out.println(c.getDtaname());
	    	Cbism_substation_log v=c.getParentObject();
	    	System.out.println(v.getCbism_substation_logname());
	    }
		
		

	/*	Cbism_substation_log c = new Cbism_substation_log();

		c.setCbism_substation_logid(101);
		c.setCbism_substation_logname("java4s");
		c.setCbism_substation_logaddress("shanti nagar");

		dtaMFM c1 = new dtaMFM();

		c1.setDtamfmid(504);
		c1.setDtaname("rajesh");
		c1.setParentObject(c);

		Transaction tx = session.beginTransaction();

		session.save(c1);

		tx.commit();*/
		session.close();
		System.out.println("Many To One is Done..!!");
		factory.close();
	}

}
