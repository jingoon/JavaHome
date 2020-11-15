package GG;

public class Sword extends Weapon{

	public Sword(String name, int power) {
		super(name, power);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void img() {
		System.out.println("검으로 베는 img");
	}

}
