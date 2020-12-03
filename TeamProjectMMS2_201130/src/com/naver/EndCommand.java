package com.naver;

import java.util.Scanner;

public class EndCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("종료합니다.");
		sc.close();
		System.exit(0);
	}

	@Override
	public String toString() {
		return "0.종료 ";
	}
	

}
