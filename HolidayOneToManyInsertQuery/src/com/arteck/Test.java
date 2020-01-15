package com.arteck;

import java.util.HashSet;
import java.util.Set;

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
		//parent object
		Company v =new Company();

		v.setCompanyid(103);
		v.setCompanyname("java4s");

		//creating 3 child objects
		Company_has_role c1=new Company_has_role();

		c1.setCompanyroleid(510);
		c1.setCompanyrolename("customer4");

/*		Company_has_role c2=new Company_has_role();

		c2.setCompanyroleid(511);
		c2.setCompanyrolename("customer5");

		Company_has_role c3=new Company_has_role();

		c3.setCompanyroleid(512);
		c3.setCompanyrolename("customer6");*/

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		//s.add(c2);
		//s.add(c3);

		v.setChildern(s);

		Transaction tx = session.beginTransaction();

		session.save(v);

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		factory.close();
	}

}
