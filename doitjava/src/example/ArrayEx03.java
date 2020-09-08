package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {

		// 5개의 정수를 입력받아 배열에 넣고 입력받은 수 중 Max와 Min을 출력하세요;

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			arr[i] = sc.nextInt();
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max)
//				max = arr[i];
//			if (arr[i] < min)
//				min = arr[i];
//		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

//		Arrays.sort(arr);//배열 오름차순 정렬 가장큰값이 마지막
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("Max : " + arr[arr.length - 1]);
//		System.out.println("Min : " + arr[0]);

		sc.close();
	}
}
