package com.arteck;

import java.util.HashSet;
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
		//parent object
		Blogpost v =new Blogpost();

		v.setBlogpostid(101);
		v.setBlogpostname("java4s");

		//creating 3 child objects
		BlogpostComment c1=new BlogpostComment();

		c1.setBlogpostCommentid(504);
		c1.setBlogpostCommentname("customer4");

		BlogpostComment c2=new BlogpostComment();

		c2.setBlogpostCommentid(505);
		c2.setBlogpostCommentname("customer5");

		BlogpostComment c3=new BlogpostComment();

		c3.setBlogpostCommentid(506);
		c3.setBlogpostCommentname("customer6");

		// adding child objects to set, as we taken 3rd property set in parent
		Set s = new HashSet();

		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setchildern(s);

		Transaction tx = session.beginTransaction();

		session.save(v);

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		factory.close();
		
	}

}
