package chapter10;

public class RemoteConEx {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new RemoteControl() {
			int volume;

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("전등킴");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("전등끔");
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				if (volume <= RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				} else if (volume >= RemoteControl.MAX_VOLUME) {
					this.volume = RemoteControl.MAX_VOLUME;
				} else
					this.volume = volume;
				System.out.println("전등의 현재 밝기는 : " + this.volume + "입니다.");
			}
		};

		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
