package example;

import java.util.Scanner;

public class Game05 {
	public static void main(String[] args) {
		/*
		 * ���� ���� ���� ������ �Է� �޾� ����� ���� �� 91�� �̻� A��� 81�� �̻� B��� 71�� �̻� C��� ������ F���
		 * 
		 * ��� ������ ����� ���
		 */

		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		double avg = 0;
		char grade = 0;

		System.out.print("���������� �Է��Ͻÿ� : ");
		kor = sc.nextInt();
		System.out.print("���������� �Է��Ͻÿ� : ");
		eng = sc.nextInt();
		System.out.print("���������� �Է��Ͻÿ� : ");
		math = sc.nextInt();

		avg = (kor + eng + math) / 3.0;

//		System.out.println(avg >= 91 ? "A���" : avg >= 81 ? "B���" : avg >= 71 ? "C���" : "F���");
//		System.out.println("������� : " + avg);

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

		System.out.println(grade + "���\n" + "������� : " + avg);

		sc.close();
	}
}
