package book.home_015;

public class MathTestMain {
	public static void main(String[] args) {
		
		
		//constant
		System.out.println("1 Math.E"+Math.E);
		System.out.println("2 Math.PI"+Math.PI);
		
		//method
		System.out.println("3: Math.abs(-5)절대값:"+Math.abs(-5));
		System.out.println("4: Math.ceil(4.34)올림:"+Math.ceil(4.34));
		System.out.println("5: Math.round(4.34)반올림:"+Math.round(4.34));
		System.out.println("6: Math.floor(4.34)버림:"+Math.floor(4.34));
		System.out.println("7: Math.rint(4.34)반올림:"+Math.rint(4.34));
		System.out.println("8: Math.max(45,78)"+Math.max(45, 78));
		System.out.println("9: Math.min(45,78)"+Math.min(45, 78));
		System.out.println("10: Math.pow(2,4)"+Math.pow(2, 4));
		System.out.println("11: Math.log(30)"+Math.log(30));
		System.out.println("12: Math.exp(3)"+Math.exp(3));
		System.out.println("13: Math.sqrt(10)"+Math.sqrt(10));
		System.out.println("14: Math.sin(Math.toRadians(90))"+Math.sin(Math.toRadians(90)));
		System.out.println("15: Math.cos(Math.toRadians(180))"+Math.cos(Math.toRadians(180)));
		
		//random
		double dRan=Math.random();				// 0<==dRan<1 실수
		int iRan=(int)(Math.random()*100);		// 0<==iRan<100 정수
		System.out.println("16: Math.random()=>"+dRan);
		System.out.println("17: (int)(Math.random()*100)=>"+iRan);
	
	}

}
/* 다음엔 가장 간편하게 하기 일단 번거롭게 기본으로
//1.캘린더 객체 생성

//2.현재 연도 , 월 , 일 , 요일 을 캘린더에서 추출하여 각각 출력

//3.1950.6.25 날짜 출력 set( , ,)
//무슨요일인가?

//4. 해당월의 마지막 날은 몇일 까지인가?(30,31,28,29)
//4-1 1950년 2월의 마지막 날은 몇일까지인가?
배열로 일~토
//마지막날은 무슨 요일인가?

//5달력만들기 패스

//6.2020년 11월 12일 의 20일후의 날짜는?add
//6-1. 20일 후의 날짜 정보. clone()을 이용

//7.현재 날짜를 Date로 형변환
//20일 후의 날짜가 어떻게 변하나(날짜정보만) roll
//월, 일, 요일 출력
 *c.set과의 차이가 뭔가?

//8. 캘린더타입의 형변환
//캘린더 타입 c를 선언하고 데이터 타입 d로 변환
//데이터타입 d를 선언하고 캘린더 타입c로 변환

//9.현재 날짜와 시간을 캘린더에서 데이터타입으로 형변환
//YYYY-MM-dd-hh-mm-ss형식으로 포멧하여 출력
 * 
//Wrapper
//1. 기본자료형의 초기화
//2. 레퍼클래스의 초기화
//3. //AutoUnBoxing
boolean a = new Boolean(false);
Character b = new Character('c');
//char bb=b;
//4.문자열을 기본자료형으로 변경하는 방법1 parse
*4-1.문자열을 기본자료형으로
변경하는 방법2 valueof*6. Charater.parse.Charater()와 Charater.valueof()는 없다*
대신 문자열.chsrAt();을 사용
//Random
랜덤객체생성
	랜덤값의

범위 (int start~end)출력
	랜던객체 1,2 생성 같은 시드로 돌리면
*/

