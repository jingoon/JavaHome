package com.naver;

import java.util.Scanner;

public class End implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("���� �մϴ�");
		System.exit(0);
		
	}

	@Override
	public String toString() {
		return "0.End ";
	}
	

}
