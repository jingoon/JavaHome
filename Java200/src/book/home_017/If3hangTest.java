package book.home_017;

public class If3hangTest {
	public static void main(String[] args) {
		int year = 2020;

		String sEven = ((year % 2 == 0) ? "짝수해" : "홀수해");
		System.out.printf("%d는 %s입니다. %n", year, (year % 2 == 0) ? "짝수해" : "홀수해");
		System.out.printf("%d는 %s입니다. %n", year, sEven);

		System.out.println(year + "는 " + sEven + "입니다.");
		System.out.println(year + "는 " + ((year % 2 == 0) ? "짝수해" : "홀수해") + "입니다.");
	}

}
