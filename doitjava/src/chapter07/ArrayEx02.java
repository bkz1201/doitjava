package chapter07;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 }; // �迭���� ����� �ʱ�ȭ�Ҷ��� {}�� �ʱ�ȭ ����
		// arr1= {1,2,3,4,5,6,7,8}; //�Ұ���
		int sum1 = 0;
		for (int i = 0; i < arr1.length; i++)
			sum1 += arr1[i]; // �迭�ּ�(?) ������ 0
		System.out.println(sum1);

		int[] arr2 = new int[20]; // �迭���� �ڹٿ����� ���
		int sum2 = 0;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}

		int[] arr3 = new int[] { 1, 2, 3, 4, 5 }; // �迭���� �Է� X
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println(arr1.length);
		arr1 = new int[] { 1, 2, 3, 4, 5 };	//���θ���� �迭�� �ִ°� ����
		
		System.out.println(arr1.length);
	}
}
