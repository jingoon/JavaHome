package book.home_009;

public class DataTypes {

	public static void main(String[] args) {
		// 기본 타입
		int privateInt = 19;
		double privateLong = 3.1415;
		// 참조 타입
		String refStr = "안녕하세요";
		Object refObj = new Object();
		
		// 랩퍼 클래스(참고)
		// Integer wrapInt = new Integer(19); 지원중단
		// Double wrapDouble = new Double(3.14159) 지원중단
		
		// 배열(참고)
		int a[] = {1,2,3};
		System.out.println("1: "+privateInt);
		System.out.println("2: "+privateLong);
		System.out.println("3: "+refStr);
		System.out.println("4: "+refStr.indexOf('녕'));
		System.out.println("5: "+refStr.hashCode());
		System.out.println("6: "+refObj);
		System.out.println("7: "+refObj.getClass());
		System.out.println("8: "+refObj.hashCode());
		System.out.println("13: "+a);
		System.out.println("14: "+a.length);
		System.out.println("15: "+a[1]);
		
	}

}
