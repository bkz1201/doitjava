package chapter07;

//���ؿ� ���� �������� ����
public class ArrayEx05 {
	public static void main(String[] args) {
		int[] iArr = { 1, 2, 3 };
		String[] sArr = { "����", "����", "���" };

		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i] + " : " + sArr[i]);
		}
		System.out.println();

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };
		int[][] array = new int[2][]; // �������迭 x,y ǥ,���
		array[0] = arr1;
		array[1] = arr2;

		for (int i = 0; i < array.length; i++) {//���α���
			for (int j = 0; j < array[0].length; j++) {//���α���
				System.out.println(array[i][j]);
			}
//			System.out.println(array[i]);	//array[0] array[1] ���(�޸��ּ�)
		}
	}
}

/*
 * String �迭���� �迭�� ��Ұ� ��ü(�޸��ּ�)�� ��� ��ü(�޸��ּ�) �� ����ȴ�. �迭�� �迭�� ��ҷ� ���� �� �ִ�.
 */
