package kr.co.ezen;

import java.awt.event.MouseWheelListener;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.InsertCommand;
import com.naver.MenuDAO;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;

public class MainEx {

	public static void main(String[] args) throws Exception {

		/*
		 * Command[] menus = {new InsertCommand(), new SelectCommand(), new
		 * UpdateCommand(), new DeleteCommand(), new EndCommand()};
		 */
		
		/*
		 * Map<Integer, Command> menus = new HashMap<Integer, Command>(); menus.put(0,
		 * new InsertCommand()); menus.put(1, new SelectCommand()); menus.put(2, new
		 * UpdateCommand()); menus.put(3, new DeleteCommand()); menus.put(4, new
		 * EndCommand());
		 */
		
		
		
		Map<Integer, String> menus = new HashMap<Integer, String>();
		
		MenuDAO dao = new MenuDAO();
		List<String> list = dao.select();
		
		for(int i=0;i<list.size();i++) {
			
			menus.put(i, list.get(i));
		}
		
		
//		menus.put(0, "com.naver.InsertCommand");
//		menus.put(1, "com.naver.SelectCommand");
//		menus.put(2, "com.naver.UpdateCommand");
//		menus.put(3, "com.naver.DeleteCommand");
//		menus.put(4, "com.naver.EndCommand");
//		menus.put(5, "com.naver.SelectByIdCommand");
		
				
		Scanner sc = new Scanner(System.in);
		
				
		while (true) {
			System.out.println("메뉴를 선택하세요.");
//			System.out.println("0: 등록, 1: 조회, 2: 수정, 3: 삭제, 4: 종료");
			
			
			StringBuffer sb = new StringBuffer();
			
			for(int i=0;i<list.size();i++) {
				String fullname = list.get(i);
				Class<?> testClass2 = Class.forName(fullname);
				Constructor<?> cons2 = testClass2.getConstructor();
				Command com2 = (Command)cons2.newInstance();
				
				sb.append(i);
				sb.append(": ");
				//0: 등록, 1: 조회, 2: 수정, 3: 삭제, 4: 종료,
				sb.append(com2.toString());
				sb.append(", ");
				
			}
			
			System.out.println(sb.toString());
			
			
			
			
			
			int idx = sc.nextInt();
			sc.nextLine();
			
			String str = menus.get(idx);
			
			Class<?> testClass = Class.forName(str);
			Constructor<?> cons = testClass.getConstructor();
			Command com = (Command)cons.newInstance();
			
			
			com.execute(sc);
		}
		
	
	
	}

}
