package com.xworkz.college.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.college.dto.CollegeDTO;
import com.xworkz.singletonconnection.SingleSessionFactory;

public class CollegeDAOImpl implements CollegeDAO {

	@Override
	public void saveCollege(CollegeDTO colDto) {
		System.out.println("invoked saveCollege()");

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSingleFactory();
			Configuration con = new Configuration();
			con.configure();

			sessionFactory = con.buildSessionFactory(); // Session factory is an interface.

			session = sessionFactory.openSession();

			session.beginTransaction();
			// session.save(colDto);
			session.persist(colDto);
			session.getTransaction().commit();
			System.out.println("Data saved");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else
				System.out.println("Session is not closed");

		}

	}

	@Override
	public void fetchCollege(int collegeID) {
		System.out.println("invoked fetchCollege()");
		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSingleFactory();
			Configuration con = new Configuration();
			con.configure();
			sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			CollegeDTO collegeDTO = session.get(CollegeDTO.class, collegeID);
			System.out.println(collegeDTO);
			System.out.println("Data is fetched");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else
				System.out.println("Session is not closed");

		}

	}

	@Override
	public void updateCollege(int collegeID) {
		System.out.println("invoked updateCollege()");

		Session session = null;
		CollegeDTO collegeDTO = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSingleFactory();
			Configuration con = new Configuration();
			con.configure();
			sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			collegeDTO = session.get(CollegeDTO.class, collegeID);
			collegeDTO.setNoOfBranches(5);
			collegeDTO.setNoOfRooms(500);
			collegeDTO.setNoOfStudents(1100);
			session.beginTransaction();
			// session.save(collegeDTO);
			session.update(collegeDTO);
			session.getTransaction().commit();
			System.out.println("Updated collegeDTO");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else
				System.out.println("Session is not closed");
		}

	}

	@Override
	public void removeCollege(int collegeID) {
		System.out.println("invoked removeCollege()");

		Session session = null;
		try {
			SessionFactory sessionFactory = SingleSessionFactory.getSingleFactory();
			Configuration con = new Configuration();
			con.configure();

			sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			CollegeDTO collegeDTO = session.get(CollegeDTO.class, collegeID);

			session.beginTransaction();
			// session.delete(collegeDTO);
			session.remove(collegeDTO);
			session.getTransaction().commit();

			System.out.println("Deleted collegeDTO");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else
				System.out.println("Session is not closed");

		}

	}

}
