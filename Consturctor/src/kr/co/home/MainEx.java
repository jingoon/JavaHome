package kr.co.home;

import com.home.Car;
import com.home.Cat;
import com.home.Dog;
import com.home.Person;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person park = new Person("¹Ú¾¾", "m-01", "°æ±âµµ", 901223, new Car("½Â¿ëÂ÷"),new Dog(), new Cat());
		park.personInfo();
		System.out.println(park.getCar().getCarColor());
		park.personInfo();
		
		Person hong = new Person("È«¾¾", "a-123", "¼­¿ï", 890708); // ±æµ¿ÀÌ´Â ÃÊ±â°ª
		hong.personInfo();
	
	}

}
