package com.home;

public class Person {
	
	private String name;
	private String ssn;
	private String address;
	private int dateOfBirth;
	private Car car;
	private Dog dog;
	private Cat cat;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name) {
		this(name , "생년월일", "주소", 991231, new Car(false), new Dog(false), new Cat(false));
	}
	public Person(String name, String ssn, String address, int dateOfBirth ) {
			this(name , ssn, address, dateOfBirth, new Car(false), new Dog(false), new Cat(false));
	}


	public Person(String name, String ssn, String address, int dateOfBirth, Car car, Dog dog, Cat cat) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.car = car;
		this.dog = dog;
		this.cat = cat;
	}
	
	public void personInfo() {
		
		System.out.print("이름: " + name + "/");
		System.out.print("ssn: " + ssn + "/");
		System.out.print("주소: " + address +"/");
		System.out.print("생일: " + dateOfBirth + "/");
		System.out.print("자동차: "+getCar().carInfor() +",색상:"+getCar().getCarColor() +"/");
		System.out.println("애완동물 (개:" + getDog().dogInfo()+", 고양이:"+getCat().getCatInfo()+")");
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public Dog getDog() {
		return dog;
	}


	public void setDog(Dog dog) {
		this.dog = dog;
	}


	public Cat getCat() {
		return cat;
	}


	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
	
		
}

