package chapter04;

public class SwitchEx2 {
	public static void main(String[] args) {
		int now = 10;
		
		System.out.println("���� �ð��� " + now + "�� �Դϴ�.");
		System.out.println("���� ������ ������ �����ϴ�.");
		
		switch (now) {
		case 9:
			System.out.println(now +"�ÿ��� ����� �մϴ�.");
			now++;
		case 10:
			System.out.println(now +"�ÿ��� ��ħ ��ȸ�� �մϴ�.");
			now++;
		case 11:
			System.out.println(now +"�ÿ��� ���������� �����մϴ�.");
			now++;
		case 12:
			System.out.println(now +"�ÿ��� ������ �Խ��ϴ�");

		default:
			break;
		}
		
		String pos="����";
		
		switch (pos) {
		case "����":
			System.out.println(pos + "�� ������ 400���� �Դϴ�");
			break;
		case "����":
			System.out.println(pos +"�� ������ 300���� �Դϴ�.");
			break;
		case "�븮":
			System.out.println(pos +"�� ������ 200���� �Դϴ�.");
			break;
		default:
			System.out.println("�Ϲ� ����� ������ 150���� �Դϴ�.");
			break;
		}
	}
}
