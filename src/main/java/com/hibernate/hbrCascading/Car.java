package com.hibernate.hbrCascading;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Car {

	@Id
	private int carNumber;
	private String carBrand;

	@OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
	private List<Wheel> wheels;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int carNumber, String carBrand) {
		super();
		this.carNumber = carNumber;
		this.carBrand = carBrand;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carBrand=" + carBrand + ", wheels=" + wheels + "]";
	}
	
}
