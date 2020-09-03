package example;

public class Continue01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
//				System.out.println("나머지가 없음.");
//				break;		//반복문탈출
				continue;	//for현재 반복문의 증감식으로 넘어감
//			else			//while의 경우 조건문으로 넘어감
				System.out.println(i);
		}
	}
}
