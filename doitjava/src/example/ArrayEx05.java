package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		// ����ø��� ���� �޶����� �����Լ��� ����Ͽ�
		// 6���� ��Ҹ� ���� �迭�� ���� �� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("�ζ� ��ȣ �������Դϴ�. ������� ���� �Ͻðڽ��ϱ�?");
		int game = sc.nextInt();
		int[] arr = new int[6];
		for (int z = 0; z < game; z++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						i--;
						break;
					}
				}
			}

			Arrays.sort(arr);
			System.out.print(z + "ȸ�� : ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}
