package chapter06;


public class Car {
	//field
	String company ="�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//constructor
	Car(){
		
	}
	Car(String model){
		//this.model=model;
		this(model, "�����÷�", 250);
	}
	Car(String model, String color){
		//this.model=model;
		//this.color=color;
		this(model,color,250);
	}
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	// -------------------------�߰�
	public void carInfor() {
		System.out.println(this.company);
		System.out.println(this.model);
		System.out.println(this.color);
		System.out.println(this.maxSpeed);
		System.out.println();
	}
	

}
