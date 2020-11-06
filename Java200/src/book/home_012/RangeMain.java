package book.home_012;

public class RangeMain {
	
	public static void main(String[] args) {
		{//시작 블록 D
			int d=10;
			{//시작 블록 C
				int c=20;
				{//시작 블록 B
					int b=30;
					{//시작 블록 A
						int a=40;
						//a,b,c,d 모두 사용 가능
						a=200;
						b=1000;
						c=2000;
						d=50;
						System.out.println("1:"+a+" "+b+" "+c+" "+d);
						System.out.println(String.format("1:%d %d %d %d",a,b,c,d ));
					}//end A
					b=200;
					c=300;
					d=60;
					//b,c,d가 살 수 있다.
					System.out.printf("2:%d %d %d %n",b,c,d);
				}//end B
				c=300;
				d=70;
				//c,d가 살 수 있다.
				System.out.printf("3:%d %d \n",c,d);
			}//end C
			d=80;//d만 살 수 있다.
			System.out.println(String.format("4:%d", d));
		}//end D
	}//main
}//class
