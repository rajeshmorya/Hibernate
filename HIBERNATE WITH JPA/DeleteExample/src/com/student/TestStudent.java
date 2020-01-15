package com.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestStudent {

	public static void main(String[] args) {
		
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
			
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
			
			
			
		/*
		 * StudentDTO sdo = new StudentDTO(); sdo.setSid(333); sdo.setName("shivam");
		 * sdo.setDivision("C");
		 * 
		 * em.persist(sdo);
		 */	  
		
			StudentDTO sdo = em.find(StudentDTO.class,333);
			em.remove(sdo);
			
	   em.getTransaction().commit();
	    em.close();
	    emf.close();
		

		
		
		
	}
}