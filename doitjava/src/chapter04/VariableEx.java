package chapter04;

public class VariableEx {
	public static void main(String[] args) {
		System.out.println("영남분식입니다.");
		System.out.println("원하시는 메뉴를 선택해 주세요.");
		int dduck	=	3000;	//떡 3000
		int sundae	=	3000;	//순 3000
		int oden	=	500;	//오 500
		int kim		=	2000;	//김 2000
		
		int order1 = 0, order2 = 0, order3 = 0, order4 = 0;
		//변수 초기값 숫자 0, boolean false, 문자열 "", char 0
		
		order1 = 1;
		order2 = 1;
		order3 = 4;
		order4 = 2;
		
		int res1 = dduck * order1;
		int res2 = sundae * order2;
		int res3 = oden * order3;
		int res4 = kim * order4;

		System.out.println("떡볶이는 "+order1+"인분 주문하여서 금액은 "+res1+"원 입니다.");
		System.out.println("순대는 "+order2+"인분 주문하여서 금액은 "+res2+"원 입니다.");
		System.out.println("오뎅은 "+order3+"개 주문하여서 금액은 "+res3+"원 입니다.");
		System.out.println("김밥은 "+order4+"인분 주문하여서 금액은 "+res4+"원 입니다.");
		System.out.println("총 금액은 "+(res1+res2+res3+res4)+"원 입니다.");
		
		System.out.print("출력");
		System.out.print("출력\n");
		System.out.print("출력");
		
	}
}
