package chapter02;

public class Variable {

	public static void main(String[] args) {
		int level = 10;	//변수 선언과 동시에 값을 대입. level 초기값 10
		int hp;
		
		System.out.println("현재 레벨은 얼마인가요?");	//문자열은 ""감싸고 화면에 그대로 출력
		System.out.println(level);	//변수명을 입력하면 변수에 저장된 값 출력
		System.out.println("현재 체력은 얼마인가요?");
		hp = 500;
		System.out.println(hp);
		System.out.println("적으로부터 100의 데미지를 입었습니다.");
		hp = 400;
		System.out.println("현재 체력은 얼마인가요?");
		System.out.println(hp);

	}

}
