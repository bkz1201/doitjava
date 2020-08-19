package chapter04;

public class SwitchEx1 {
	public static void main(String[] args) {
		int ranking = 1;
		String medalColor = null;

		switch (ranking) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			medalColor = "Notting";
			break;
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");

		medalColor = null;

		if (ranking == 1) {
			medalColor = "Gold";
		} else if (ranking == 2) {
			medalColor = "Silver";
		} else if (ranking == 3) {
			medalColor = "Bronze";
		} else
			medalColor = "Notting";
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
	}
}
