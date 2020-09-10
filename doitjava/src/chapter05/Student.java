package chapter05;

public class Student {
	// 멤버변수 필드
	int studentID;
	String studentName;
	int grade;
	String address;// 필드

	/* 생성자 - 객체를 생성할때 실행하는 블록 */
	// 생성자는 클래스 이름과 같아야한다.
	// 생성자 입력하지않았을때 디폴트 값으로 실행
	// 매개변수의 자료형만 다르다면 생성자를 정의할 수 있다.
	Student(int num) {// 정수형 매개변수가 1개 있는 생성자
		System.out.println("Student 객체를 생성합니다. " + num);
	}

	Student(int a, int b) {// 정수형 매개변수가 2개 있는 없는 생성자
		System.out.println("Student 객체를 생성합니다. " + a + " " + b);
	}

	Student(long num) {// long형 매개변수가 1개 있는 생성자
		System.out.println("Student 객체를 생성합니다. " + num);
	}

	Student() {// 디폴트 생성자
		System.out.println("디폴트 생성자로 Student 객체를 생성합니다.");
	}

	// 메소드 메소드명(){행위} //멤버함수
	public void showStudentInfo() { // void 아무것도 리턴하지않는다.
		// public 제한없이 누구나 호출 가능
		System.out.println(studentName + ", " + address);
	}
}