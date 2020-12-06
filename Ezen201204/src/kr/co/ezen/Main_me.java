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
		list=mdao.select();							//메뉴 테이블(fullname)을 가져와 리스트에 넣기
		for (int i = 0; i < list.size(); i++) {		// 맵에 메뉴를 넣는다.. key값이 숫자라서 list와 별반 차이없지만 
			menus.put(i, list.get(i));				// key값을 변경 하면 된다.
		}
		Scanner sc = new Scanner(System.in);
			
		List<String> names=new ArrayList<String>();	//메뉴 목록을 보여주기위해 name을 가져와 리스트에 넣는다
		names=mdao.selectName();
		while(true) {
			System.out.println("메뉴를 선택하세요");
			for (int i = 0; i < names.size(); i++) {
				System.out.print(i+"."+names.get(i));
				if(i!=list.size()-1) {
					System.out.print(", ");			// 마지막 메뉴를 , 를 붙이지 않는다
				}
			
			}
			System.out.println();
			int idx=sc.nextInt();				// 숫자를 입력받는다
			sc.nextLine();
			//입력받은 key 값으로 menus map을 가져와서 객체를 생성한다 
			Class<?> testclass = Class.forName(menus.get(idx));	// 문자열로 class를 만든다
			Constructor<?> cons= testclass.getConstructor();	// class의 생성자를 선언
			Command com = (Command) cons.newInstance();			// 객체를 만들고 Command로 케스팅 한다
			// Command com = new IsertCommand(); 와 같다.
			
			com.execute(sc);
		}
		
		
	}

}
