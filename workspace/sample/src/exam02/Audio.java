package exam02;

public class Audio implements RemoteControl {

	
	public void turnOn() {
		//추상메소드의 실체 메소드
		System.out.println("Audio켬");

	}


	public void turnOff() {
	System.out.println("Audio끔");

	}

	
	public void setVolume(int volume) {
		System.out.println("Audio 소리크기 : "+ volume);
		
	}

}
