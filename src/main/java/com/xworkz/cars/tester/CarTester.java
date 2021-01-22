package com.xworkz.cars.tester;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.cars.dao.CarsDAO;
import com.xworkz.cars.dao.CarsDAOImpl;
import com.xworkz.cars.dto.CarsDTO;

public class CarTester {

	public static void main(String[] args) throws IOException {

//		FileInputStream file = new FileInputStream(new File("C:\\Users\\krishna\\Desktop\\Cars.xlsx"));
//		XSSFWorkbook workBook = new XSSFWorkbook(file);
//		XSSFSheet sheet = workBook.getSheetAt(0);
//		Row row;
//		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//			row = (Row) sheet.getRow(i);
//
//			String CAR_ID;
//			if (row.getCell(0) == null) {
//				CAR_ID = "null";
//			} else
//				CAR_ID = row.getCell(0).toString();
//
//			String CAR_COLOR;
//			if (row.getCell(1) == null) {
//				CAR_COLOR = "null";
//			} else
//				CAR_COLOR = row.getCell(1).toString();
//
//			String CAR_BRAND;
//			if (row.getCell(2) == null) {
//				CAR_BRAND = "null";
//			} else
//				CAR_BRAND = row.getCell(2).toString();
//
//			String CAR_PRICE;
//			if (row.getCell(3) == null) {
//				CAR_PRICE = "0";
//			} else
//				CAR_PRICE = row.getCell(3).toString();

			CarsDTO carsDTO = new CarsDTO(01,"White","Hyundai Creta", 17.31f);
//			carsDTO.setCarId((int)Double.parseDouble(CAR_ID));
//			carsDTO.setCarColor(CAR_COLOR);
//			carsDTO.setCarBrand(CAR_BRAND);
//			carsDTO.setCarPrice(Double.parseDouble(CAR_PRICE));
			CarsDAO daoImpl = new CarsDAOImpl();
			daoImpl.saveCarData(carsDTO);

		}
//		file.close();
//		
//		workBook.close();

	}

//}
