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
		for (int z = 0; z < game; z++) {// �Է¹��� ���ڸ�ŭ ����Ƚ�� �ݺ�
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 45) + 1;// �ζ� ��ȣ ����
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {// ��ȣ �ߺ� �˻� ������ ������ ��ȣ�� �̹��� ������ ��ȣ
						i--;// �ߺ��Ͻ� �̹��� �����ȹ�ȣ �ٽ� ���������� i�� ����
						break;// i ���������� �̵��ϸ鼭 i�� ��������
					}
				}
			}

			Arrays.sort(arr);// ������������ ����
			System.out.print(z + 1 + "ȸ�� : ");
			for (int i = 0; i < arr.length; i++) {// �ζǹ�ȣ z+1ȸ���� ���
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}
