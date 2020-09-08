package chapter07;

import java.util.Arrays;

public class ArrayCopy01 {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 10, 20, 30 };
		int[] arr2 = new int[5];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println();

		int[] arr3 = new int[10];

		System.arraycopy(arr1, 0, arr3, 6, arr1.length - 1);
		// 배열복사 (ctrl+c할배열이름,복사할배열시작위치,ctrl+v할배열이름,붙여넣을배열의시작위치,복사할배열의 길이)

		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

		int[] arr4 = Arrays.copyOf(arr1, 2);
		System.out.println();
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
	}
}
