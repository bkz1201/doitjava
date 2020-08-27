package example;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력 할까요? ");
		int line = sc.nextInt();
		int ul = line / 2;				//상단 체크용
		int dl = line - ul - 1;			//하단 체크용
//		System.out.println(ul);
//		System.out.println(dl);
		for (int i = 0; i < ul; i++) {
			for (int j = ul; j > i; j--)
				System.out.print(" ");	//상단 좌측 공백
			for (int j = 0; j <= i; j++) {
				if (j == 0) 			// 좌측테두리체크
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				if (j == i - 1) 		// 우측테두리체크
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
		for (int i = dl; i >= 0; i--) {
			for (int j = dl; j > i; j--)
				System.out.print(" ");	//하단 좌측 공백
			for (int j = 0; j <= i; j++) {
				if (j == 0) 			// 좌측테두리체크
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				if (j == i - 1) // 우측테두리체크
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}