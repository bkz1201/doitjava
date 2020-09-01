package example;

import java.util.Scanner;

public class Game03 {
	public static void main(String[] args) {
		// 달의 마지막 일자를 출력하는 프로그램을 작성하세요.
		// switch case문 사용
		Scanner sc = new Scanner(System.in);
		int mon = 0;
		int day = 0;

		for (;;) {
			System.out.println("마지막 날짜를 출력할 달을 입력하세요.");
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
				System.out.println(mon + "월은 존재하지 않습니다.");
				break;
			}
			System.out.println();
			if (day != 0)
				break;
		}
		System.out.println(mon + "월은 " + day + "일까지 입니다.");
	}
}
