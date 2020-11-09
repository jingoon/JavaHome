package GGEx;

import java.util.Scanner;

import GG.Bow;
import GG.Gun;
import GG.Hero;
import GG.Monster;
import GG.Sword;
import GG.Weapon;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Monster mon = new Monster(100);
		System.out.println(mon);
		
		Weapon[] weapons = {new Bow("Ȱ",5),new Sword("��", 10), new Gun("��", 20)};
		Weapon w= weapons[0];
		
		Hero h1 = new Hero(weapons, w);
		
		int menu=0;
		int index=0;
		boolean is = true;
		while(is) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1:���� 2:���⺯�� 3:����");
			menu =sc.nextInt();
			if(menu==3) {
				break;
			}else if(menu==1) {
				h1.attack(mon);
			}else if(menu==2) {
				for(int i=0; i<weapons.length;i++) {
					System.out.print(String.format("%d:%s ", i,weapons[i]));
					
				}
				System.out.println();
				index = sc.nextInt();
				h1.weaponChage(index);
				
			}
		}
		
		sc.close();
		System.out.println("end");
	}

}
