package SQL;

import java.util.Scanner;

public class EndCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		System.out.println("종료 합니다");
		System.exit(0);
		
	}
	@Override
	public String toString() {
		return "0 종료";
	}

}
