package GGEx;

import java.util.Scanner;

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
		
		Weapon[] weapons = {new bow("Ȱ", 5), new Sword("��", 10), new Gun("��", 20)};
		Weapon w = weapons[0];
		
		Hero h1Hero = new Hero(weapons, w);
		
		int menu =0;
		int idx=0;
		boolean is = true;
		while(is) {
			System.out.println("�޴��� ����");
			System.out.println("1:���� 2:���⺯�� 3:����");
			menu = sc.nextInt();
			if(menu==3) {
				break;
			}else if(menu==1 ) {
				h1Hero.attack(mon);
			}else if(menu==2) {
				for(int i=0;i<weapons.length;i++) {
					System.out.print(String.format("%d:%s ", i,weapons[i]));
				}
				System.out.println();
				idx=sc.nextInt();
				h1Hero.ChageWeapon(idx);
			}
		}
		
		sc.close();
		System.out.println("��");
		
		//12��.. �ľ�
	}

}
