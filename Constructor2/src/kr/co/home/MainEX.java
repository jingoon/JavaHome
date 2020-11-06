package kr.co.home;

import java.sql.Time;

import com.home.Car;
import com.home.Dog;
import com.home.Person;
import com.home.Team;

public class MainEX {
	public static void main(String[] args) {
		
		Car sportsCar = new Car("���2020", "0A-2020", 2000000000);
		Car sm5 = new Car("sm5", "2010", 50000000);
		Car sonata3 = new Car("�ҳ�Ÿ3", "2015", 40000000);
		
		sportsCar.showMePrice();
		String sCarRun = sportsCar.run(250);
		System.out.println(sCarRun);
		System.out.println(":::::::::::::");
		
		Dog hotDog = new Dog(0, "�ֵ�", new Time(90000));
		Dog boolDog	= new Dog(1, "�ҵ�", new Time(8000));
		Dog chiwawa = new Dog(2, "ġ�Ϳ�", new Time(50000));
		Dog hotDog2 = new Dog(0, "�ֵ�2", new Time(90000));
		Dog boolDog2	= new Dog(1, "�ҵ�2", new Time(8000));
		Dog chiwawa2 = new Dog(2, "ġ�Ϳ�2", new Time(50000));
		
		String hdSleep= hotDog.sleep("ȭ����");
		System.out.println(hdSleep);
		System.out.println(":::::::::::::::");
		
		Person park = new Person("P1", "�ھ�", boolDog, sportsCar);
		Person kim	= new Person("K1", "�达", boolDog, sm5);
		Person lee	= new Person("l1", "�̾�", chiwawa, sonata3);
		Person par = new Person("P11", "��3��", boolDog2, sportsCar);
		Person ki	= new Person("K12", "��3��", boolDog2, sm5);
		Person le	= new Person("l13", "��2��", chiwawa, sonata3);
		
		Team alpaTeam = new Team(park, kim, lee);
		Team betaTeam =	new Team(par, ki, le);
		
		String mem2DogSleep = alpaTeam.getMember2().getDog().sleep("���2Ȩ");
		System.out.println(mem2DogSleep);
		String capCarName = alpaTeam.getCaptain().getDog().getName();
		System.out.println(capCarName);
		
		alpaTeam.dogsleep();
		System.out.println(park.carSpeed(500));
		alpaTeam.fight(betaTeam);
		
	}

}
