package chapter04;

public class SwitchEx2 {
	public static void main(String[] args) {
		int now = 10;
		
		System.out.println("현재 시간은 " + now + "시 입니다.");
		System.out.println("남은 일정은 다음과 같습니다.");
		
		switch (now) {
		case 9:
			System.out.println(now +"시에는 출근을 합니다.");
			now++;
		case 10:
			System.out.println(now +"시에는 아침 조회를 합니다.");
			now++;
		case 11:
			System.out.println(now +"시에는 오전업무를 시작합니다.");
			now++;
		case 12:
			System.out.println(now +"시에는 점심을 먹습니다");

		default:
			break;
		}
		
		String pos="부장";
		
		switch (pos) {
		case "부장":
			System.out.println(pos + "의 월급은 400만원 입니다");
			break;
		case "과장":
			System.out.println(pos +"의 월급은 300만원 입니다.");
			break;
		case "대리":
			System.out.println(pos +"의 월급은 200만원 입니다.");
			break;
		default:
			System.out.println("일반 사원의 월급은 150만원 입니다.");
			break;
		}
	}
}
