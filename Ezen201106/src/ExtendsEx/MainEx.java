package ExtendsEx;

import Extends.Car;
import Extends.Sonata;

public class MainEx {

	public static void main(String[] args) {
	
		Sonata sonata1 = new Sonata();
		Car sonata2 = new Sonata();
		Car[] arrCar = {sonata1, sonata2};	// �θ�ü �ڷ������� �迭����
			
		sonata1.run();
		sonata2.run();
		
		sonata1.stop();
		sonata2.stop();
		
		sonata1.only();
	//	sonata2.only();	 �ڷ����� Car �� ����
		
	//	((Sonata) sonata2).only();	
		//type�� Sonata�� cast ���ָ� ������ ���ܰ˻��ؾ���
		
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
