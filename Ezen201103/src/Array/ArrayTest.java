package Array;

public class ArrayTest {

	// 배열의 선언 3가지 방법
	public void me1() {
		int[] arrInt = new int[3]; // 1번
		int[] arrInt2 = { 1, 2, 4 }; // 2번
		int[] arrInt3 = new int[] { 2, 3, 5 }; // 3번

		System.out.println(arrInt.length);
		arrInt[arrInt.length - 1] = 99;
	}

	public void me2() {
		Dog[] dogs = new Dog[5];
		Dog[] dogs2 = { new Dog(), new Dog(), new Dog() };
		Dog[] dogs3 = new Dog[] { new Dog(), new Dog(), new Dog() };

		int dogsSize = dogs.length;
		System.out.println(dogsSize);
	}

	public Dog[] me3(Dog[] dogs) {
		int dogsSize = dogs.length;
		System.out.println(dogsSize);
		return dogs;
	}

	public void me4(Dog[] dogs) {

		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}

		// dogs[2]=null;

		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] == null) {
				continue;
			}
			System.out.println(dogs[i].getDogName());
		}
		// dogs[2]=new Dog("셰퍼트!");
	}

	public Dog[] me5(Dog[] dogs5) {
		String str = "첫째독#둘째 독# 셋째 독# 4남독 #5여독!";
		String[] arrStr = str.split("#");
		System.out.println(arrStr.length);
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
			dogs5[i].setDogName(arrStr[i]);

		}
		return dogs5;
	}
		//피보나치 수열
	public void pibo() {
		int[] pibo = new int[20];
		int a=1, b=1;
		for(int i =2;i<pibo.length;i++) {
			int c= a+b;
			pibo[i]=c;
			
			System.out.println(c);
			a=b;
			b=c;
		}
		pibo[0]=1;
		pibo[1]=1;
		for(int i=0;i<pibo.length;i++) {
			System.out.println(pibo[i]);
		}
	}

}
