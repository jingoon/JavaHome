package ListExmple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListEx {
	
	public void me1() {
		List<Apple> list = new ArrayList<Apple>();
		
		list.get(0);	// ù��° ��ü ������
				
	}
	public void me2() {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //��� ��ü ���
		}
		
		
		list.set(1, 10);	//4�� 10���� ����
		list.remove(3);	//Integer 3���� index 3 �� �켱 �ν�
		list.remove(new Integer(3));
		System.out.println(list); //��� ��ü ���2
		
		for (int i =list.size()-1; i >=0 ; i--) {
			list.remove(i);		//�ϳ��� ��� ���� �ڹ����� ����
		}
		
	}
	public void me3() {
		List<Double> list = new ArrayList<Double>();
		
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);
		list.add(11.2);
		
		double d = list.get(list.size()-1);
		System.out.println(d);		//������ ��ü ���
		
		list.remove(1);		//�ι�° �ε��� ����
		list.remove(9.8);	// 9.8 ��ü ����
		System.out.println(list);
		
		list.clear(); 		//��� ��ü ����
		
	}
	public void me4() {
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		
	}
	public void me5() {
		List<Thread> list = new ArrayList<Thread>();
		
		list.add(new Thread());
		list.add(new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}));
	}
	public void me6() {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(new HashMap<String, Object>());
	}
	
	public List<UserDTO> me7() {
		List<UserDTO> list = new ArrayList<UserDTO>();
		
		UserDTO user1 = new UserDTO("b001", "gun", 43);
		
		list.add(user1);
		list.add(new UserDTO("a001", "kim", 23));
		list.add(new UserDTO("c002", "cha", 18));
		list.add(new UserDTO("d123", "ban", 60));
		
		list.set(2,new UserDTO("572", "����", 0));
		list.remove(new UserDTO("572", null, 0));
		return list;
		
	}
		
}
