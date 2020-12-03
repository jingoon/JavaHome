package kr.co.ezen;

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
import com.naver.SelectCommand;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		//map 메뉴
		mapMenu(sc);
		
		//lset 메뉴
//		listMenu(sc);
		
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
		map.put("insert", new InsertCommand_jin());
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
