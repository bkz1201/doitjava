package example;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력 할까요? ");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			for (int j = line - 1; j > i; j--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == line - 1)	//좌측테두리체크
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				if (j == i - 1 || i == line - 1)	//우측테두리체크
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
