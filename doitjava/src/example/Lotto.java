package example;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] lotto;
		System.out.println("로또번호 생성기");
		System.out.print("게임 횟수를 입력하세요 : ");
		count=sc.nextInt();
		for(int i=0 ;i<count;i++) {
			lotto = setLotto();
			for(int j=0;j<lotto.length;j++) {
				System.out.print(lotto[j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

	static int[] setLotto() {
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		return lotto;
	}
}
