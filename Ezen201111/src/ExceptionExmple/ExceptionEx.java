package ExceptionExmple;

import javax.management.RuntimeErrorException;

public class ExceptionEx {
	
	public void me1() {
		
		String msg = null;
		
		char c = msg.charAt(0); //NullpointerException 발생
	}
	
	public void me11(int idx) {
		
		String msg = "hello";
		
		try {
			char c = msg.charAt(idx);	// 예외 발생 가능 코드
			System.out.println("1:예외 발생하지 않음:"+ c);
		} catch (Exception e) {
			System.out.println("2:예외 발생"); //예외 발생시 실행
		}
	}
	public void me12(int idx) {
		
		String[] arr = {"활", "검","총"};
		
		try {
			System.out.println("3:예외 발생 전 출력: ");//예외가 발생하지만 그전에 출력
			System.out.println("4:arr[idx]: "+arr[idx]);
			System.out.println("5:예외 발생하면 출력하지 않음"); 
		} catch (Exception e) {
			System.out.println("6:예외 발생 ");
		}
		
	}
	public void me2(int num) {
		int a = 5;
		try {
			a/=num;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("0으로 나누면 에러발생");
			return;				// 에러가 발생해서 해당 메서드 종료
		} finally {			//catch 보다 먼저 실행함
			System.out.println("예외가 발생하든 발생하지 않든 반드시 실행함"); 
			System.out.println("return; 보다 더 강력하다");
		}
		
	}
	public void me3(int index) throws Exception{
		String msg = "hello";
		System.out.println(msg.charAt(index));
	}
	public void me3141(String msg) throws Exception { //호출 시 예외발생 가능성이 있다고 throw를 던짐
		if(msg.equals("개새끼")) {
			throw new Exception("Exction: 욕설금지");
		}
		System.out.println(msg);
	}
	
	public void me4(String msg) {
		if(msg.equals("개새끼")) {
			throw new RuntimeException("RuntimeExction: 욕설금지");
		}
		System.out.println(msg);
	}
	public void me4151(String msg) {
		if(msg.equals("개새끼")) {
			throw new DoNotRuntimeExceptionExtends("사용자정의 throw: 욕설금지");
		}
	}
	public void me5(String msg) throws DoNotExceptionExtends {
		if(msg.equals("개새끼")) {
			throw new DoNotExceptionExtends("사용자정의 throws: 욕설금지");
		}
		
	}
	
	
	

}
