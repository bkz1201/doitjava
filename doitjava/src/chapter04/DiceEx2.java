package chapter04;

public class DiceEx2 {
	public static void main(String[] args) {
		int dice = (int) (Math.random() * 6) + 1;

		System.out.println(dice);

		if (dice <= 3) {
			switch (dice) {
			case 1:
				System.out.println("주사위의 눈금은 1입니다.");
				break;
			case 2:
				System.out.println("주사위의 눈금은 2입니다.");
				break;
			default:
				System.out.println("주사위의 눈금은 3입니다.");
				break;
			}
//			if (dice == 1)
//				System.out.println("주사위의 눈금은 1입니다.");
//			else if (dice == 2)
//				System.out.println("주사위의 눈금은 2입니다.");
//			else
//				System.out.println("주사위의 눈금은 3입니다.");
		} else {
			switch (dice) {
			case 4:
				System.out.println("주사위의 눈금은 4입니다.");
				break;
			case 5:
				System.out.println("주사위의 눈금은 5입니다.");
				break;
			default:
				System.out.println("주사위의 눈금은 6입니다.");
				break;
//			if (dice == 4)
//				System.out.println("주사위의 눈금은 4입니다.");
//			else if (dice == 5)
//				System.out.println("주사위의 눈금은 5입니다.");
//			else
//				System.out.println("주사위의 눈금은 6입니다.");
			}
		}
	}
}

/*
 * Math.random() 은 0이상 1미만의 수 0 <= Math.random() < 1 0*6+1 <= Math.random()*6+1
 * < 1*6+1
 */