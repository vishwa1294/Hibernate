package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.entity.BirdEntity;

public class BirdDAOImpl implements BirdDAO {

	BirdEntity temp = null;

	@Override
	public int save(BirdEntity entity) {
		Configuration configure = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory fact = configure.buildSessionFactory();
		Session ref = fact.openSession();
		Transaction tx = ref.beginTransaction();
		int pk = (int) ref.save(entity);
		tx.commit();
		System.out.println(pk);
		ref.close();
		fact.close();
		return pk;
	}

	@Override
	public BirdEntity readById(int id) {
		Configuration configure = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		BirdEntity bird= session.get(BirdEntity.class, id);
		session.close();
		factory.close();
		return bird;
	}
}

