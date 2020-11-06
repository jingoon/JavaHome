package IfAndMethod;
/* 
	- vol, ch, power
	+ volUp,Down, chUP,Down, power
-->	0<= ch <=999 ��ȯ 999���� 0 
-->	0<= vol <=100 100����,0�Ʒ��� �� �� ����.
-->�߰� 	������ ������ ch, vol �̵��Ұ�
-->�߰�	�Ŀ��� ����ġ�������� �Ѱ� ���� a=1-a;
*/
public class TV {
	
	private int vol;
	private int ch;
	private boolean power;
	
	public TV() {
		vol=0;
		ch=0;
		power=false;
	}

	public TV(int vol, int ch, boolean power) {
		super();
		this.vol = vol;
		this.ch = ch;
		this.power = power;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void power() {
		
		if(!power) {
			System.out.println("Ƽ�� �����ϴ�.");
		}else {
		System.out.println("Ƽ�� �����ϴ�.");
		}
		power = !power;
	}
	
	public void volUp() {
		if(!power) {
			return;
		}
		vol++;
		if(vol>100) {
			vol=100;
		}
	}
	
	public void volDown() {
		if(!power) {
			return;
		}
		vol--;
		if(vol<0) {
			vol=0;
		}
	}
	
	public void chUp() {
		if(!power) {
			return;
		}
		ch++;
		if(ch>999) {
			ch=0;
		}
	}
	
	public void chDown() {
		if(!power) {
			return;
		}
		ch--;
		if(ch<0) {
			ch=999;
		}
	}	
	
	public void getTvInfo() {
		System.out.println("ch:"+ch+", vol:"+vol);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
