package chapter10;

public class Television implements RemoteControl {
	private int volume = 0;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV Ŵ");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV ��");
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
		System.out.println("���� TV ���� : " + this.volume);
	}

}
