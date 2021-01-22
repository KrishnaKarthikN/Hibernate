package com.xworkz.cars.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.cars.dto.CarsDTO;
import com.xworkz.singletonconnection.SingleSessionFactory;

public class CarsDAOImpl implements CarsDAO {

	public void saveCarData(CarsDTO carsDTO) {
		System.out.println("invoking the saveCardata");
		Session session = null;
		try {

			SessionFactory sessionFactory = SingleSessionFactory.getSingleFactory();
			System.out.println("sessionfactory created");
//				SessionFactory sessionFactory=SingleSessionFactory.getSingleFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(carsDTO);
			session.getTransaction().commit();
//				SingleSessionFactory.closeSingleFactory();
			System.out.println("done with saveCardata");

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session closed");
			} else {
				System.out.println("session not closed");
			}
		}

	}

	

}
