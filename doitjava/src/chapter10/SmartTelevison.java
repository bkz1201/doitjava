package chapter10;

public class SmartTelevison implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("����ƮTVŴ");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("����ƮTV��");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ����ƮTV ���� : " + this.volume);
	}

}
