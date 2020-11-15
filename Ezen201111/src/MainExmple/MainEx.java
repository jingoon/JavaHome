package MainExmple;

import ExceptionExmple.DoNotExceptionExtends;
import ExceptionExmple.ExceptionEx;

public class MainEx {
	public static void main(String[] args) {

		ExceptionEx e1 = new ExceptionEx();
		// e1.me1();

		e1.me11(0); // (예외발생하지않음) try 실행
		e1.me11(-1);// (예외발생함) catch 실행

		e1.me12(2);
		e1.me12(100); // 예외발생 코드

		e1.me2(1);
		e1.me2(0); // 예외발생 입력

		try {
			e1.me3(100); // 예외가 발생해도 멈추지 않음
		} catch (Exception e3) {
			e3.printStackTrace();
			System.out.println("100입력시 문제있음");
		}

		try {
			e1.me3141("넌 최고야"); // throws가 날라옴 //예외의 발생 가능성이 있다면 호출시 선택지 제공 try~catch
		} catch (Exception e2) {
			e2.printStackTrace();
			System.out.println("넌 최고야 문제없음");
		}
		try {
			e1.me3141("개새끼"); // throws가 날라옴
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("개새끼 입력시 문제있음");
		}

		// e1.me4("개새끼"); //예외 발생시 바로 실행 중단

		// e1.me4151("개새끼"); //예외 발생시 바로 실행 중단

		try {
			e1.me5("개새끼");
		} catch (DoNotExceptionExtends e) {
			e.printStackTrace();
		}

	}

}
