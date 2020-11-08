package TestGame;

public class Hero {
	
	private String name;
	private int power;
	private int str;
	private int hp;
	Weapon[] heroWeapons;
	Weapon wp;
	
	public Hero() {
	}

	

	public Hero(String name, int str, int hp, Weapon[] heroWeapons, Weapon wp) {
		super();
		this.name = name;
		this.str = str;
		this.hp = hp;
		this.heroWeapons = heroWeapons;
		this.wp = wp;
		this.power = str + wp.getPower();
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void chageWeapon(int idx) {
		
		if(idx <= heroWeapons.length) {
			wp= heroWeapons[idx];
			this.power = wp.getPower() + str;
			System.out.println("무기체인지: "+ heroWeapons[idx].getName());
		}else {
			System.out.println("무기변경불가");
		}
		
		
	}
	public void attack(Monster mon) {
		int attPint = power - mon.getShield();
		if(attPint<0) {
			attPint=0;
		}
		int monHp = mon.getHp() - attPint;
		if(monHp<=0) {
			mon.die();
		}else {
		mon.setHp(monHp);
		System.out.println(String.format("공격력: %d(파워%d-쉴드%d), 몬스터 남은피: %d", attPint, power,mon.getShield() , monHp));
		}
	}

}
