package chapter08;

public class DmbCellPhoneEx {
	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 100);

		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		System.out.println("ä�� : " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("���� �ű� �� ������");
		dmbCellPhone.sendVoice("�������� �� �� ���ϴ�");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(10);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
	}
}