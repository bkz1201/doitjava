package chapter04;

public class IfEx01 {
	public static void main(String[] args) {
		int score = 80;

		if (score >= 90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		} else {	//else는 if문의 조건이 false일때 실행됩니다.
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

//		if (score < 90) {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//		}

		System.out.println("The End");
	}
}
