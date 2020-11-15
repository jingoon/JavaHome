package GGEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.CommonDataSource;

import GG.AttackCommand;
import GG.ChangeCommand;
import GG.Command;
import GG.EndCommand;
import GG.Gun;
import GG.Hero;
import GG.Monster;
import GG.Sword;
import GG.Weapon;
import GG.bow;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(100);
		System.out.println(mon);
		
		List<Weapon> weaponList = new ArrayList<Weapon>();
		weaponList.add(new bow("활", 5));
		weaponList.add(new Sword("검", 10));
		weaponList.add(new Gun("총", 20));
			
		Weapon w = weaponList.get(0);
		
		//command를 메뉴로만 쓰고 실행하지 못함. 수정해야함
		List<Command> commandList = new ArrayList<Command>();
		commandList.add(new EndCommand());
		commandList.add(new AttackCommand());
		commandList.add(new ChangeCommand());
		
		
		
		Hero h1Hero = new Hero(weaponList, w);
		
		int menu =0;
		int idx=0;
		boolean is = true;
		
		try {
			while(is) {
				System.out.println("메뉴를 선택");
				System.out.println(commandList);
				menu = sc.nextInt();
				
				if(menu == 0) {
					break;
				}else if(menu==1 ) {
					h1Hero.attack(mon);
				}else if(menu==2) {
					for (int i = 0; i < weaponList.size(); i++) {
						System.out.print(i+":"+weaponList.get(i)+"  ");
					}
					System.out.println();
					idx=sc.nextInt();
					h1Hero.ChangeWeapon(idx);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("end");
		}
		
	}
}
