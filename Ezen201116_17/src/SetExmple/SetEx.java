package SetExmple;

import java.util.HashSet;
import java.util.Set;

import ListExmple.Apple;
import ListExmple.UserDTO;

public class SetEx {
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set.remove(1));
		set.add(4);
		boolean s = set.add(2);	//false 데이터 중복으로 입력안됨
		set.add(3);	//false
		
		System.out.println(s);
		System.out.println(set);
		
		
	}
	
	public void me2() {
		
		Set<String> set	= new HashSet<String>();
		
		set.add("hello");
		set.add(new String("hello"));	//중복
		set.add("hello");	//중복
		set.add("Hello");		
		set.add(new String("Hello"));	//중복
		set.add("HELLO");
		set.add(new String("HELLO"));	//중복
		
		
		System.out.println(set);	//입력순으로 출력되지 않음
		
		
	}
	
	public void me3() {
		
		Set<Apple> set = new HashSet<Apple>();
		
		set.add(new Apple("a001", "서울", "사과", 1500));
		set.add(new Apple("a001", "대전", "꽃사과", 500));
		set.add(new Apple("a002", "서울", "배", 3500));
		set.add(new Apple("a003", "부산", "사과", 2500));
		set.add(new Apple("a004", "경기", "감", 1500));
		
		System.out.println(set); //id만 비교 중복값 저장 안됨 

	}
	
	public void me4() {
		Set<UserDTO> set = new HashSet<UserDTO>();

		set.add(new UserDTO("m001", "kim", 4));
		set.add(new UserDTO("m002", "lee", 11));
		set.add(new UserDTO("m005", "park", 32));
		set.add(new UserDTO("m002", "kang", 43)); // false id동등성비교
		set.add(new UserDTO("m005", "choi", 2)); // false
		
		System.out.println(set);

	}
	
	

}
