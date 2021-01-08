package com.xworkz.collegeTester;

import com.xworkz.college.dao.CollegeDAOImpl;
import com.xworkz.college.dto.CollegeDTO;

public class Tester {

	public static void main(String[] args) {
		
		CollegeDTO collegeDTO = new CollegeDTO(03, "BMSCE", "Bangalore", 1600, 300, 6);
		CollegeDAOImpl daoImpl = new CollegeDAOImpl();
		//daoImpl.saveCollege(collegeDTO);
		//daoImpl.fetchCollege(1);
		daoImpl.updateCollege(02);
	}
	

}
