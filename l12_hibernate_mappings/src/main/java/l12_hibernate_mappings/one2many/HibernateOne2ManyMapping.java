package l12_hibernate_mappings.one2many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class HibernateOne2ManyMapping {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		SessionFactory sf=c.configure("hbm-o2m-mapping.cfg.xml").buildSessionFactory();
		System.out.println(sf);
		Session session=sf.openSession();
		System.out.println("session started"+session);
		
		Transaction tx=session.beginTransaction();
		
		Cart cart=new Cart();
		cart.setName("My ishlist");
		
		Items item1=new Items(1,"iphne",50000,1,cart);
		Items item2=new Items(2,"macbook",10000,1,cart);
		 
		Set<Items> itemSet=new HashSet<Items>();
		itemSet.add(item1);
		itemSet.add(item2);
		cart.setItems(itemSet);
		cart.setTotal(1500000);

		
		
		session.save(cart);
		session.save(item1);
		session.save(item2);
		
		session.flush();
		tx.commit();
		
		System.out.println("the cart is inserted with id :"+cart.getId());
		
	}
}
