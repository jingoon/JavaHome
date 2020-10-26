package com.home;

public class Car {
	private String modelName;
	private String carNum;
	private int price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public void showMePrice() {
		System.out.printf("자동차의 가격은 %d원 입니다 %n",price);
	}
	public String run(int speed) {
		String run = "속도: "+ speed;
		return run;
	}

	// Shift + Alt + s = constructor using fields
	public Car(String modelName, String carNum, int price) {
		super();
		this.modelName = modelName;
		this.carNum = carNum;
		this.price = price;
	}

	// Shift + Alt + s = getters and setters
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
