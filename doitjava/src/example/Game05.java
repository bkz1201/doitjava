package example;

import java.util.Scanner;

public class Game05 {
	public static void main(String[] args) {
		/*
		 * 국어 영어 수학 점수를 입력 받아 평균을 구한 후 91점 이상 A등급 81점 이상 B등급 71점 이상 C등급 나머지 F등급
		 * 
		 * 평균 점수와 등급을 출력
		 */

		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		double avg = 0;
		char grade = 0;

		System.out.print("국어점수를 입력하시오 : ");
		kor = sc.nextInt();
		System.out.print("영어점수를 입력하시오 : ");
		eng = sc.nextInt();
		System.out.print("수학점수를 입력하시오 : ");
		math = sc.nextInt();

		avg = (kor + eng + math) / 3.0;

//		System.out.println(avg >= 91 ? "A등급" : avg >= 81 ? "B등급" : avg >= 71 ? "C등급" : "F등급");
//		System.out.println("평균점수 : " + avg);

//		if (avg >= 91)
//			grade = 'A';
//		else if (avg >= 81)
//			grade = 'B';
//		else if (avg >= 71)
//			grade = 'C';
//		else
//			grade = 'F';

//		switch ((int) avg / 10) {
//		case 9:
//			grade = 'A';
//			break;
//		case 8:
//			grade = 'B';
//			break;
//		case 7:
//			grade = 'C';
//			break;
//		default:
//			grade = 'F';
//			break;
//		}

		System.out.println(grade + "등급\n" + "평균점수 : " + avg);

		sc.close();
	}
}
