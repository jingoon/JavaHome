package kr.co.ezen;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.naver.Command;
import com.naver.MenuDAO;

public class Main_me {
	public static void main(String[] args) throws Exception {
		
		
		Map<Integer, String> menus = new HashMap<Integer, String>();
		MenuDAO mdao = new MenuDAO();
		List<String> list = new ArrayList<String>();
		list=mdao.select();							//�޴� ���̺�(fullname)�� ������ ����Ʈ�� �ֱ�
		for (int i = 0; i < list.size(); i++) {		// �ʿ� �޴��� �ִ´�.. key���� ���ڶ� list�� ���� ���̾����� 
			menus.put(i, list.get(i));				// key���� ���� �ϸ� �ȴ�.
		}
		Scanner sc = new Scanner(System.in);
			
		List<String> names=new ArrayList<String>();	//�޴� ����� �����ֱ����� name�� ������ ����Ʈ�� �ִ´�
		names=mdao.selectName();
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			for (int i = 0; i < names.size(); i++) {
				System.out.print(i+"."+names.get(i));
				if(i!=list.size()-1) {
					System.out.print(", ");			// ������ �޴��� , �� ������ �ʴ´�
				}
			
			}
			System.out.println();
			int idx=sc.nextInt();				// ���ڸ� �Է¹޴´�
			sc.nextLine();
			//�Է¹��� key ������ menus map�� �����ͼ� ��ü�� �����Ѵ� 
			Class<?> testclass = Class.forName(menus.get(idx));	// ���ڿ��� class�� �����
			Constructor<?> cons= testclass.getConstructor();	// class�� �����ڸ� ����
			Command com = (Command) cons.newInstance();			// ��ü�� ����� Command�� �ɽ��� �Ѵ�
			// Command com = new IsertCommand(); �� ����.
			
			com.execute(sc);
		}
		
		
	}

}
