package chapter10;

public class SmartTelevison implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트TV킴");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트TV끔");
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
		System.out.println("현재 스마트TV 볼륨 : " + this.volume);
	}

}
