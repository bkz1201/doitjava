package chapter03;

public class UnaryOperator {
	public static void main(String[] args) {
		int a = 10, b = 10;	//���� Ÿ���� �� �ٿ� ����� �ʱ�ȭ�� �� �� �ִ�.
		
		int c=100,d=200,e=300;
		
		System.out.println("a++ = " + a++ + ", ++b =" + (++b));
		System.out.println("a = " + a + ", b = " + b);
		
		c++;
		c++;
		c++;
		System.out.println(c++);
		System.out.println(c);
		++c;
		c++;
		++c;
		++c;
		++c;
		c++;
		System.out.println(++c);
	}
}
