package com.arteck;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
       
        //Begin transaction
        Transaction t=session.beginTransaction();  
 
        //Creating Employee base class record
        Employee employee=new Employee();  
        employee.setName("John");
        employee.setCity("Newyork");
       
        //Creating Permanent Employee subclass record
        PermanentEmployee permanentEmployee=new PermanentEmployee();  
        permanentEmployee.setName("Jacob");  
        permanentEmployee.setCity("Delhi");
        permanentEmployee.setSalary(30000);  
       
       //Creating Contract Employee subclass record
        ContractEmployee contractEmployee=new ContractEmployee();  
        contractEmployee.setName("Raj");
        contractEmployee.setCity("Arizona");
        contractEmployee.setHourlyRate(2000);  
       
        //persist all the employee records
        session.save(employee);  
        session.save(permanentEmployee);  
        session.save(contractEmployee);  
       
        //Commit the transaction and close the session
        t.commit();  
        session.close();  
        System.out.println("successfully persisted all the Employee records");
	}

}
