package Scanner;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력 받기

		boolean isTrue = true;
		int a = 0;
		while (isTrue) {
			System.out.println("a 값을 입력하세요.");
			a = sc.nextInt(); // 정수값 받기
			sc.nextLine(); // 엔터 없애기
			System.out.println("msg1값을 입력하세요.");
			String msg1 = sc.nextLine(); // 문자열값 받아서 msg1에 넣기
			System.out.println(msg1);

			if (a == 4) {
				break; // 4 입력시 while문 종료
			}
			System.out.println(a + "를 넘겨받았습니다.");
		}

		System.out.println("end");

		sc.close(); // 닫기
	}

	

}
