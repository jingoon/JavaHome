package Scanner;

import java.util.Scanner;

public class ScanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Ű���� �Է� �ޱ�

		boolean isTrue = true;
		int a = 0;
		while (isTrue) {
			System.out.println("a ���� �Է��ϼ���.");
			a = sc.nextInt(); // ������ �ޱ�
			sc.nextLine(); // ���� ���ֱ�
			System.out.println("msg1���� �Է��ϼ���.");
			String msg1 = sc.nextLine(); // ���ڿ��� �޾Ƽ� msg1�� �ֱ�
			System.out.println(msg1);

			if (a == 4) {
				break; // 4 �Է½� while�� ����
			}
			System.out.println(a + "�� �Ѱܹ޾ҽ��ϴ�.");
		}

		System.out.println("end");

		sc.close(); // �ݱ�
	}

	

}
