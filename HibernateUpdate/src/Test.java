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
		Employee e = new Employee();
		
		e.setId(5);
		e.setFirstName("rajesh1");
		e.setLastName("morya1");
		
		Transaction tx = session.beginTransaction();
		session.update(e);
		System.out.print("successful");
		tx.commit();
		session.close();
		factory.close();
		
		
	}

}
