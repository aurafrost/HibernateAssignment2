package problem1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import problem1.Supplier;

public class SupplierDAO {
	public static int addRecord(Supplier c) {
		StandardServiceRegistry s=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata m=new MetadataSources(s).getMetadataBuilder().build();

		int i=0;

		SessionFactory sf=m.getSessionFactoryBuilder().build();
		Session ss=sf.openSession();
		Transaction t=ss.beginTransaction();


		i=(Integer)ss.save(c);
		t.commit();

		ss.close();
		sf.close();
		return i;
	}
}
