package chapter06;

public class KoreaExample {
	public static void main(String[] args) {
		Korea k1 = new Korea("박자바", "013365-4586662");
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.snn: " + k1.ssn);
		
		Korea k2 = new Korea("박자바", "932222-2255555");
		System.out.println("k2.name: "+ k2.name);
		System.out.println("k2.ssn: "+ k2.ssn);
	}

}
