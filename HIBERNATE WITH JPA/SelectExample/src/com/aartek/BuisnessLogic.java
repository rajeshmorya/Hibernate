package com.aartek;

import java.util.Iterator;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class BuisnessLogic {

	public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
	
		//Save Operation
		
		
		
		/*
		 * Product pro1=new Product(); pro1.setPid(1); pro1.setPname("Royal Enfiled");
		 * pro1.setPdesc("350cc");
		 * 
		 * Product pro2=new Product(); pro2.setPid(2); pro2.setPname("JAWA");
		 * pro2.setPdesc("500cc");
		 * 
		 * em.persist(pro1); em.persist(pro2); em.getTransaction().commit();
		 */
		  
		 
		  
		  //Select Operation all data
		  
		 
		
		
		  Query q= em.createQuery("from Product");
		  List results= q.getResultList();
		  
		  Iterator it=results.iterator();
		  
		  while(it.hasNext()) 
		  { Product pro=(Product)it.next();
		  System.out.println(pro.getPid()+" "+pro.getPname()+" "+pro.getPdesc());
		  
		  }
		 
		 
		      em.close();
			  emf.close();
			
		}

}
