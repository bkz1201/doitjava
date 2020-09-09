package chapter05;

import java.util.Scanner;

public class FunctionTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std1 = new Student();
		Student std2 = new Student();

		System.out.println(std1 == std2);

		/* 객체의 멤버는 도트연산자(.)을 이용하여 접근할 수 있습니다. */

		std1.showStudentInfo();// 메소드 호출 객체는 초기값이 null이다. int는 0이다. boolean은 false다.
		std1.studentID = 2020010001;
		std1.studentName = "김유신";
		std1.grade = 3;
		std1.address = "경주";
		std1.showStudentInfo();

		std2.showStudentInfo();
		std2.studentID = 202001002;
		std2.studentName = "서유진";
		std2.grade = 1;
		std2.address = "서울";
		std2.showStudentInfo();

		Student std3 = new Student();
		std3.studentID = 20001003;
		sc.close();
	}
}
