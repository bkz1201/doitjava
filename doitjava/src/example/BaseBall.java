package example;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		int[] com = makeCom(); // 컴퓨터가 가지고있을 숫자 배열
		System.out.println("숫자 야구 게임! 11번 안에 정답을 맞춰보세요.");
		System.out.println("입력받는 숫자는 1 ~ 9 입니다.");

		int chance = 0; // 입력한 횟수
		int[] score;//0번 인덱스 스트라이크 1번인덱스 볼
		Scanner sc= new Scanner(System.in);
		for (;;) {
			chance++;
			System.out.println(chance + "회");
			int[] player = playerSet(chance,sc);// 플레이어 숫자 입력받음
			score = compareArr(com, player);// com player 숫자비교
			System.out.println("Strike : " + score[0] + "\tball : " + score[1]);
			if (score[0] == 3) {
				System.out.println("정답입니다.");
				break;
			}
			if (chance >= 11) {
				System.out.println("정답을 찾지 못했습니다.");
				break;
			}
		}
		System.out.println("정답은 " + com[0] + " | " + com[1] + " | " + com[2] + "입니다.");
		sc.close();
	}

	static int[] makeCom() {
		int[] com = new int[3];

		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {// 번호 중복 검사 이전에 생성된 번호와 이번에 생성된 번호
					i--;// 중복일시 이번에 생성된번호 다시 생성을위해 i값 감소
					break;// i 증감식으로 이동하면서 i값 변동없음
				}
			}
		} // 컴퓨터가 가지고있을 숫자를 랜덤으로 입력 중복X;
		return com;
	}

	static int[] playerSet(int chance, Scanner sc) {
		int[] player = new int[3];
		for (int i = 0; i < player.length; i++) {
			System.out.print(i + 1 + "번째 숫자 : ");
			player[i] = sc.nextInt();
			if (player[i] > 10 || player[i] < 1) {
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
		if (chance >= 11)
			sc.close();
		return player;
	}

	static int[] compareArr(int[] com, int[] player) {
		int[] score = new int[2];

		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < player.length; j++) {
				if (com[i] == player[j]) { // 컴퓨터와 플레이어가 입력한 값이 같으면
					if (i == j)
						score[0]++; // 인덱스 숫자가 같으면 스트라이크
					else
						score[1]++; // 인덱스 번호가 다르고 숫자만 일치하면 볼
				}
			}
		} // 컴퓨터와 플레이어 숫자 비교
		return score;
	}
}
