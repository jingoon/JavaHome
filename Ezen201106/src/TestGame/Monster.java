package TestGame;

public class Monster {
	private int hp;
	private String name;
	private int shield;
	private int power;
	
	public void berserker() {
		int berserkerShield = shield/2;
		shield = berserkerShield;
		hp += berserkerShield;
		power += berserkerShield;
	}

	public Monster(int hp, String name, int shield, int power) {
		super();
		this.hp = hp;
		this.name = name;
		this.shield = shield;
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void die() {
		
			System.out.println("몬스터가 죽었습니다.");
			shield = 0;
			power =0;
			hp=0;
		
		
	}
	
	

}

