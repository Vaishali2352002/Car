package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientInsertCriteria {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);

		List<Car> listcar = criteria.list();
		for (Car car : listcar) {
			System.out.println(car);

		}

	}
}