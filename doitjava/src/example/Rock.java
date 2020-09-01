package example;

import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		final int BA = 1;
		final int GA = 2;
		final int BO = 3;

		Scanner sc = new Scanner(System.in);

		int score = 0;
		int life = 3;

		int com;// = (int) (Math.random() * 3) + 1; // 1바위 2가위 3보
//		System.out.println("1바위 2가위 3보 낼것을 숫자로 입력하시오");
//		String m = sc.next();
		int m;// =sc.nextInt();

		// System.out.println(m=="바위" ? "바위":"다른거");
//		System.out.println(m=="가위" ? "가위":"다른거");
//		System.out.println(m=="보" ? "보":"다른거");

		/*
		 * for (;;) { m=sc.nextInt(); System.out.println("내가 낸것은 "+(m==BA ? "바위":(m==GA
		 * ? "가위":"보"))); if (m == BA) { System.out.println("상대가 낸것은 "+(com==BA ?
		 * "바위":(com==GA ? "가위":"보"))); if (com == BA) { System.out.println("비겼습니다.");
		 * break; } else if (com == GA) { System.out.println("이겼습니다."); break; } else {
		 * System.out.println("졌습니다."); break; } } else if (m == GA) {
		 * System.out.println("상대가 낸것은 "+(com==BA ? "바위":(com==GA ? "가위":"보"))); if (com
		 * == GA) { System.out.println("비겼습니다."); break; } else if (com == BO) {
		 * System.out.println("이겼습니다."); break; } else { System.out.println("졌습니다.");
		 * break; } } else if (m == BO) { System.out.println("상대가 낸것은 "+(com==BA ?
		 * "바위":(com==GA ? "가위":"보"))); if (com == BO) { System.out.println("비겼습니다.");
		 * break; } else if (com == BA) { System.out.println("이겼습니다."); break; } else {
		 * System.out.println("졌습니다."); break; } } else
		 * System.out.println("다시 입력하세요 (1바위 2가위 3보)"); }
		 */
		int wcnt = 0;
		int dcnt = 0;
		while (true) {
			System.out.println("현제 체력 : " + life + " 점수 : " + score);
			System.out.println("1바위 2가위 3보 낼것을 숫자로 입력하시오.");
			m = sc.nextInt();
			com = (int) (Math.random() * 3) + 1;

			if ((com == GA && m == BA) || (com == BA && m == BO) || (com == BO && m == GA)) {
				System.out.println("내가 낸것은 " + (m == BA ? "바위" : (m == GA ? "가위" : "보")));
				System.out.println("상대가 낸것은 " + (com == BA ? "바위" : (com == GA ? "가위" : "보")));
				System.out.println("승리");
				score += 100;
				wcnt++;
			} else if (com == m) {
				System.out.println("내가 낸것은 " + (m == BA ? "바위" : (m == GA ? "가위" : "보")));
				System.out.println("상대가 낸것은 " + (com == BA ? "바위" : (com == GA ? "가위" : "보")));
				System.out.println("무승부");
				score += 10;
				dcnt++;
			} else if (m > 3 || m <= 0) {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
				continue;
			} else {
				System.out.println("내가 낸것은 " + (m == BA ? "바위" : (m == GA ? "가위" : "보")));
				System.out.println("상대가 낸것은 " + (com == BA ? "바위" : (com == GA ? "가위" : "보")));
				System.out.println("패배");
				life--;
			}
			if (life <= 0) {
				sc.close();
				break;
			} else
				System.out.println();
		}
		System.out.println();
		System.out.println("최종 결과 : " + wcnt + "승 " + dcnt + "무 " + "3패");
		System.out.println("최종 스코어 : " + score);

	}
}
