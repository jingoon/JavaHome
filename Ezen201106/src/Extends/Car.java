package Extends;

public class Car {
	
	private String name;
	private String company;
	
	public Car() {
	}

	public Car(String name, String company) {
		super();
		this.name = name;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void run() {
		System.out.println("Car∞° ¥ﬁ∏≥¥œ¥Ÿ.");
	}
	
	public void stop() {
		System.out.println("Car∞° ∏ÿ√‰¥œ¥Ÿ.");
	}

}
