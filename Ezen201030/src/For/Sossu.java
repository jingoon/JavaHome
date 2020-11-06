package For;

public class Sossu {

	public Sossu() {
		// TODO Auto-generated constructor stub
	}
	
	//소수 판별하기
	//소수: 1과 자기자신 밖에 약수가 없는 수
	
	public void sossu(int num) {// 정수 넘겨 받기
		for(int i=2;i<num;i++) {// 2 ~ num 바로 앞 숫자 까지 약수확인(1과 자기 자신 빼고 검사)
			if(num%i==0) {		// 나머지가 0이면 약수
				System.out.println(num+"은 소수 아님");//약수면 소수아님
				break;			//약수를 찾으면 else if는 패스
			}else if(i==num-1) {//약수가 없을 때 넘 바로 앞까지 다 검사한건가?
				System.out.println(num+"은 소수 이다.");//약수가 없다면 소수
			}
		}
	}
}
