package MainExmple;

import ListExmple.ListEx;
import SetExmple.SetEx;

public class MainEx {
	public static void main(String[] args) {
		ListEx list1 = new ListEx();
		
		list1.me2();
		list1.me3();
		System.out.println(list1.me7());
		
		SetEx set1 = new SetEx();
		System.out.println("===set1.me1===");
		set1.me1();
		set1.me2();
		set1.me3();
		set1.me4();
		
	}

}
