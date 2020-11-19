package TestEx;

import java.util.List;

public class Hero {
	
	List<Weapon> listw;
	Weapon w;
	public Hero(List<Weapon> listw, Weapon w) {
		super();
		this.listw = listw;
		this.w = w;
	}
	public void attack(Monster mon) {
		w.attack(mon);
	}
	public void weponChange(int index) {
		
		
			try {
				if(index <0);
				if(index >= listw.size());
			} catch (Exception e) {
				System.out.println("없는 무기");
			}
			
		w = listw.get(index);
	}
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public List<Weapon> getListw() {
		return listw;
	}

	public void setListw(List<Weapon> listw) {
		this.listw = listw;
	}

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}
	
	


}
