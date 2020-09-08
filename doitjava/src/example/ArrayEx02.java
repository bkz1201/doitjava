package example;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		// arr의 요소들의 값을 0으로 바꾼후 각 요소의 값이 0인지 확은을 위해 출력하세요.

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
			System.out.println(i+"번째 요소 : "+arr[i]);
		}
	}
}
