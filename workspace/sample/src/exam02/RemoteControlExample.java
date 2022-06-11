package exam02;


public class RemoteControlExample {
    public static void main(String[] args) {
	    System.out.println("시작");
    	//인터페이스(켜다, 끄다, 볼륨조절)
    	RemoteControl rc;
        //클래스(실체) (텔레비전을 켜다, 텔레비전을 끄다, 텔ㄹ.....)
    	//rc라고 선언된 인터페이스 변수에
    	//Television 구현 객체를 대입 
    	//Television 구현 객체의 번지를 저장(100번지)
        rc = new Television();
        //Tv를 켜다
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(5);
        //****스프링은 클래스보다 인터페이스를 더 좋아해
        //클래스(실체) (오디오를 켜다, 텔레비전을 끄다, 텔ㄹ.....)
    	//rc라고 선언된 인터페이스 변수에
    	//Audio 구현 객체를 대입 
    	//Audio구현 객체의 번지를 저장(110번지)
        rc = new Audio();
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(7);
	}
	
}
