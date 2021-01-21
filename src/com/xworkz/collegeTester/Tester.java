package com.xworkz.collegeTester;

import java.util.Scanner;

import com.xworkz.college.dao.CollegeDAO;
import com.xworkz.college.dao.CollegeDAOImpl;
import com.xworkz.college.dto.CollegeDTO;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println("1 ---> Save");
		System.out.println("2 ---> Fetch");
		System.out.println("3 ---> Update");
		System.out.println("4 ---> Delete");
		
		CollegeDTO collegeDTO = new CollegeDTO();
		CollegeDAO daoImpl = new CollegeDAOImpl();
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch(choice) {
		
		case 1 : daoImpl.saveCollege(collegeDTO);
			break;
		case 2 : daoImpl.fetchCollege(2);	
			break;
		case 3 : daoImpl.updateCollege(3);
			break;
		case 4 : daoImpl.removeCollege(4);	
			break;
		default : System.out.println();
		}
		
 	scanner.close();
		
	}
	

}
