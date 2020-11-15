package GG;

import java.util.List;

public class Hero {
	List<Weapon> weaponList;
	Weapon w;

	public Hero(List<Weapon> weaponList, Weapon w) {
	super();
	this.weaponList = weaponList;
	this.w = w;
	}
	

	public List<Weapon> getWeaponList() {
		return weaponList;
	}


	public void setWeaponList(List<Weapon> weaponList) {
		this.weaponList = weaponList;
	}


	public Weapon getW() {
		return w;
	}


	public void setW(Weapon w) {
		this.w = w;
	}


	public void attack(Monster mon) {
		w.attack(mon);
	}
	
	public void ChangeWeapon(int idx) {
		
		try {
			w= weaponList.get(idx);
		} catch (Exception e) {
			idx=weaponList.size()-1;
		}
		System.out.println(w+"(으)로 변경");
	}

}
