package example;

public class ArrayEx04 {
	public static void main(String[] args) {
		// ó�� �ΰ��� �迭 ��Ҹ� �ʱ�ȭ�� ���¿���
		// ������ �迭 ��Ҵ� ������� ��Ģ�� ���� ä��� �迭�� ����ϼ���;
		// int arr[10] = {1,2};
		// ����° ��� = ù���� ��� + �ι�° ���
		// ������ ��� = ������° ��� + ��ȩ��° ���

		int[] arr = new int[10];
		arr[0] = 1;//ù��°���
		arr[1] = 2;//�ι�°���
		for (int i = 2; i < arr.length; i++) {//����°��Һ��� ����
			arr[i] = arr[i - 2] + arr[i - 1];//����°��Һ��� �ڽ��� �տ��ִ� �� ����� ���� ����
		}//����°���=ù��°���+�ι�°���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
