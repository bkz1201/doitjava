package chapter03;

public class Chapter3End {
	public static void main(String[] args) {
		int myAge = 23;
		int teacherAge=38;
		
		boolean value =(myAge > 25);
		System.out.println((value));
		
		System.out.println((myAge <= 25));
		System.out.println(myAge==teacherAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch);	//1번문제
		
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);	//2번문제
		
		num = 10;
		
		System.out.println(num);
		System.out.println(num++);
		System.out.println(num);
		System.out.println(--num);	//3번문제
		
		int n1 = 10;
		int n2 = 20;
		boolean res;
		
		res = ((n1 > 10) && (n2 > 10));
		System.out.println(res);
		res = ((n1 > 10) || (n2 > 10));
		System.out.println(res);
		System.out.println(!res);	//4번문제
		
		n1 = 2;
		n2 = 10;
		
		System.out.println(n1&n2);
		System.out.println(n1|n2);
		System.out.println(n1^n2);
		System.out.println(~n1);	//5번 문제
		
		num = 8;
		
		System.out.println(num +=10);
		System.out.println(num-=10);
		System.out.println(num>>=2);	//6번 문제
		
		n1=10;
		n2=20;
		int result = (n1 >= 10) ? n2 +10 : n2 -10;
		System.out.println(result);	//7번 문제
	}
}
