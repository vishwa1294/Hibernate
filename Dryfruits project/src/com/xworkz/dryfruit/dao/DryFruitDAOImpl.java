package com.xworkz.dryfruit.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dryfruit.dto.DryFruitDTO;

public class DryFruitDAOImpl implements DryFruitDAO{

	@Override
	public int save(DryFruitDTO entity) {

		Configuration conf = new Configuration();
		conf.configure();
		conf.addAnnotatedClass(DryFruitDTO.class);
		SessionFactory fact = conf.buildSessionFactory();
		Session se = fact.openSession();
		Transaction tr= se.beginTransaction();
		int pk = (int) se.save(entity);
		tr.commit();
		System.out.println(pk);
		se.close();
		fact.close();
		return pk;
	}

}
