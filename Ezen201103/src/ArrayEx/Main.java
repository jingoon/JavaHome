package ArrayEx;

import Array.ArrayTest;
import Array.Dog;

public class Main {

	public static void main(String[] args) {

		ArrayTest at1 = new ArrayTest();
		
		Dog boolDog = new Dog("불독 첫째");
		Dog jinDog = new Dog("진독 첫째");
		Dog seprtDog = new Dog("세퍼트");
		Dog mixDog = new Dog("똥개");

		Dog[] dogs = new Dog[] { boolDog, jinDog, seprtDog, mixDog };
		Dog[] dogs2 = new Dog[]{boolDog,jinDog,boolDog,boolDog,mixDog};
		at1.me1();
		at1.me2();
		Dog[] dogss = at1.me3(dogs);
		at1.me4(dogss);
		Dog[] dogs5 = at1.me5(dogs2);
		at1.me4(dogs5);
		at1.pibo();
		
		

		
		
	}

}
