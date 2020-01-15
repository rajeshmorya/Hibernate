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
		
		Query qry=session.createQuery("from Company_has_role c");

	    List l=qry.list();
	    Iterator it = l.iterator();
	    while(it.hasNext())
	    {
	    	Object o = it.next();
	    	Company_has_role c = (Company_has_role)o;
	    	System.out.println(c.getCompany_has_roleid());
	    	Role v=c.getRole_roleid();
	    	System.out.println(v.getRolename());
	    }
		
		

	/*	Role c = new Role();

		c.setRoleid(101);
		c.setRolename("java4s");

		Company_has_role c1 = new Company_has_role();

		c1.setCompany_has_roleid(504);
		c1.setRole_roleid(c);

		Transaction tx = session.beginTransaction();

		session.save(c1);

		tx.commit();*/
		session.close();
		System.out.println("Many To One is Done..!!");
		factory.close();
	}

}
