package com.xworkz.singletonconnection;

import java.util.Objects;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleSessionFactory {

	private static SessionFactory singleFactory = null;
	
	static {
		singleFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("SingleFactor per DB");
	}
	
	public static SessionFactory getSingleFactory() {
		if (singleFactory != null) {
			return singleFactory;
		} else System.out.println("Factory not created");
		
		return getSingleFactory();
	}
	
	public static void closeSessionFactory() {
		if(Objects.nonNull(singleFactory)) {
			singleFactory.close();
			System.out.println("Session factory closed");
		}else 
			System.out.println("Session factory not closed");
	}	
}
