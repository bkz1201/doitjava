package chapter04;

public class ContinueEx {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello!" + i);
			if (i == 1) {
				continue; // 증감식으로
//				break;
			}
			System.out.println("탈출!");
		}

		int cnt = 0;
		while (true) {
			System.out.println("while" + cnt++);
			if (cnt == 5)
				continue;	//조건문으로
//				break;
			System.out.println("탈출!");
			if (cnt == 10)
				break;
		}
	}
}


/*
 * break 반복문 탈출
 * continue 현재반복 중단 -> 다음 반복으로
 */
