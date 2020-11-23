package MainEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import SQL.Command;
import SQL.DeleteCommand;
import SQL.EndCommand;
import SQL.InsertCommand;
import SQL.SelectCommand;
import SQL.UpdateCommand;

public class MainEx {
	public static void main(String[] args) {
		
		Scanner	sc = new Scanner(System.in);
		
		List<Command> list = new ArrayList<Command>();
		list.add(new EndCommand());
		list.add(new InsertCommand());
		list.add(new SelectCommand());
		list.add(new UpdateCommand());
		list.add(new DeleteCommand());
		
		// �ߺ�id ��� �Ұ������� ������Ʈ
		
		int index=0;
		
		try {
			while(true) {
				System.out.println("�޴��� �����ϼ���");
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i)+"  ");
				}
				System.out.println();
				index = sc.nextInt();
				sc.nextLine();
				list.get(index).execut(sc);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}

}
