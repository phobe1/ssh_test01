package ssh_test01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		System.out.println(session);
		System.out.println();
	}

}
