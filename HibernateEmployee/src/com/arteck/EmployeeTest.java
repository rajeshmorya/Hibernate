package com.arteck;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory cfg = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();
		Session s = cfg.openSession();
		
		//Employee e = new Employee();
		
		Transaction t = s.beginTransaction();
		
		//Query q = s.createQuery("update Employee set ename =:name "+" where eid=:epid");
		Query q = s.createQuery("update Employee set ename =:name,"+" salary =:salaryies "+" where eid=:epid");
		q.setParameter("name","ram");
		q.setParameter("salaryies",20);
		q.setParameter("epid",3);
		
		int result = q.executeUpdate();
		System.out.println("result is"+result);
		t.commit();
		s.close();
	}

}
