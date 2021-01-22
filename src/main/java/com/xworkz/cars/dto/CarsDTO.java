package com.xworkz.cars.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cars_table")
public class CarsDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CAR_ID")
	private int carId;
	
	@Column(name="CAR_COLOR")
	private String carColor;
	
	@Column(name="CAR_BRAND")
	private String carBrand;
	
	@Column(name="CAR_PRICE")
	private double carPrice;
	
	
	public CarsDTO() {
		
	}
	public CarsDTO(int carId ,String carColor,String carBrand,float carPrice) {
		super();
		this.carId = carId;
		this.carColor=carColor;
		this.carBrand = carBrand; 
		this.carPrice=carPrice;
	
	}
	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int CAR_ID) {
		this.carId = CAR_ID;
	}
	public void setCarColor(String carColor) {
		this.carColor=carColor;
		
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand=carBrand;
	}
	public String getCarBrand() {
		return carBrand;
		
	}
	public void setCarPrice(double carPrice) {
		this.carPrice=carPrice;
	}
	public double getCarPrice() {
		return carPrice;
	}
	
	public String toString() {
		return  "The details of the car is"+carId+"color:"+carColor+"price:"+carPrice+"Type:"+carBrand;
		
	}
	
}
