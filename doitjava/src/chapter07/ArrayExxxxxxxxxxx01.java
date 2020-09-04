package chapter07;

public class ArrayExxxxxxxxxxx01 {
	public static void main(String[] args) {
		//알파벳 소문자를 2글자씩 13줄로 출력하는 프로그램을 이차원 배열로 구현해 보세요. 221p
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
