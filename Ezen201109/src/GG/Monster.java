package GG;

public class Monster {

	private int hp;

	public Monster(int hp) {
		super();
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Monster [hp=" + hp + "]";
	}
	
}
