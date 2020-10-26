package com.home;

public class Person {
	private String id;
	private String name;
	private Dog dog;
	private Car car;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	public Person(String id, String name, Dog dog, Car car) {
		super();
		this.id = id;
		this.name = name;
		this.dog = dog;
		this.car = car;
	}
	
	public String carSpeed(int speed) {
		String carSpeed= getCar().run(speed);
	
		return carSpeed ;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	

}
