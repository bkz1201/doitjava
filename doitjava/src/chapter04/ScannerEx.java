package chapter04;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		int iNum = 0;
		Scanner sc = new Scanner(System.in);	//��ĳ�� ���� �ڵ� - ������ ���氡��
		
//		System.out.println("������ �Է��� �ּ��� : ");
//		System.out.print("> ");
//		iNum = sc.nextInt();
//		System.out.println("�Է��� ���� : "+iNum+ "\n");
//		
//		System.out.println("�Ǽ��� �Է��� �ּ��� :");
//		System.out.print("> ");
//		double dNum = sc.nextDouble();
//		System.out.println("�Է��� �Ǽ� : " +dNum +"\n");
//		
//		System.out.println("�Ǽ��� �Է��� �ּ��� :");
//		System.out.print("> ");
//		float fNum = sc.nextFloat();
//		System.out.println("�Է��� �Ǽ� : " +fNum +"\n");
		
		System.out.println("���ڿ��� �Է��� �ּ��� :");
		System.out.print("> ");
//		String str = sc.next();	//���ڿ� ���� ��� �Ұ� ������ ������ �Է����� �ν���
//		System.out.println("�Է��� ���ڿ� : " +str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ� : " +str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ� : " +str);
//		str = sc.next();
//		System.out.println("�Է��� ���ڿ� : " +str);
		
		String str = sc.nextLine();
		System.out.println("�Է��� ���ڿ� : " +str);
		
		sc.close();	//��ĳ�� ����� �ݾ������ �޸� ���� ����
	}
}
