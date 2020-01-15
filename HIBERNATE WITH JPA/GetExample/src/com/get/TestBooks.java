package com.get;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestBooks {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
				
		
		
		/*
		 * BooksDTO bd = new BooksDTO();
		 * 
		 * bd.setBid(150); bd.setBname("Chemistry"); bd.setQuantity(20);
		 * 
		 * 
		 */		 		
		
		  BooksDTO b = (BooksDTO)em.find(BooksDTO.class,150);
		  
		  System.out.println(b.getBid()+" "+b.getBname()+" "+b.getQuantity());
		 
		
		 // em.persist(bd);
		 // em.getTransaction().commit();
		  em.close();
		  emf.close();
		
		
		
		}

}
