package chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000;
		short sNum2 = 10000;
		int iNum = 1_000_000_000;	//컴퓨터는 _ 를 인식하지 않습니다.
		
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum2);
		System.out.println(iNum);
		
//		bNum = 200;	//byte 자료형은 -128~127까지 사용 가능 합니다.
		/*
		 * 주석처리 단축키
		 * 컨트롤 + 쉬프트 + C	
		 * 컨트롤 + /			
		 * 컨트롤 + 7			
		 */
		
		sNum = Short.MAX_VALUE;
		System.out.println(sNum);
//		short 자료형은 -32,768 ~ 32,767까지 사용 가능 합니다.
		
		iNum = Integer.MAX_VALUE;
		System.out.println(iNum);
//		int 자료형은 -2,147,483,648 ~ 2,147,483,647 까지 사용 가능 합니다
		
		System.out.println(1_000_000_000);	//10억 출력
		System.out.println(3_000_000_000L);	//long형 자료는 영문자 L을 붙이고 대문자 사용이 가독성이 좋습니다.
		
		int result;
		
		result = sNum+bNum;
		
		long lNum = 3_000_000_000L;
		
		System.out.println(result);
		System.out.println(lNum);
	}

}
