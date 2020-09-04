package chapter07;

public class ArrayEx03 {
	public static void main(String[] args) {
		// 10개를 입력할 수 있는 배열을 생성하고 1부터 10까지 대입한 후
		// for문을 사용해서 합계를 출력하세요.

		int[] arr = new int[10];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println("배열안의 숫자의 합은 : " + sum + "입니다.");
	}
}
