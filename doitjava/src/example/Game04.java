package example;

import java.util.Scanner;

public class Game04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1부터 입력받은 숫자까지 소수의 갯수를 출력하는 문제
		System.out.println("몇까지의 소수의 갯수를 구할까요?");
		int n = sc.nextInt();
		int check = 0;
		int cnt = 0;
		for (int i = 2; i <= n; i++) {		//1~n까지
			check = 0;
			for (int j = 2; j <= i; j++) {	//2~i까지
				if (i % j == 0) {
					check++;				//i를 j로 나눴을때 나머지가 0이면 check++
				}
				if (check > 1)				//check가 1보다 크면 소수가아니어서 내부for문 빠져나감
					break;				
			}
			if (check == 1) {				//check가 1이면 소수
				cnt++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("1 ~ " + n + "까지의 소수 구하기.");
		System.out.println("소수의 갯수 : " + cnt);
		sc.close();
	}
}
