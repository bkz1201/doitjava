package chapter04;

import java.util.Scanner;

public class DoWhileEx2 {
	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");

		Scanner scan = new Scanner(System.in);
		String iStr;

		do {
			System.out.print("> ");
			iStr = scan.nextLine();
			System.out.println(iStr);
		} while (!iStr.equals("q"));
		System.out.println(); 
		System.out.println("���α׷� ����");
		scan.close();
	}
}
