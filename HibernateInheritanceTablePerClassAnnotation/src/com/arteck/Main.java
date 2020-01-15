package com.arteck;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		CreditCardPayment creditCardPayment = new CreditCardPayment();
		creditCardPayment.setPaymentId(1001);
		creditCardPayment.setAmount(30000.00);
		creditCardPayment.setCardType("ICICI");
		creditCardPayment.setCardNumer(526253252);

		ChequePayment chequePayment = new ChequePayment();
		chequePayment.setAmount(2000.00);
		chequePayment.setPaymentId(1002);
		chequePayment.setChequeType("ORDER");
		chequePayment.setChequeNumber(0005265232);

		Transaction transaction = session.beginTransaction();
		session.save(creditCardPayment);
		session.save(chequePayment);
		transaction.commit();
		session.close();
		factory.close();

	}

}
