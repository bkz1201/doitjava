package chapter13;

public class TestMyNumber {
	public static void main(String[] args) {
//		MyNumber max = (x, y) -> (x >= y) ? x : y;
//		System.out.println(max.getMax(10, 20));
		int num1 = 10;
		int num2 = 20;
		
		//Ŭ������ݰ�ü
		ImplNum in = new ImplNum();
		int res = in.getMax(num1, num2);
		System.out.println("in1 : " + res);
		
		//�͸�����ü
		MyNumber in2 = new MyNumber() {
			@Override
			public int getMax(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 >= num2 ? num1 : num2;
			}
		};
		res = in2.getMax(num1, num2);
		System.out.println("in2 : " + res);
		
		//���ٽ�
		MyNumber in3 = (x,y) -> x >= y ? x : y;
		//�ڷ��� �������� ������ ��� �߰�ȣ �������� return��������

		res = in3.getMax(num1, num2);
		System.out.println("in3 : " + res);
	}
}
