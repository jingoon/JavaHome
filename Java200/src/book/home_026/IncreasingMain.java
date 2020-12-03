package book.home_026;

public class IncreasingMain {
	
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 8; i >-1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int num=0;
		num=num+1;						//1
		num+=1;							//2
		System.out.println("1:"+num++);	//2++
		System.out.println("2:"+(++num));//++3
		num+=++num;							//num=num+(++num); 4+(++4)
		System.out.println("3:"+num);
		num=num+++(+num);					//에러 -> num=num++++num; 9+++(+9);
		System.out.println("4:"+num);
		num=num---num;						//num=num-(--num)9-(--9)
		System.out.println("5:"+num);
		num=num---(-num);					//에러 -> num=num----num; 1----(-1)
		System.out.println("6:"+num);
		num=num++ + ++num;					//에러 -> num=num++++++ num;
		System.out.println("7:"+num);
		num=num-- - --num;					//에러 -> num=num++++++ num;
		System.out.println("8:"+num);
		
	}

	
}
