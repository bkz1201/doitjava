package chapter05;

public class FunctionTest03 {
	public static void main(String[] args) {// ���� �޼ҵ�� �Ѱ��� �����ϴ°� ����? �����ؾ߸��Ѵ�?
		Operator oper = new Operator(); // Ŭ������ �̸��� ������ �޼ҵ�� �����ڶ�� �մϴ�.
		// �ʵ� �޼ҵ� �����ڴ� �ʿ信���� �����Ҽ��ִ�.
		// ���⼱ Operator �� ������
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