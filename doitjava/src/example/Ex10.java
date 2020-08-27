package example;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력 할까요? ");
		int line = sc.nextInt();
		for (int i = 0 ; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j != i ? "$" : "\\" );
			}
			System.out.println();
		}

		System.out.println("역순");
		for (int i = line; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(j % 2 == 0 ? "$" : "\\" );
				}
			System.out.println();
		}

		sc.close();
	}
}
