package TestGameEx;

import TestGame.Bow;
import TestGame.Gun;
import TestGame.Hero;
import TestGame.Monster;
import TestGame.Sword;
import TestGame.Weapon;

public class MainEx {

	public static void main(String[] args) {
		
		Weapon[] Weapons = {new Bow("활", 3),
							new Sword("검", 5),
							new Gun("총",10)};
		
		Hero hero1 = new Hero("h1", 1, 100, Weapons, new Bow("기본무장", 1));
		
		Monster mon1 = new Monster(20, "고블린", 1, 1);
		Monster Boss1 = new Monster(100, "보스1", 5, 5);	
		
		hero1.attack(mon1);
		
		hero1.chageWeapon(0);
		hero1.attack(mon1);
		
		hero1.attack(Boss1);
		hero1.chageWeapon(5);
		hero1.attack(mon1);
		hero1.chageWeapon(2);
		hero1.attack(mon1);
		hero1.attack(mon1);

	}

}
