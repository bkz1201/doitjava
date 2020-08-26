package chapter04;

public class Chapter4Last {
	public static void main(String[] args) {
		/*
		 * 연습문제 1 int n1=10; int n2=2; char oper='+';
		 * 
		 * if(oper=='+') System.out.println(n1+n2); else if(oper=='-')
		 * System.out.println(n1-n2); else if(oper=='*') System.out.println(n1*n2); else
		 * if(oper=='/') System.out.println(n1/n2); else
		 * System.out.println("사칙연산기호가 아님");
		 * 
		 * switch (oper) { case '+': System.out.println(n1+n2); break; case '-':
		 * System.out.println(n1-n2); break; case '*': System.out.println(n1*n2); break;
		 * case '/': System.out.println(n1/n2); break; default:
		 * System.out.println("사칙연산기호가 아님"); break; }
		 */
		/*
		 * 연습문제 2 for(int i=1;i<10;i++) { if(i%2==0) { for(int j=1;j<10;j++) {
		 * System.out.println(i+"x"+j+"="+i*j); } System.out.println(); } }
		 */

		/*
		 * 연습문제 3
		 * 
		 * for(int i=1;i<10;i++) { for(int j=1;j<10;j++) { if(i>=j)
		 * System.out.println(i+"x"+j+"="+i*j); else break; } System.out.println(); }
		 */
		/* 연습문제 4 */
		int n = 3;
		int f = 0;
		for (int i = 1; i <= 7; i += 2) { 
			for (int j = 0; j < i; j++) {
				for (int k = 0; k < n; k++) {
					if (f == 1)
						break;
					else
						System.out.print(" ");
				}
				f = 1;
				System.out.print("*");
			}
			n--;
			f = 0;
			System.out.println();
		}

	}
}
