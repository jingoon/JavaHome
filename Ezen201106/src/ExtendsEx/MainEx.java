package ExtendsEx;

import Extends.Car;
import Extends.Sonata;

public class MainEx {

	public static void main(String[] args) {
	
		Sonata sonata1 = new Sonata();
		Car sonata2 = new Sonata();
		Car[] arrCar = {sonata1, sonata2};	// 부모객체 자료형으로 배열선언
			
		sonata1.run();
		sonata2.run();
		
		sonata1.stop();
		sonata2.stop();
		
		sonata1.only();
	//	sonata2.only();	 자료형이 Car 라서 오류
		
	//	((Sonata) sonata2).only();	
		//type을 Sonata로 cast 해주면 돼지만 예외검사해야함
		
		Sonata s = null;
		if(sonata2 instanceof Sonata) {
			s= (Sonata) sonata2;
			s.only();
		}
		
		if( sonata2 instanceof Car) {
			s=(Sonata) sonata2;
			s.only();
		}
		
		// or
		
		Sonata ss = null;
		if(sonata2.getClass()==Sonata.class) {
			ss=(Sonata) sonata2;
			ss.only();
		}
		
		
		
		
	}	
}
