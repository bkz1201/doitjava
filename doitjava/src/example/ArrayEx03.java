package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {

		// 5���� ������ �Է¹޾� �迭�� �ְ� �Է¹��� �� �� Max�� Min�� ����ϼ���;

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("������ �Է��ϼ��� : ");
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
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

//		Arrays.sort(arr);//�迭 �������� ���� ����ū���� ������
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("Max : " + arr[arr.length - 1]);
//		System.out.println("Min : " + arr[0]);

		sc.close();
	}
}
