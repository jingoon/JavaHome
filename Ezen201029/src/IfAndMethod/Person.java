package IfAndMethod;

public class Person {
	private TV tv;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(TV tv) {
		super();
		this.tv = tv;
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public void tvOnOff() {
		tv.power();
	}
	
	
}
