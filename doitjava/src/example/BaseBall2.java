package example;

import java.util.Scanner;

public class BaseBall2 {
	public static void main(String[] args) {
		int strike, ball; // 스트라이크 볼
		int[] com = new int[3]; // 컴퓨터가 가지고있을 숫자 배열
		System.out.println("숫자 야구 게임! 11번 안에 정답을 맞춰보세요.");
		System.out.println("숫자는 1 ~ 9 입니다.");
		
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {// 번호 중복 검사 이전에 생성된 번호와 이번에 생성된 번호
					i--;// 중복일시 이번에 생성된번호 다시 생성을위해 i값 감소
					break;// i 증감식으로 이동하면서 i값 변동없음
				}
			}
		} // 컴퓨터가 가지고있을 숫자를 랜덤으로 입력 중복X;

		int chance = 0; // 입력할 기회
		int[] player = new int[3]; // 플레이어가 입력할 숫자 배열
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < com.length; i++)
			System.out.print(com[i] + " ");
		System.out.println();
		for (;;) {
			strike = 0;
			ball = 0;
			chance++;
			System.out.println(chance + "회");
			for (int i = 0; i < player.length; i++) {
				System.out.print(i + 1 + "번째 숫자 : ");
				player[i] = sc.nextInt();
				if (player[i] > 10 || player[i] == 0) {
					System.out.println("1~9 까지 입력 가능 합니다.");
					i--;
					continue;
				}
				for (int j = 0; j < i; j++) {
					if (player[i] == player[j]) {
						System.out.println("같은 값입니다. 다시입력해주세요.");
						i--;
						break;
					}
				}
			} // 플레이어 숫자 입력받음
			
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < player.length; j++) {
					if (com[i] == player[j]) { // 컴퓨터와 플레이어가 입력한 값이 같으면
						if (i == j)
							strike++; // 인덱스 숫자가 같으면 스트라이크
						else
							ball++; // 인덱스 번호가 다르고 숫자만 일치하면 볼
					}
				}
			} // 컴퓨터와 플레이어 숫자 비교
			System.out.println("Strike : " + strike + "\tball : " + ball);
			if (strike == 3) {
				System.out.println("정답입니다.");
				break;
			}
			if (chance >= 11) {
				System.out.println("정답을 찾지 못했습니다.");
				break;
			}
		}
		sc.close();
	}
}
