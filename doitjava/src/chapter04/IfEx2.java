package chapter04;

public class IfEx2 {
	public static void main(String[] args) {
		int score = 75;

		if (score >= 90) {
			System.out.println("점수가 90보다 크거나 같습니다.");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 90보다 작고 80보다 크거나 같습니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 80보다 작고 70보다 크거나 같습니다.");
			System.out.println("등급은 C입니다.");
		} else {	//else는 if문의 조건이 false일때 실행됩니다.
			System.out.println("등급은 F입니다.");
		}

//		if (score < 90) {
//			System.out.println("점수가 90보다 작습니다.");
//			System.out.println("등급은 B입니다.");
//		}

		System.out.println("The End");
	}
}
