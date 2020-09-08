package example;

public class ArrayEx04 {
	public static void main(String[] args) {
		// 처음 두개의 배열 요소만 초기화된 상태에서
		// 나머지 배열 요소는 다음계산 규칙에 따라 채우고 배열을 출력하세요;
		// int arr[10] = {1,2};
		// 세번째 요소 = 첫번재 요소 + 두번째 요소
		// 열번재 요소 = 여덟번째 요소 + 아홉번째 요소

		int[] arr = new int[10];
		arr[0] = 1;//첫번째요소
		arr[1] = 2;//두번째요소
		for (int i = 2; i < arr.length; i++) {//세번째요소부터 대입
			arr[i] = arr[i - 2] + arr[i - 1];//세번째요소부터 자신의 앞에있는 두 요소의 합을 대입
		}//세번째요소=첫번째요소+두번째요소
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
