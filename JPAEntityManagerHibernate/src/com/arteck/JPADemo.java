package com.arteck;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
//import com.isg.maps.Employee;

public class JPADemo
{
        public static void main(String[] args)
    {
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("jcgJPA");
                EntityManager em = emf.createEntityManager();
                 
                em.getTransaction().begin();
                Employee employee = new Employee();
                employee.setName("Chandan");
                System.out.println("COMIITING");
                em.persist(employee);
                em.getTransaction().commit();
                 
    }
}