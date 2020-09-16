package chapter10;

public class Audio implements RemoteControl {
	private int volume = 0;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오 킴");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오 끔");
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
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("오디오 무음");
		}
		else {
			System.out.println("오디오 무음해제");
		}
	}
	
}
