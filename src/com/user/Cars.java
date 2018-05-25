package com.user;

public class Cars {
	protected String make;
	protected String model;
	protected int year;
	protected double price;
	protected boolean daysIdle;
	protected String image;
	protected int carId;
	
	
	public Cars(String make,String model,int year, double price, boolean daysIdle,String image,int carId) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.daysIdle = daysIdle;
		this.image = image;
		this.carId = carId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean getDaysIdle() {
		return daysIdle;
	}
	public void setDaysIdle(boolean daysIdle) {
		this.daysIdle = daysIdle;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public void discount() {
		if(daysIdle) {
			System.out.println("you can get up to a 10% discount! Please call to find out how.");
		}
	}

}
