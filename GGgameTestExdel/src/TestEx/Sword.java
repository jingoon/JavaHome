package TestEx;

public class Sword extends Weapon{

	public Sword() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sword(String name, int power) {
		super(name, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bow [getName()=" + getName() + "]";
	}

	
}
