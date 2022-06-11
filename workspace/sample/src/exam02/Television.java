package exam02;

public class Television implements RemoteControl {

	
	public void turnOn() {
		System.out.println("Tv켬");

	}


	public void turnOff() {
	System.out.println("Tv끔");

	}

	
	public void setVolume(int volume) {
		System.out.println("Tv 소리크기 : "+ volume);
		
	}

}
