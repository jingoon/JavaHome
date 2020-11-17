package MainExmple;

import CalendarExmple.CalendarEx;
import RandomExmple.RandomEx;
import WrapperExmple.WrapperEx;

public class MainEx {
	public static void main(String[] args) {
		
		CalendarEx c = new CalendarEx();
		c.me1();
		System.out.println("=====2====");
		c.me2();
		System.out.println("=====3=====");
		c.me3();
		System.out.println("=4=");
		c.me4();
		System.out.println("=5=");
		c.me5();
		System.out.println("=7=");
		c.me7();
		
		RandomEx r = new RandomEx();
		System.out.println("==r1==");
		r.me1();
		System.out.println("==2==");
		r.me2();
		System.out.println("==3==");
		r.me3(3, 10);
		System.out.println("==4==");
		r.me4();
		System.out.println("==5==");
		r.me5();
		
		WrapperEx w = new WrapperEx();
		System.out.println("=====w.me4=");
		w.me4();
	}

}
