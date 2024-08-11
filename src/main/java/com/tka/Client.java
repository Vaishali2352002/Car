package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Client {

	public static void main(String[] args) {
		Configuration cfg =new Configuration ();
		cfg.configure().addAnnotatedClass(Car.class);
	SessionFactory factory=	cfg.buildSessionFactory();
			
	Session session=factory.openSession();
	
	Car car= session.load(Car.class, 1);
	System.out.println(car);
			
		
	}

}
