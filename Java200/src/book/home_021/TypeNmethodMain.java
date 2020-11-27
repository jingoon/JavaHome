package book.home_021;

public class TypeNmethodMain {
	public static void main(String[] args) {
		
		// 기본 타입
		int myId=1001;
		int yourId=1002;
		
		//Reference type -- Predefined
		String myName="park";
		String yourName=new String("goblean");
		
		//참조 타입 - 사용자 정의
		Student stu = new Student();
		stu.setId(yourId);
		stu.setName(myName);
		
		//메서드 호출
		printInfor(myId, yourName);
		printInfor(stu);
		
	}
	
	public static void printInfor(int id, String name) {
		System.out.println("ID는"+id+", 이름은"+name+"이다.");
		
	}
	public static void printInfor(Student st) {
		System.out.println("ID는"+st.getId()+", 이름은"+st.getName()+"이다.");
		
	}
}
