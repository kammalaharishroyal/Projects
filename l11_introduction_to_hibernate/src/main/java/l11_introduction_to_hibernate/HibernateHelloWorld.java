package l11_introduction_to_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import jakarta.transaction.Transaction;

public class HibernateHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration c=new Configuration();
		SessionFactory sf=c.configure("hbm-annotation.cfg.xml").buildSessionFactory();
		System.out.println(sf);
		Session session=sf.openSession();
		System.out.println("session started"+session);
		EmployeeAnnotation e=new EmployeeAnnotation(1,"Harish",70000);
		Transaction tx=session.beginTransaction();
		
		session.save(e);
		session.flush();
		tx.commit();
		
		session.close();
		

	}

}
