package chapter07;

public class Array01 {
	public static void main(String[] args) {
		int score1 = 1, score2 = 2, score3 = 3, score4 = 4, score5 = 5, score6 = 6, score7 = 7, score8 = 8, score9 = 9,
				score10 = 10;
		int sum = 0;
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		sum += score6;
		sum += score7;
		sum += score8;
		sum += score9;
		sum += score10;
		System.out.println(sum);

		sum = 0;
		int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		//배열 선언은 변수형 변수명 아무곳이나 []
		//{}로 배열 초기화는 모든 언어 공통
		System.out.println("scores배열의 길이 : " + scores.length);
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
	}
}
