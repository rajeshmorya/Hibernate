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
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session se = sf.openSession();
		
		  Object o = se.get(University.class,5004);
		  University td = (University)o;
		  td.setUniversityname("India1");
		  
		  
		  Object o1 = se.get(Department.class,101);
		  Department pd = (Department)o1;
		  pd.setDepartmentname("Shikhar");
		
/*		  University td = new University(); 
		  td.setUniversityid(5004); 
		  td.setUniversityname("India");
		  
		  Department pd1 = new Department(); 
		  pd1.setDepartmentid(101);
		  pd1.setDepartmentname("Rohit");
		  
		  Department pd2 = new Department(); 
		  pd2.setDepartmentid(102);
		  pd2.setDepartmentname("Virat");
		  
		  
		  Set s = new HashSet();
		  
		  s.add(pd1); 
		  s.add(pd2);
		  
		  
		  td.setchildern(s);*/
		  
		 
		Transaction tx = se.beginTransaction();
		
		//se.save(td);
        
		
		  se.update(td);
		  se.update(pd);
		  
		 
        tx.commit();
        se.close();

        System.out.println("One To Many is Done..!!");
        sf.close();
	}

}
