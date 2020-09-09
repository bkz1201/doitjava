package chapter05;

public class Student {//멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;//필드

	// 메소드 메소드명(){행위}	//멤버함수
	public void showStudentInfo() { // void 아무것도 리턴하지않는다.
		// public 제한없이 누구나 호출 가능
		System.out.println(studentName + ", " + address);
	}//메소드
}