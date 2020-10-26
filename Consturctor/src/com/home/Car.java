package com.home;

public class Car {

	private String carName;
	private String carColor;
	private boolean carYesOrNo=true;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public  Car(String carName) {
		
		this(carName, "색없음");
		
	}
	public String carInfor() {
		if(carYesOrNo) {
		String a= carName;
		return a;
		}else {String b = "차없음";
		return b;
		}
		
	}
	
	
	public String getCarName() {
		return carName;
	}
	
	public Car(boolean carYesOrNo) {
		super();
		this.carYesOrNo = carYesOrNo;
	}

	public boolean isCarYesOrNo() {
		return carYesOrNo;
	}

	public void setCarYesOrNo(boolean carYesOrNo) {
		this.carYesOrNo = carYesOrNo;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public Car(String carName, String carColor) {
		super();
		this.carName = carName;
		this.carColor = carColor;
	}
	
	
}
