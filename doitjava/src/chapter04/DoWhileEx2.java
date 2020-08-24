package chapter04;

import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

		Scanner scan = new Scanner(System.in);
		String iStr;

		do {
			System.out.print("> ");
			iStr = scan.nextLine();
			System.out.println(iStr);
		} while (!iStr.equals("q"));
		System.out.println(); 
		System.out.println("프로그램 종료");
		scan.close();
	}
}
