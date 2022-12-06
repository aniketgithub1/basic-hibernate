package com.jsp.car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCars {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aniket");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car car=entityManager.find(Car.class, 1);
		car.setName("X5");
		
		if(car !=null) {
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		System.out.println("VALUE UPDATED");
	    }
		else {
			System.out.println("VALUE NOT UPDATED");
		}
		
		
	}
}