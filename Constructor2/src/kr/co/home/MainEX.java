package kr.co.home;

import java.sql.Time;

import com.home.Car;
import com.home.Dog;
import com.home.Person;
import com.home.Team;

public class MainEX {
	public static void main(String[] args) {
		
		Car sportsCar = new Car("Æä¶ó¸®2020", "0A-2020", 2000000000);
		Car sm5 = new Car("sm5", "2010", 50000000);
		Car sonata3 = new Car("¼Ò³ªÅ¸3", "2015", 40000000);
		
		sportsCar.showMePrice();
		String sCarRun = sportsCar.run(250);
		System.out.println(sCarRun);
		System.out.println(":::::::::::::");
		
		Dog hotDog = new Dog(0, "ÇÖµ¶", new Time(90000));
		Dog boolDog	= new Dog(1, "ºÒµ¶", new Time(8000));
		Dog chiwawa = new Dog(2, "Ä¡¿Í¿Í", new Time(50000));
		Dog hotDog2 = new Dog(0, "ÇÖµ¶2", new Time(90000));
		Dog boolDog2	= new Dog(1, "ºÒµ¶2", new Time(8000));
		Dog chiwawa2 = new Dog(2, "Ä¡¿Í¿Í2", new Time(50000));
		
		String hdSleep= hotDog.sleep("È­¿°¼Ó");
		System.out.println(hdSleep);
		System.out.println(":::::::::::::::");
		
		Person park = new Person("P1", "¹Ú¾¾", boolDog, sportsCar);
		Person kim	= new Person("K1", "±è¾¾", boolDog, sm5);
		Person lee	= new Person("l1", "ÀÌ¾¾", chiwawa, sonata3);
		Person par = new Person("P11", "¹Ú3¾¾", boolDog2, sportsCar);
		Person ki	= new Person("K12", "±è3¾¾", boolDog2, sm5);
		Person le	= new Person("l13", "ÀÌ2¾¾", chiwawa, sonata3);
		
		Team alpaTeam = new Team(park, kim, lee);
		Team betaTeam =	new Team(par, ki, le);
		
		String mem2DogSleep = alpaTeam.getMember2().getDog().sleep("¸â¹ö2È¨");
		System.out.println(mem2DogSleep);
		String capCarName = alpaTeam.getCaptain().getDog().getName();
		System.out.println(capCarName);
		
		alpaTeam.dogsleep();
		System.out.println(park.carSpeed(500));
		alpaTeam.fight(betaTeam);
		
	}

}
