package chapter07;

public class ArrayEx03 {
	public static void main(String[] args) {
		// 10���� �Է��� �� �ִ� �迭�� �����ϰ� 1���� 10���� ������ ��
		// for���� ����ؼ� �հ踦 ����ϼ���.

		int[] arr = new int[10];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println("�迭���� ������ ���� : " + sum + "�Դϴ�.");
	}
}
