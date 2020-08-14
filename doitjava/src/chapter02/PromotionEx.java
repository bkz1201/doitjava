package chapter02;

public class PromotionEx {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
//		byteValue = intValue;
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 : " + intValue);
		
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
