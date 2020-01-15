package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProductProjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductProjection pp = new ProductProjection();
		//pp.projection();
		//pp.projection1();
		//pp.projection2();
		//pp.projection3();
		//pp.projection4();
		//pp.projection6();
		//pp.projection7();
		pp.projection8();
	}

	public void projection() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.rowCount());
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		long n;
		
		while(i.hasNext()) 
		{
			n = (Long)i.next();
			System.out.println(n);
		}
	}
	
	public void projection1() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.avg("pid"));
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		Double n;
		
		while(i.hasNext()) 
		{
			n = (Double)i.next();
			System.out.println(n);
		}
	}
	
	public void projection2() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.count("pid"));
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		long n;
		
		while(i.hasNext()) 
		{
			n = (Long)i.next();
			System.out.println(n);
		}
	}
	
	public void projection3() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.groupProperty("pid"));
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		Integer n;
		
		while(i.hasNext()) 
		{
			n = (Integer)i.next();
			System.out.println(n);
		}
	}
	
	public void projection4() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.max("pid"));
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		Integer n;
		
		while(i.hasNext()) 
		{
			n = (Integer)i.next();
			System.out.println(n);
		}
	}
	
	public void projection5() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.min("pid"));
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		Integer n;
		
		while(i.hasNext()) 
		{
			n = (Integer)i.next();
			System.out.println(n);
		}
	}
	
	public void projection6() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.sum("pid"));
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		long n;
		
		while(i.hasNext()) 
		{
			n = (long)i.next();
			System.out.println(n);
		}
	}
	public void projection7() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.countDistinct("pname"));
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		Long n;
		
		while(i.hasNext()) 
		{
			n = (Long)i.next();
			System.out.println(n);
		}
	}
	
	public void projection8() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.id());
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		Integer n;
		
		while(i.hasNext()) 
		{
			n = (Integer)i.next();
			System.out.println(n);
		}
	}
	
	public void projection9() 
	{
		
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		//pList.add(Projections.);
		
		crit.setProjection(pList);
		List l = crit.list();
		Iterator i = l.iterator();
		Integer n;
		
		while(i.hasNext()) 
		{
			n = (Integer)i.next();
			System.out.println(n);
		}
	}
}
