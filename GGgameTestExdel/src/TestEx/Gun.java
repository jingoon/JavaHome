package TestEx;

public class Gun extends Weapon{

	public Gun() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gun(String name, int power) {
		super(name, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bow [getName()=" + getName() + "]";
	}

	
}
