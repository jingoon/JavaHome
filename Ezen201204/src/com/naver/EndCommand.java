package com.naver;

import java.util.Scanner;

public class EndCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("�����մϴ�.");
		sc.close();
		System.exit(0);
	}

	@Override
	public String toString() {
		return "���� ";
	}
	

}
