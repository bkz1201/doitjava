package example;

public class Continue01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
//				System.out.println("�������� ����.");
//				break;		//�ݺ���Ż��
				continue;	//for���� �ݺ����� ���������� �Ѿ
//			else			//while�� ��� ���ǹ����� �Ѿ
				System.out.println(i);
		}
	}
}
