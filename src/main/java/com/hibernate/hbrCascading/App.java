package com.hibernate.hbrCascading;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		wtiteToDB(session);

		session.close();
		factory.close();
	}

	private static void wtiteToDB(Session session) {

		Car car = new Car(4025, "YAMAHA");

		List<Wheel> wheels = Arrays.asList(new Wheel(1, "MRF", car), new Wheel(2, "MRF", car), new Wheel(3, "MRF", car),
				new Wheel(4, "MRF", car));

		car.setWheels(wheels);

		Transaction transaction = session.beginTransaction();

		session.persist(car);

		transaction.commit();

	}
}
