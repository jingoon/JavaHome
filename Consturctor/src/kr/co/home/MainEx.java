package kr.co.home;

import com.home.Car;
import com.home.Cat;
import com.home.Dog;
import com.home.Person;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person park = new Person("�ھ�", "m-01", "��⵵", 901223, new Car("�¿���"),new Dog(), new Cat());
		park.personInfo();
		System.out.println(park.getCar().getCarColor());
		park.personInfo();
		
		Person hong = new Person("ȫ��", "a-123", "����", 890708); // �浿�̴� �ʱⰪ
		hong.personInfo();
	
	}

}
