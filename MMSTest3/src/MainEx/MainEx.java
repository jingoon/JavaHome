package MainEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import MMSEx.Command;
import MMSEx.DeleteCommand;
import MMSEx.EndCommand;
import MMSEx.InsertCommand;
import MMSEx.SelectCommand;
import MMSEx.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Command> list = new ArrayList<Command>();
		list.add(new EndCommand());
		list.add(new InsertCommand());
		list.add(new SelectCommand());
		list.add(new UpdateCommand());
		list.add(new DeleteCommand());
		
		
		boolean ok = true;
		while(ok) {
			System.out.println("메뉴를 선택하세요");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+"  ");
			}
			System.out.println();
			int index=sc.nextInt();
			sc.nextLine();
			
			list.get(index).execute(sc);
			
		
		}
		
		sc.close();
	}
}
