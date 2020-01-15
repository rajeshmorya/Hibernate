package com.arteck;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("imp");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Query query = em.createQuery("Delete form Employee t where t.id=:t");
		int deleteQuery = query.setParameter("t",1).executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		System.out.println();
		emf.close();
		
	}

}
