package kr.co.ezen;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.UpdateCommand;
import com.naver.InsertCommand;
import com.naver.InsertCommand_jin;
import com.naver.MenuDAO;
import com.naver.SelectCommand;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		//map 메뉴
//		mapMenu(sc);
		//lset 메뉴
//		listMenu(sc);
		
		
		Map<Integer, String> menus = new HashMap<Integer, String>();
		MenuDAO dao = new MenuDAO();
		List<String> list = new ArrayList<String>();
		list= dao.select();
		for (int i = 0; i < list.size(); i++) {
			menus.put(i, list.get(i));
		}
		
//		menus.put(0, "com.naver.InsertCommand");
//		menus.put(1, "com.naver.SelectCommand");
//		menus.put(2, "com.naver.UpdateCommand");
//		menus.put(3, "com.naver.DeleteCommand");
//		menus.put(4, "com.naver.EndCommand");
				
		while(true) {
			System.out.println("메뉴를 입력해 주세요6.");
//			System.out.println("0.입력 1.조회 2.수정 3.삭제 4.종료");
			StringBuffer sb = new StringBuffer();
			Command com2 = null;
			for(int i=0;i<list.size();i++) {
				String fullname=list.get(i);
				try {
					Class<?> testClass2 = Class.forName(fullname);
					Constructor<?> cons2 = testClass2.getConstructor();
					com2 =(Command)cons2.newInstance();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				sb.append(i);
				sb.append(" : ");
				//0: 등록, 1: 조회
				sb.append(com2.toString());
				sb.append(", ");
				
			}
			System.out.println(sb.toString());
			int idx=sc.nextInt();
			sc.nextLine();
			com2.execute(sc);
			
			
//			int idx=sc.nextInt();
//			sc.nextLine();
//			
//			Command com = null;
//			try {
//				Class<?> testClass = Class.forName(menus.get(idx));
//				Constructor<?> cons = testClass.getConstructor();
//				com = (Command) cons.newInstance();
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			} catch (NoSuchMethodException e) {
//				e.printStackTrace();
//			} catch (SecurityException e) {
//				e.printStackTrace();
//			} catch (InstantiationException e) {
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				e.printStackTrace();
//			} catch (IllegalArgumentException e) {
//				e.printStackTrace();
//			} catch (InvocationTargetException e) {
//				e.printStackTrace();
//			}
//			
//			com.execute(sc);
		}
		
	}
	
	public static void listMenu(Scanner sc) {
		List<Command> coms = new ArrayList<Command>();
		coms.add(new EndCommand());
		coms.add(new InsertCommand_jin());
		coms.add(new SelectCommand());
		coms.add(new UpdateCommand());
		coms.add(new DeleteCommand());
		
		
		
		while (true) {
			System.out.println("메뉴를 선택하세요");
			for (int i = 0; i < coms.size(); i++) {
				System.out.print(coms.get(i));
			}
			try {
				System.out.println();
				int index=sc.nextInt();
				sc.nextLine();
				
				coms.get(index).execute(sc);
			} catch (Exception e) {
				System.out.println("0~4 중 하나를 선택하세요.");
			}
		}
	}
	public static void mapMenu(Scanner sc) {
//		 map목록 버전
		Map<String, Command> map = new HashMap<String, Command>();
		map.put("end", new EndCommand());
		map.put("insert", new InsertCommand());
		map.put("select", new SelectCommand());
		map.put("update", new UpdateCommand());
		map.put("delete", new DeleteCommand());
		
		
		
		while(true) {
			Set<String> set= map.keySet();
			Iterator<String>it= set.iterator();
			System.out.println("메뉴를 입력해 주세요.");
			while(it.hasNext()){
				String key=it.next();
				System.out.print("["+key+"] ");
			}
			try {
				String key=sc.nextLine();
				map.get(key).execute(sc);;
			} catch (Exception e) {
				System.out.println("메뉴를 타이핑 하세요");
			}
		}
		
	}
	
}
