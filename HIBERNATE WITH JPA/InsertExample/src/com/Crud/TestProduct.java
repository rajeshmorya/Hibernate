package com.Crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestProduct {

	public static void main(String[] args) {
		
				
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "create" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      ProductDTO pd = new ProductDTO();
			pd.setPid(3);
			pd.setPname("laptop");
			pd.setPrice(500000);
			pd.setQuantity(20);
			
           entitymanager.persist(pd);
           entitymanager.getTransaction().commit();
           entitymanager.close();
           emfactory.close();
	     
		
	 
		
	
		
		
	}

}
