package com.arteck;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		//select query 
		//Query q = s.createSQLQuery("select * from product").addEntity(Product.class);
		//Query q = s.createQuery("from Product");
		
		// Order by query
		//Query q = s.createSQLQuery("select * from product order by pcolor asc").addEntity(Product.class);
		//Query q = s.createQuery("from Product order by pcolor asc");
		
		//group by query
		//Query q = s.createSQLQuery("select * from product group by pcolor").addEntity(Product.class);
		//Query q = s.createQuery("from Product group by pcolor");
		
		//where query
		//Query q = s.createSQLQuery("select * from product where pcolor = 'red'").addEntity(Product.class);
		//Query q = s.createQuery("from Product where pcolor = 'red'");
		
		// like query
		//Query q = s.createSQLQuery("select * from product where pcolor like 'b%'").addEntity(Product.class);
		//Query q = s.createQuery("from Product where pcolor like 'b%'");
		
/*		List l= q.list();
		Iterator i = l.iterator();
		
		Product pr;
		while(i.hasNext()) 
		{
			pr = (Product)i.next();
			System.out.print(pr.getPid()+"  ");
			System.out.print(pr.getPname()+"  ");
			System.out.print(pr.getPcolor());
			System.out.println();
		}
*/
		
//avg() aggregae function
/*		Query q = s.createSQLQuery("select avg(pid) from product");
		List l = q.list();
		Iterator i = l.iterator();
		java.math.BigDecimal n;
		while(i.hasNext()) 
		{
			n = (java.math.BigDecimal)i.next();
			System.out.println(n);
		}*/
		
	/*	Query q = s.createQuery("select avg(pid) from Product");
		List l = q.list();
		Iterator i = l.iterator();
		java.lang.Double n;
		while(i.hasNext()) 
		{
			n = (java.lang.Double)i.next();
			System.out.println(n);
		}*/
		
//max() agregate function
		//Query q = s.createSQLQuery("SELECT max(pid) FROM product");
/*		Query q = s.createQuery("Select max(pid) FROM Product");
		
		List l= q.list();
        Iterator i = l.iterator();
        Integer n;
        while (i.hasNext()) 
       {
          n = (Integer)i.next();
          System.out.println(n);
       }*/
        
		
		
//min() aggregate function
       // Query q = s.createSQLQuery("select min(pid) from product");
  /*      Query q = s.createQuery("select min(pid) from Product");
		List l= q.list();
        Iterator i = l.iterator();
        Integer n;
        while (i.hasNext()) 
       {
          n = (Integer)i.next();
          System.out.println(n);
       }*/
		
//sum() aggregate function
		/*Query q = s.createSQLQuery("select sum(pid) from product");
		List l= q.list();
        Iterator i = l.iterator();
        java.math.BigDecimal n;
        while (i.hasNext()) 
       {
          n = (java.math.BigDecimal)i.next();
          System.out.println(n);
       }*/
        
 /*     Query q = s.createQuery("select sum(pid) from Product");
        List l= q.list();
        Iterator i = l.iterator();
        java.lang.Long n;
        while (i.hasNext()) 
       {
          n = (java.lang.Long)i.next();
          System.out.println(n);
       }*/
        
//count() aggregate function
/*		Query q = s.createSQLQuery("SELECT COUNT(pid) FROM product");
		List l= q.list();
        Iterator i = l.iterator();
        Integer n;
        while (i.hasNext()) 
       {
          n = (Integer)i.next();
          System.out.println(n);
       }*/
        
		
//insert query   remaining task
	//Query q = s.createSQLQuery("INSERT INTO product (pid, pname, pcolor) VALUES (6,'product5', 'white')");
/*	Query q = s.createQuery("insert into Product(pid,pname,pcolor) select i.pid,i.pname,i.pcolor from Product i where i.pid=2");
	 q.setParameter(2,8);
	 int res = q.executeUpdate();
	 
	   System.out.println("Command successfully executed....");
       System.out.println("Numer of records effected...,"+res);*/

		
// update query 		
/*		Transaction tx = s.beginTransaction();	
	//Query q = s.createSQLQuery("UPDATE product SET pname = 'Alfred Schmidt1' WHERE pid = 2").addEntity(Product.class);	
	//sql query over hql start
	Query q = s.createQuery("UPDATE Product set pname =:pname1 WHERE pid =:pid1");
	q.setParameter("pname1","rajesh");
	q.setParameter("pid1",2);
	int result = q.executeUpdate();
	System.out.println("Rows Affected: " + result);
	tx.commit();
	s.close();*/
		
//delete query
/*	Transaction tx = s.beginTransaction();
	//Query q = s.createSQLQuery("DELETE FROM Product WHERE pid =2");
	Query q = s.createQuery("delete from Product where pid =:pid1");
	q.setParameter("pid1", 3);
	int result = q.executeUpdate();
	System.out.println("row affected"+result);
	tx.commit();
	s.close();*/
	
//select top 
/*    Query q = s.createSQLQuery("SELECT * FROM product LIMIT 3").addEntity(Product.class);
	List l= q.list();
	Iterator i = l.iterator();
	
	Product pr;
	while(i.hasNext()) 
	{
		pr = (Product)i.next();
		System.out.print(pr.getPid()+"  ");
		System.out.print(pr.getPname()+"  ");
		System.out.print(pr.getPcolor());
		System.out.println();
	}*/
	
//In query
	/*	//Query q = s.createSQLQuery("select * from product where pcolor IN('pink')").addEntity(Product.class);
		Query q = s.createQuery("from Product where pcolor in (:names)");
		q.setParameter("names","pink");
		List l = q.list();
		Iterator i = l.iterator();
		Product pr;
		while(i.hasNext()) 
		{
			pr = (Product)i.next();
			//System.out.print(pr.getPid()+"  ");
			System.out.print(pr.getPname()+"  ");
			//System.out.print(pr.getPcolor());
			System.out.println();
		}*/
		
		
//Between  and alias query
/*		//Query q = s.createSQLQuery("SELECT * FROM product WHERE pid BETWEEN 1 AND 5").addEntity(Product.class);
		Query q = s.createQuery("FROM Product AS c WHERE c.pid BETWEEN :stpid AND :edpid");
		q.setParameter("stpid",1);
		q.setParameter("edpid", 4);
		List l = q.list();
		Iterator i = l.iterator();
		Product pr;
		while(i.hasNext())
		{
			pr = (Product)i.next();
			System.out.println(pr.getPname());
		}*/
		
//select distinct query
/*		//Query q = s.createSQLQuery("SELECT DISTINCT pcolor FROM product");
		Query q = s.createQuery("SELECT DISTINCT pcolor FROM Product");
		List l = q.list();
		Iterator i = l.iterator();
		String n;
		while(i.hasNext()) 
		{
			n = (String)i.next();
			System.out.println(n);
		}*/
	
//and clause query
		//Query q = s.createSQLQuery("select * from product where pid=1 and pcolor='red'").addEntity(Product.class);
/*		Query q = s.createQuery("from Product where pid =:pid1 and pcolor=:pcolor1");
		q.setParameter("pid1",1);
		q.setString("pcolor1","red");
		List l = q.list();
		Iterator i = l.iterator();
		Product pr;
		while(i.hasNext()) 
		{
			pr = (Product) i.next();
			System.out.println(pr.getPid());
			System.out.println(pr.getPname());
			System.out.println(pr.getPcolor());
		}*/
		
//or clause query
/*		//Query q = s.createSQLQuery("select * from product where pid=2 or pcolor='red'").addEntity(Product.class);
		Query q = s.createQuery("from Product where pid=:pid1 or pcolor=:pcolor1");
		q.setParameter("pid1", 2);
		q.setParameter("pcolor1","red");
		List l = q.list();
		Iterator i = l.iterator();
		Product pr;
		while(i.hasNext()) 
		{
			pr = (Product) i.next();
			System.out.println(pr.getPid());
			System.out.println(pr.getPname());
			System.out.println(pr.getPcolor());
		}*/
		
//Not clause query
/*		//Query q = s.createSQLQuery("select * from product where not pcolor='red'").addEntity(Product.class);
		Query q = s.createQuery("from Product where not pcolor='red'");
		List l = q.list();
		Iterator i = l.iterator();
		Product pr;
		while(i.hasNext()) 
		{
			pr = (Product) i.next();
			System.out.print(pr.getPid()+" ");
			System.out.print(pr.getPname()+" ");
			System.out.print(pr.getPcolor()+" ");
			System.out.println();
		}*/
		
//null values query
/*		//Query q = s.createSQLQuery("select * from product where pcolor is null").addEntity(Product.class);
		Query q = s.createQuery("from Product where pcolor is null");
		List l = q.list();
		Iterator i = l.iterator();
		Product pr;
		while(i.hasNext()) 
		{
			pr = (Product) i.next();
			System.out.println(pr.getPid());
			System.out.println(pr.getPname());
			System.out.println(pr.getPcolor());
		}*/
		
		
//null values query
/*		//Query q = s.createSQLQuery("select * from product where pcolor is not null").addEntity(Product.class);
		Query q = s.createQuery("from Product where pcolor is not null");
		List l = q.list();
	    Iterator i = l.iterator();
		Product pr;
		while(i.hasNext()) 
		{
			pr = (Product) i.next();
			System.out.println(pr.getPid());
			System.out.println(pr.getPname());
			System.out.println(pr.getPcolor());
		}*/		

//having clause query
/*		Query q = s.createSQLQuery("select count(pid) from product group by pname having count(pid) > 1");
		List l = q.list();
		Iterator i = l.iterator();
		java.math.BigInteger n;
		while(i.hasNext()) 
		{
			n = (java.math.BigInteger) i.next();
			System.out.println(n);
		}*/
	/*	Query q = s.createQuery("select count(pid) from Product group by pname having count(pid) > 1");
		List l = q.list();
		Iterator i = l.iterator();
		Long n;
		while(i.hasNext()) 
		{
			n = (Long) i.next();
			System.out.println(n);
		}*/
		
		
// insert into query - some error in hql
/*		Transaction tx = s.beginTransaction();
		//Query q = s.createSQLQuery("insert into product(pid,pname,pcolor) values(6,'product6','black')");
		Query q = s.createQuery("insert into Product(pid,pname,pcolor) select i.pid,i.pname,i.pcolor from product1 i where i.pid= ?");
		q.setParameter(0,7);
		int result = q.executeUpdate();
		System.out.println("row affected"+result);
		tx.commit();
		s.close();*/
		
		
	}

}
