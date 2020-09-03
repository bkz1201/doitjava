package chapter07;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 }; // 배열선언 모든언어 초기화할때만 {}로 초기화 가능
		// arr1= {1,2,3,4,5,6,7,8}; //불가능
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++)
			sum1 += arr1[i]; // 배열주소(?) 시작은 0
		System.out.println(sum1);

		int[] arr2 = new int[20]; // 배열선언 자바에서만 사용
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		int[] arr3 = new int[] { 1, 2, 3, 4, 5 }; // 배열갯수 입력 X
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println(arr1.length);
		arr1 = new int[] { 1, 2, 3, 4, 5 };	//새로만드는 배열을 넣는건 가능
		
		System.out.println(arr1.length);
	}
}
