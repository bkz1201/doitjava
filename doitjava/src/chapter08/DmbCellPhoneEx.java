package chapter08;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 100);

		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("나야 거기 잘 지내니");
		dmbCellPhone.sendVoice("여보세요 왜 말 안하니");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
	}
}
