package MainEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TestEx.Bow;
import TestEx.Gun;
import TestEx.Hero;
import TestEx.Monster;
import TestEx.Sword;
import TestEx.Weapon;

public class MainEx {

	public static void main(String[] args) {
	
		Monster mon = new Monster(100);
		System.out.println(mon.getHp());

		List<Weapon> listw = new ArrayList<Weapon>();
		listw.add(new Bow("활", 5));
		listw.add(new Sword("검", 10));
		listw.add(new Gun("총", 15));
		
		//set 공격,무기변경,종료
		
		Weapon w = listw.get(0);
		
		Hero h1 = new Hero(listw, w);
		
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		while (menu) {
			System.out.println("1:공격 2:무기변경 3:종료");
			int idx= sc.nextInt();
			sc.nextLine();
			
			w.attack(mon);
			h1.weponChange(idx);
			System.exit(0);
			
		}
		
		
		
		
		
		try {
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
