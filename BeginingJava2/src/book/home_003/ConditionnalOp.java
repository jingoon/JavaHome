package book.home_003;

public class ConditionnalOp {
	public static void main(String[] args) {
		
		int nHats=1;			//모자의 개수
		System.out.println("모자"+(nHats == 1 ?"가" : "들이")+nHats + "개 있다.");
		
		nHats++;				//모자의 개수 증가시키기
		System.out.println("모자"+(nHats == 1 ?"가" : "들이")+nHats + "개 있다.");
	}

}
