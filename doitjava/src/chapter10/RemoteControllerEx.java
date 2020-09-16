package chapter10;

public class RemoteControllerEx {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		RemoteControl.changeBattery();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		rc = new SmartTelevison();
		rc.turnOn();
		rc.turnOff();
	}
}
