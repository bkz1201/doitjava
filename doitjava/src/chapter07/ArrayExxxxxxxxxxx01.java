package chapter07;

public class ArrayExxxxxxxxxxx01 {
	public static void main(String[] args) {
		//���ĺ� �ҹ��ڸ� 2���ھ� 13�ٷ� ����ϴ� ���α׷��� ������ �迭�� ������ ������. 221p
		char[][] cArr = new char[13][2];
		int flag = 97;
		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				cArr[i][j] = (char) flag++;
			}
		}

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				System.out.print(cArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
