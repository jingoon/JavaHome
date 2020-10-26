package home.doitJava;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName ="이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		studentLee.setStudentName("이순신장군"); //lee의 이름 변경
		String getName= studentLee.getStudentName();
		System.out.println(getName);			// 변경 이름 확인
		studentLee.showStudentInfor();			// 이름이 변경된 인포
	}
}
