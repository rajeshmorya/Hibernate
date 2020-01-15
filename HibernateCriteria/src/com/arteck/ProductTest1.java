package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ProductTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductTest1 pt = new ProductTest1();
		//pt.test();
		//pt.test1();
		//pt.test2();
		//pt.test3();
		pt.test4();
	}
	
	public void test() {
		
	SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
	Session s = cfg.openSession();	
	Criteria crit = s.createCriteria(product.class);
	ProjectionList p = Projections.projectionList();
	p.add(Projections.property("pid"));
	p.add(Projections.property("pname"));
	p.add(Projections.property("pcolor"));
	crit.add(Restrictions.like("pcolor","yel%"));
	crit.setProjection(p);
	
	List l= crit.list();
	Iterator i = l.iterator();
	
	while (i.hasNext()) 
	{
       Object[] obj = (Object[]) i.next();
       System.out.println("pid : " + obj[0]+" pname : "+obj[1]+" pcolor : "+obj[2]);
	}
	}
	
	public void test1() 
	{
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();	
		Criteria crit = s.createCriteria(product.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("pid"));
		p.add(Projections.property("pname"));
		p.add(Projections.property("pcolor"));
		crit.add(Restrictions.eq("pid",2));
		crit.setProjection(p);
		
		List l= crit.list();
		Iterator i = l.iterator();
		
		while (i.hasNext()) 
		{
	       Object[] obj = (Object[]) i.next();
	       System.out.println("pid : " + obj[0]+" pname : "+obj[1]+" pcolor : "+obj[2]);
		}
	}
	
	public void test2() 
	{
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();	
		Criteria crit = s.createCriteria(product.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("pid"));
		p.add(Projections.property("pname"));
		p.add(Projections.property("pcolor"));
		crit.add(Restrictions.between("pid", 2, 4));
		crit.setProjection(p);
		
		List l= crit.list();
		Iterator i = l.iterator();
		
		while (i.hasNext()) 
		{
	       Object[] obj = (Object[]) i.next();
	       System.out.println("pid : " + obj[0]+" pname : "+obj[1]+" pcolor : "+obj[2]);
		}
	}
	
	public void test3() 
	{
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();	
		Criteria crit = s.createCriteria(product.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("pid"));
		p.add(Projections.property("pname"));
		p.add(Projections.property("pcolor"));
		crit.add(Restrictions.lt("pid",3));
		crit.setProjection(p);
		
		List l= crit.list();
		Iterator i = l.iterator();
		
		while (i.hasNext()) 
		{
	       Object[] obj = (Object[]) i.next();
	       System.out.println("pid : " + obj[0]+" pname : "+obj[1]+" pcolor : "+obj[2]);
		}
	}

	public void test4() 
	{
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();	
		Criteria crit = s.createCriteria(product.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("pid"));
		p.add(Projections.property("pname"));
		p.add(Projections.property("pcolor"));
		crit.add(Restrictions.gt("pid",3));
		crit.setProjection(p);
		
		List l= crit.list();
		Iterator i = l.iterator();
		
		while (i.hasNext()) 
		{
	       Object[] obj = (Object[]) i.next();
	       System.out.println("pid : " + obj[0]+" pname : "+obj[1]+" pcolor : "+obj[2]);
		}
	}
}
