package chapter05;

public class FunctionTest03 {
	public static void main(String[] args) {// 메인 메소드는 한개만 존재하는게 좋다? 존재해야만한다?
		Operator oper = new Operator(); // 클래스의 이름과 동일한 메소드는 생성자라고 합니다.
		// 필드 메소드 생성자는 필요에따라 생략할수있다.
		// 여기선 Operator 가 생성자
		int num1 = 10;
		int num2 = 5;
		int res1 = oper.add(num1, num2);
		System.out.println(res1);
		int res2 = oper.sub(num1, num2);
		System.out.println(res2);
		int res3 = oper.mul(num1, num2);
		System.out.println(res3);
		int res4 = oper.div(num1, num2);
		System.out.println(res4);
		
	}
}
