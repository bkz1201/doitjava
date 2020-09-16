package chapter10;

public class Audio implements RemoteControl {
	private int volume = 0;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("����� Ŵ");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("����� ��");
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
		System.out.println("���� ����� ���� : " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("����� ����");
		}
		else {
			System.out.println("����� ��������");
		}
	}
	
}
