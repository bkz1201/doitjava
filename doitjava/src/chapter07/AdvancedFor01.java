package chapter07;

public class AdvancedFor01 {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		int[][] arr1 = { { 10, 20, 30 }, { 40, 50, 60 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		for (int[] i : arr1) {
			for (int n : i) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		//자바에서는 Advanced for 라고 하고 C언어에서는 Range-Based for라고 합니다.
		for (int[] i : arr1) {
			for (int j = 0; j < i.length; j++) {
				System.out.print(i[j] + " ");
			}
			System.out.println();
		}
	}
}
