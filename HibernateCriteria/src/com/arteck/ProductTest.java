package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.DistinctRootEntityResultTransformer;
import org.hibernate.transform.ResultTransformer;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
//select query by projection
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("pid"));
		p.add(Projections.property("pname"));
		p.add(Projections.property("pcolor"));
		crit.setProjection(p);
		
		List l= crit.list();
		Iterator i = l.iterator();
		
		while (i.hasNext()) 
		{
	       Object[] obj = (Object[]) i.next();
	       System.out.println("pid : " + obj[0]+" pname : "+obj[1]+" pcolor : "+obj[2]);
		}*/
		
		
//where + like query with restriction
/*		Criteria crit = s.createCriteria(product.class);
		// crit.createAlias("pid", "p");
		crit.add(Restrictions.like("pcolor","yel%"));
		crit.add(Restrictions.eq("pid",2));
		
		List l= crit.list();
		Iterator i = l.iterator();
		
		product pr;
		while(i.hasNext()) 
		{
			pr = (product)i.next();
			System.out.print(pr.getPid()+"  ");
			System.out.print(pr.getPname()+"  ");
			System.out.print(pr.getPcolor());
			System.out.println();
		}
		*/
		
//Aggregate funtion querys
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList(); 
		pList.add(Projections.rowCount());
		pList.add(Projections.count("pid"));
		pList.add(Projections.max("pid"));
		pList.add(Projections.min("pid"));
		pList.add(Projections.sum("pid"));
		pList.add(Projections.avg("pid"));

		crit.setProjection(pList);
		
		List l= crit.list();
		Iterator i = l.iterator();
		
		while (i.hasNext()) 
		{
	       Object[] obj = (Object[])i.next();
	       System.out.println("pid count : " + obj[0] +" all row count : "+ obj[1] +" max value "+ obj[2] +" min value "+ obj[3] +" sum value "+ obj[4] +" avg value "+ obj[5]);
		}*/
		
//group property query
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.groupProperty("pcolor"));
		crit.addOrder(Order.asc("pcolor"));
		
		crit.setProjection(pList);
		List l= crit.list();
		Iterator i = l.iterator();
		
		String t;
		while (i.hasNext()) 
		{
	      t = (String)i.next();
          System.out.println(String.valueOf(t)); 
		}*/
		
		
//Get First few records
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.property("pid"));
		pList.add(Projections.property("pname"));
		pList.add(Projections.property("pcolor"));
		//crit.setFirstResult(2);
		//crit.setMaxResults(5);
		crit.setProjection(pList);
		
		List l = crit.list();
		Iterator i = l.iterator();
		
		while(i.hasNext()) 
		{
			Object obj[] = (Object [])i.next();
			System.out.println(obj[0]+""+obj[1]+""+obj[2]);
		}
		*/
	
//or condition query 
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
	    pList.add(Projections.property("pid"));
		pList.add(Projections.property("pname"));
		pList.add(Projections.property("pcolor"));
		Criterion c1 = Restrictions.like("pcolor", "yel%");
		Criterion c2 = Restrictions.eq("pid",4);
		LogicalExpression orex = Restrictions.or(c1, c2);
		crit.add(orex);
		crit.setProjection(pList);
		
		List l = crit.list();
		Iterator i = l.iterator();
		
		while(i.hasNext()) 
		{
			Object obj[] = (Object [])i.next();
			System.out.println(obj[0]+""+obj[1]+""+obj[2]);
		}*/
	
// not query		
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
	    pList.add(Projections.property("pid"));
		pList.add(Projections.property("pname"));
		pList.add(Projections.property("pcolor"));
		//pList.add(Projections.);
		crit.add(Restrictions.ne("pid",1));
		crit.setProjection(pList);
		
		List l = crit.list();
		Iterator i = l.iterator();
		
		while(i.hasNext()) 
		{
			Object obj[] = (Object [])i.next();
			System.out.println(obj[0]+""+obj[1]+""+obj[2]);
		}*/
		
//is null query
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.property("pid"));
		//crit.add(Restrictions.isNull("pid"));
		crit.add(Restrictions.isNotNull("pid"));
		crit.setProjection(pList);
		
		List l = crit.list();
		Iterator i = l.iterator();
		Integer t;
		while(i.hasNext()) 
		{
			t = (Integer) i.next();
			System.out.println(t);
		}*/
		
//in clause query		
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList pList = Projections.projectionList();
		pList.add(Projections.property("pcolor"));
		crit.add(Restrictions.in("pid",new Integer[] {2}));
		crit.setProjection(pList);
		
		List l = crit.list();
		Iterator i = l.iterator();
		String n;
		while(i.hasNext()) 
		{
			n = (String)i.next();
			System.out.println(n);
		}*/
		
// between clause query
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("pcolor"));
		crit.add(Restrictions.between("pid", 2, 5));
		crit.setProjection(plist);
		
		List l = crit.list();
		Iterator i = l.iterator();
		String n;
		while(i.hasNext()) 
		{
			n = (String)i.next();
			System.out.println(n);
		}*/
		
//greater than or equal to query
/*		Criteria crit = s.createCriteria(product.class);
		ProjectionList plist = Projections.projectionList();
		plist.add(Projections.property("pid"));
		crit.add(Restrictions.ge("pid", new Integer("5")));
		crit.setProjection(plist);
		
		List l = crit.list();
		Iterator i = l.iterator();
		Integer n;
		while(i.hasNext()) 
		{
			n = (Integer)i.next();
			System.out.println(n);
		}*/
		
		
//group by having query
		Criteria crit = s.createCriteria(product.class);
		ProjectionList plist1 = Projections.projectionList();
		ProjectionList plist2 = Projections.projectionList();
		plist2.add(Projections.distinct(plist1.add(Projections.property("pcolor"),"pcolor")));
		//plist2.add(Projections.property(propertyName));
		plist2.add(Projections.property("pcolor"));
		//plist.add(Projections.countDistinct("pcolor"));
		//plist.add(Projections.co);
		//crit.setProjection(plist);
		crit.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List l = crit.list();
		/*Iterator i = l.iterator();
		Long n;
		while(i.hasNext()) 
		{
			n = (Long)i.next();
			System.out.println(n);
		}
		*//*
		final ResultTransformer trans = new DistinctRootEntityResultTransformer();
		Criteria cr=s.createCriteria(product.class).setProjection(
			Projections.distinct(Projections.projectionList()
			.add(Projections.property("pcolor"), "pcolor"))
		*/
		Iterator i1 = l.iterator();
		while(i1.hasNext()) 
		{
		String p = (String)i1.next();
			System.out.println(p);
		}
		
		
	//	plist.add(Projections.d);
		//plist.add(((Object) CustomProjections).groupByHaving());
		
	}

}
