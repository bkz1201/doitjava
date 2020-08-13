package chapter02;

public class IntegerEx {

	public static void main(String[] args) {
		byte bNum = 100;
		short sNum = 10_000;
		short sNum2 = 10000;
		int iNum = 1_000_000_000;	//��ǻ�ʹ� _ �� �ν����� �ʽ��ϴ�.
		
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(sNum2);
		System.out.println(iNum);
		
//		bNum = 200;	//byte �ڷ����� -128~127���� ��� ���� �մϴ�.
		/*
		 * �ּ�ó�� ����Ű
		 * ��Ʈ�� + ����Ʈ + C	
		 * ��Ʈ�� + /			
		 * ��Ʈ�� + 7			
		 */
		
		sNum = Short.MAX_VALUE;
		System.out.println(sNum);
//		short �ڷ����� -32,768 ~ 32,767���� ��� ���� �մϴ�.
		
		iNum = Integer.MAX_VALUE;
		System.out.println(iNum);
//		int �ڷ����� -2,147,483,648 ~ 2,147,483,647 ���� ��� ���� �մϴ�
		
		System.out.println(1_000_000_000);	//10�� ���
		System.out.println(3_000_000_000L);	//long�� �ڷ�� ������ L�� ���̰� �빮�� ����� �������� �����ϴ�.
		
		int result;
		
		result = sNum+bNum;
		
		long lNum = 3_000_000_000L;
		
		System.out.println(result);
		System.out.println(lNum);
	}

}
