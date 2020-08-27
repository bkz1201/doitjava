package example;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력 할까요? ");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = line - 1; j > i; j--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print("$");
			}
			for (int j = 0; j < i; j++)
				System.out.print("$");
			System.out.println();
		}
		sc.close();
	}
}
