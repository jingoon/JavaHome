package While;

public class WhileTest {

	// 1)0.1.2.3.4.5...10
	public void w1() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		System.out.println();
	}

	// 2) 0.2.4.6.8...22
	public void w2() {
		int i = 0;
		while (i < 23) {
			System.out.println(i);
			i += 2;
		}
		System.out.println();

	}

	// 21) 39.37.35.33..21
	public void w21() {
		int i = 39;
		while (i >= 21) {
			System.out.println(i);
			i -= 2;
		}
		System.out.println();
	}

	// dan) n단
	public void dan(int dan) {
		int i = 1;
		while (i < 10) {
			StringBuffer sb = new StringBuffer();
			sb.append(dan);
			sb.append("x");
			sb.append(i);
			sb.append("= ");
			sb.append(i * dan);
			String sDan = sb.toString();
			System.out.println(sDan);
			i++;
		}
		System.out.println();
	}

	// 3) *을 n개 출력
	public void w3(int num) {
		int i = 0;
		while (i < num) {
			System.out.print('*');
			i++;
		}
		System.out.println();
	}

	// 31) 3을 호출해서 n번째줄 까지 늘어나는 * 출력
	public void w31(int num) {
		int i = 0;
		while (i < num) {
			w3(i + 1);
			i++;
		}
	}

	// 32) 3을 호출해서 n벌째 줄까지 홀수로 늘어나는 * 을 출력
	public void w32(int num) {
		int i = 0;
		while (i < num * 2) {
			if (i % 2 == 0) {
				w3(i + 1);
			}
			i++;
		}
	}

	// gugudan) dan를 호출, 구구단 출력
	public void gugudan() {
		int i = 2;
		while (i < 10) {
			System.out.println("< " + i + "단 >");
			dan(i);
			i++;
		}
		System.out.println();
	}

	// pibo)(주어진 두수1.1)2.3.5.8.13.21...
	// ->피보나치 수열 출력 n번째 피보나치수p(n) = p(n-1)+p(n-2)
	public void pibo(int num) {
		int i = 0;
		int a = 1;
		int b = 1;
		while (i < num) {
			int c = a + b;
			if (i == num - 1) {
				System.out.println(c);
			}
			// 1,1,2
			// a,b,c
			// - a,b,c
			// - -,a,b,c
			a = b;
			b = c;
			i++;
		}
		System.out.println();
	}

	// 4)0~9까지 4와 8을 빼고 출력
	public void w4() {
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0) { // 4의 배수 넘기기
				i++; // 안쓰면 무한루프
				continue; // 해당 회차 넘김
			}
			System.out.println(i);
			i++;
		}
		System.out.println();
	}

	// 5)0~10까지 4의 배수검출, 반복문 중단
	public void w5() {
		int i = 0;
		while (i < 10) {
			if (i % 4 == 0 && i != 0) {
				System.out.println(i + "(이)가 4의 배수임 반복문 중단");
				break;
			}
			System.out.println(i);
			i++;
		}

	}

	// 51) 소수 검사 하는 메서드
	public boolean w51(int num) {
		int i = 2;
		boolean result = false;
		while (i < num) {
			if (num % i == 0) {
				break;
			} else if (i == num - 1) {
				result = true;
			}
			i++;
		}
		return result;

	}

	// 52) 99~2까지 중 출력, 소수를 만나면 출력 종료
	public void w52() {
		int i = 99;
		while (i >= 2) {
			boolean sosu = w51(i);
			if (sosu) {
				System.out.println(i + "= 가장가까운 소수");
				break;
			}
			i--;
		}
	}

}
