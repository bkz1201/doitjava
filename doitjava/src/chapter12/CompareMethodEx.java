package chapter12;

public class CompareMethodEx {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");

		boolean res1 = Util.<Integer, String>compare(p1, p2);
		if (res1) {
			System.out.println("���� ������ ��ü");
		} else {
			System.out.println("�������� ������������ ��ü");
		}

		Pair<String, String> p3 = new Pair<String, String>("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair<String, String>("user2", "ȫ�浿");
		boolean res2 = Util.compare(p3, p4);
		if (res2)
			System.out.println("���� ������ ��ü");
		else
			System.out.println("�������� �������� ���� ��ü");
	}
}
