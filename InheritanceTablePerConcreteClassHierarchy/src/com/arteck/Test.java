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
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		CreditCard cc = new CreditCard();
		cc.setPaymentid(10);
		cc.setAmount(200);
		cc.setCreditCardType("gold");
		
		Cheque cq = new Cheque();
		cq.setPaymentid(11);
		cq.setAmount(300);
		cq.setChequeType("debit");
		
		Transaction tx = session.beginTransaction();
		session.save(cc);
		session.save(cq);
		tx.commit();
		session.close();
		factory.close();
	}

}
