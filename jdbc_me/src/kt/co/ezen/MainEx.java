package kt.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.Delete;
import com.naver.End;
import com.naver.Insert;
import com.naver.Select;
import com.naver.SelectBymid;
import com.naver.Update;

public class MainEx {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		List<Command> list = new ArrayList<Command>();
		list.add(new End());
		list.add(new Insert());
		list.add(new SelectBymid());
		list.add(new Select());
		list.add(new Update());
		list.add(new Delete());
		
		while(true){
		System.out.println();
		System.out.println("메뉴를 선택하세요");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		int index=sc.nextInt();
		sc.nextLine();
		
		list.get(index).execute(sc);
		}
	
		
	}

}
