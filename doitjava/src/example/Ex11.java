package example;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력 할까요? ");
		int line = sc.nextInt();
		int ul = line / 2;
		int dl = line - ul;

		for (int i = 0; i < ul; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		for (int i = dl; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("$");
			}
			System.out.println();
		}
		sc.close();
	}
}
