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

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();	

		Teacher c1 = new Teacher();
		c1.setTeacherid(1);
		c1.setTeachername("cat 1");

		Teacher c2 = new Teacher();
		c2.setTeacherid(2);
		c2.setTeachername("cat 2");

		Students i1=new Students();
		Students i2 = new Students();

		i1.setStudentid(101);
		i1.setStudentname("item1");

		i2.setStudentid(102);
		i2.setStudentname("item2");

		Set s =new HashSet();
		s.add(i1);
		s.add(i2);

		c1.setStudent(s);
		c2.setStudent(s);

		Transaction tx = ses.beginTransaction();
		ses.save(c1);
		ses.save(c2);
		tx.commit();
		System.out.println("Man to Many using annotations been done...!!!!!");
		ses.close();
	}
}
