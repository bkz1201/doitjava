package chapter02;

public class PromotionEx {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
//		byteValue = intValue;
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ� : " + intValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
//		intValue = doubleValue
		
		int result = intValue + byteValue;
		
		System.out.println(result);
		
		short shortValue = 100;
//		short res = shortValue + byteValue;
		
		long longValue = 10000L;
		long res2 = intValue + longValue;
		System.out.println(res2);
	}
}
