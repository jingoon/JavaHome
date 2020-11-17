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
		boolean s = set.add(2);	//false ������ �ߺ����� �Է¾ȵ�
		set.add(3);	//false
		
		System.out.println(s);
		System.out.println(set);
		
		
	}
	
	public void me2() {
		
		Set<String> set	= new HashSet<String>();
		
		set.add("hello");
		set.add(new String("hello"));	//�ߺ�
		set.add("hello");	//�ߺ�
		set.add("Hello");		
		set.add(new String("Hello"));	//�ߺ�
		set.add("HELLO");
		set.add(new String("HELLO"));	//�ߺ�
		
		
		System.out.println(set);	//�Է¼����� ��µ��� ����
		
		
	}
	
	public void me3() {
		
		Set<Apple> set = new HashSet<Apple>();
		
		set.add(new Apple("a001", "����", "���", 1500));
		set.add(new Apple("a001", "����", "�ɻ��", 500));
		set.add(new Apple("a002", "����", "��", 3500));
		set.add(new Apple("a003", "�λ�", "���", 2500));
		set.add(new Apple("a004", "���", "��", 1500));
		
		System.out.println(set); //id�� �� �ߺ��� ���� �ȵ� 

	}
	
	public void me4() {
		Set<UserDTO> set = new HashSet<UserDTO>();

		set.add(new UserDTO("m001", "kim", 4));
		set.add(new UserDTO("m002", "lee", 11));
		set.add(new UserDTO("m005", "park", 32));
		set.add(new UserDTO("m002", "kang", 43)); // false id�����
		set.add(new UserDTO("m005", "choi", 2)); // false
		
		System.out.println(set);

	}
	
	

}
