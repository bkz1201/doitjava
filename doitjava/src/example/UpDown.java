package example;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		int rand = (int) (Math.random() * 100) + 1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		int sN = 1, lN = 100;
		//System.out.println(rand);
		for (;;) {
			System.out.print("생성된 숫자는 무엇인가요?");
			System.out.println("(범위 : " + sN + " ~ " + lN+")");
			int i = sc.nextInt();
			cnt++;
			if (i > rand) {
				System.out.print("다운");
				System.out.println(cnt+"회 입력");
				lN = i - 1;
			} else if (i < rand) {
				System.out.println("업");
				System.out.println(cnt+"회 입력");
				sN = i + 1;
			} else {
				System.out.println("정답!");
				break;
			}
			System.out.println();
		}
		System.out.println("정답을 찾는데 걸린 횟수 : " + cnt +"회");
		sc.close();
	}
}
