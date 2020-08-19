package chapter04;

public class SwitchEx3 {
	public static void main(String[] args) {
		int thisMon = 13;
		System.out.println(thisMon + "월의 마지막 일자는 몇 일 인가요?");

		switch (thisMon) {
		case 1:
		case 3:
		case 5:
		case 7: 
		case 8: 
		case 10:
		case 12:
			System.out.println(thisMon + "월은 31일까지 입니다.");
			break;
		case 2:
			System.out.println(thisMon + "월은 28일까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(thisMon + "월은 30일까지 입니다.");
			break;
		default:
			System.out.println("존재 하지 않는 달 입니다.");
			break;
		}
	}
}
