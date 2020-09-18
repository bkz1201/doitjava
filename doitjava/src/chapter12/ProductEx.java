package chapter12;

public class ProductEx {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(100);
		int iVal = box1.get();

		Box<String> box2 = Util.boxing("ȫ�浿");
		String sVal = box2.get();
		
		System.out.println(iVal);
		System.out.println(sVal);
	}
}
