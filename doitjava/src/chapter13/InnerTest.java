package chapter13;

import chapter13.OutClass.InStaticClass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	class InClass {
		int inNum = 100;
		// static int sInNum=200;

		void inTest(int num) {
			System.out.println("OutClass num = " + OutClass.this.num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sum = " + sNum + "(�ܺ� Ŭ������ ���� ����)");
			System.out.println("OutClass num = " + num + "(�Ű� ����)");
		}

//		static void sTest() {
//		}
	}

	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;

		void inTest() {
//			num += 10;
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
		}

		static void sTest() {
//			num += 10;
//			inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sInNum = " + sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}

	public void usingClass() {
		inClass.inTest(3);
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass();
		System.out.println();

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		InStaticClass sInClass2 = new InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		OutClass.InStaticClass.sTest();

		System.out.println();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass2.inTest();
		System.out.println();
		System.out.println("���� ���� Ŭ������ ���� �޼��� ȣ��");
		
	}
}
