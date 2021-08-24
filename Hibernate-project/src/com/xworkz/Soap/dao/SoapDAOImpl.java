package com.xworkz.Soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.Soap.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO {

	@Override
	public int save(SoapDTO entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SoapDTO.class);
		SessionFactory fact = config.buildSessionFactory();
		Session session = fact.openSession();
		Transaction tax = session.beginTransaction();
		int pk=(int)session.save(entity);
		tax.commit();
		System.out.println(pk);
		session.close();
		fact.close();
		return pk;
	}

}
