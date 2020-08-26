package example;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Á¤¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		int num1 = sc.nextInt();
		String str = "";
		if (num1 % 2 == 0) {
			str = "Â¦¼ö";
			System.out.println(str);
		} else {
			str = "È¦¼ö";
			System.out.println(str);
		}

		System.out.println(num1 % 2 == 0 ? "Â¦¼ö2" : "È¦¼ö2");

		sc.close();
	}
}
