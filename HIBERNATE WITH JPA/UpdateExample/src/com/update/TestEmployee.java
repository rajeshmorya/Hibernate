package com.update;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestEmployee {

	public static void main(String[] args) {
		
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
			
			EntityManager em = emf.createEntityManager();
			
			em.getTransaction().begin();
					
		
		/*
		 * EmployeeDTO ed = new EmployeeDTO();
		 * 
		 * ed.setEid(101); ed.setName("shashank"); ed.setSalary(50000);
		 * 
		 * em.persist(ed);
		 */
		
		
		Object o = em.find(EmployeeDTO.class,101);
		EmployeeDTO ed = (EmployeeDTO)o;
		ed.setName("Raja110");
		
		em.merge(ed);
		
		
		
		
		 
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
		
	}

}