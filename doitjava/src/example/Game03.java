package example;

import java.util.Scanner;

public class Game03 {
	public static void main(String[] args) {
		// ���� ������ ���ڸ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// switch case�� ���
		Scanner sc = new Scanner(System.in);
		int mon = 0;
		int day = 0;

		for (;;) {
			System.out.println("������ ��¥�� ����� ���� �Է��ϼ���.");
			mon = sc.nextInt();
			switch (mon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			default:
				System.out.println(mon + "���� �������� �ʽ��ϴ�.");
				break;
			}
			System.out.println();
			if (day != 0)
				break;
		}
		System.out.println(mon + "���� " + day + "�ϱ��� �Դϴ�.");
	}
}
