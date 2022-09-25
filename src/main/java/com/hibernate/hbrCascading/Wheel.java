package com.hibernate.hbrCascading;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Wheel {

	@Id
	private int wheelId;
	private String wheelBrand;

	@ManyToOne
	@JoinColumns(@JoinColumn(name = "car_id"))
	private Car car;

	public Wheel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wheel(int wheelId, String wheelBrand, Car car) {
		super();
		this.wheelId = wheelId;
		this.wheelBrand = wheelBrand;
		this.car = car;
	}

	public int getWheelId() {
		return wheelId;
	}

	public void setWheelId(int wheelId) {
		this.wheelId = wheelId;
	}

	public String getWheelBrand() {
		return wheelBrand;
	}

	public void setWheelBrand(String wheelBrand) {
		this.wheelBrand = wheelBrand;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Wheel [wheelId=" + wheelId + ", wheelBrand=" + wheelBrand + ", car=" + car + "]";
	}
	
	

}
