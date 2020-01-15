package com.arteck;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		org.hibernate.SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Object o=session.get(Post.class, new Integer(101));
		Post v=(Post)o;
		System.out.println(v.getPostid());
		System.out.println(v.getPostname());

		Set s=v.getTag();
		Iterator it = s.iterator();

		while(it.hasNext())
		{

		Object o1 = it.next();
		Tag c = (Tag) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		System.out.println("---------------------------");
		System.out.println(c.getTagid());
		System.out.println(c.getTagname());
		System.out.println("---------------------------");
		}
		
		
		
/*		Post p = new Post();
		p.setPostid(101);
		p.setPostname("test");
		
		Post p1 = new Post();
		p1.setPostid(102);
		p1.setPostname("test1");
		
		Tag t = new Tag();
		t.setTagid(501);
		t.setTagname("tagname1");
		
		Tag t1 = new Tag();
		t1.setTagid(502);
		t1.setTagname("tabname2");
		
		Set s = new HashSet();
		s.add(t);
		s.add(t1);
		
		p.setTag(s);
		p1.setTag(s);
		
		Transaction tx = session.beginTransaction();
		session.save(p);
		session.save(p1);
		tx.commit();*/
		session.close();
		factory.close();
		
	}

}
