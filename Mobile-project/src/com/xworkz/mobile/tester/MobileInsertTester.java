package com.xworkz.mobile.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mobile.entity.MobileEntity;

public class MobileInsertTester {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(new MobileEntity("Redmi note 7 pro", "Redmi", 15000, true, "black"));
		session.save(new MobileEntity("One plus", "One plus Nord 2", 30000, true, "blue"));
		session.save(new MobileEntity("Samsung", "Samsung Galaxy Fold", 19000, true, " black"));
		trans.commit();
		factory.close();
	}
}
