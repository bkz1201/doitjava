package chapter04;

public class ContinueEx {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello!" + i);
			if (i == 1) {
				continue; // ����������
//				break;
			}
			System.out.println("Ż��!");
		}

		int cnt = 0;
		while (true) {
			System.out.println("while" + cnt++);
			if (cnt == 5)
				continue;	//���ǹ�����
//				break;
			System.out.println("Ż��!");
			if (cnt == 10)
				break;
		}
	}
}


/*
 * break �ݺ��� Ż��
 * continue ����ݺ� �ߴ� -> ���� �ݺ�����
 */
