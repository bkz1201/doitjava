package example;

import java.util.HashSet;
import java.util.Set;

public class Ex18 {
	public static void main(String[] args) {
		int num = 0;
		Set<Integer> set = new HashSet<Integer>();	//set�̶� �̸��� ������Set
		while (set.size() < 6) {					//set�� ������� 6
			num = (int) (Math.random() * 48) + 1;	//�����߻���
			set.add(num);							//set�� �߰�
		}
		System.out.println("�ζ� ��ȣ ������");
		for (int n : set) {
			System.out.print(n + " ");
		}
	}
}
/*
 * Set : �����͸� �������ִ� ����
*/