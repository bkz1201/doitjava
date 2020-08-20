package chapter04;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		int iNum = 0;
		Scanner sc = new Scanner(System.in);	//스캐너 생성 코드 - 변수명만 변경가능
		
//		System.out.println("정수를 입력해 주세요 : ");
//		System.out.print("> ");
//		iNum = sc.nextInt();
//		System.out.println("입력한 정수 : "+iNum+ "\n");
//		
//		System.out.println("실수를 입력해 주세요 :");
//		System.out.print("> ");
//		double dNum = sc.nextDouble();
//		System.out.println("입력한 실수 : " +dNum +"\n");
//		
//		System.out.println("실수를 입력해 주세요 :");
//		System.out.print("> ");
//		float fNum = sc.nextFloat();
//		System.out.println("입력한 실수 : " +fNum +"\n");
		
		System.out.println("문자열을 입력해 주세요 :");
		System.out.print("> ");
//		String str = sc.next();	//문자열 공백 사용 불가 공백은 다음값 입력으로 인식함
//		System.out.println("입력한 문자열 : " +str);
//		str = sc.next();
//		System.out.println("입력한 문자열 : " +str);
//		str = sc.next();
//		System.out.println("입력한 문자열 : " +str);
//		str = sc.next();
//		System.out.println("입력한 문자열 : " +str);
		
		String str = sc.nextLine();
		System.out.println("입력한 문자열 : " +str);
		
		sc.close();	//스캐너 사용후 닫아줘야함 메모리 누수 방지
	}
}
