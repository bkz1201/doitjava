package chapter04;

public class MetroCity {
	public static void main(String[] args) {
		boolean isCapital = false;
		boolean isMetro = false;
		int citizen = 0;
		int rich = 0;

		System.out.println("현재 도시는 메트로폴리스 입니까?");

		isCapital = true;
		citizen = 150; // '만'단위 사용
		rich = 50;

//		if (isCapital) {
//			if (citizen >= 100) {
//				isMetro = true;
//			} else if (rich >= 50) {
//				isMetro = true;
//			}
//		} else {
//			if (rich >= 50) {
//				isMetro = true;
//			}
//		}
		
//		if (isCapital && (citizen >= 100)) {
//			isMetro = true;
//		} else if (rich >= 50) {
//			isMetro = true;
//		} else {
//			isMetro = false;
//		}
		
		isMetro = (isCapital && citizen >= 100) || rich >= 50 ? true : false;
		
		System.out.println("수도여부 : "+isCapital);
		System.out.println("인구수 : "+citizen +"만명");
		System.out.println("부자수 : "+rich+"만명");
		System.out.println(isMetro ? "메트로폴리스입니다." : "메트로폴리스가 아닙니다");

	}
}
