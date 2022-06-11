package haSsemClass;

public class SenderEx {
	 public static void main(String[] args) {
	        //추상 클래스는 인스턴스를 절대로 생성하지 못한다. 
	        //ContentSender contentSender = new ContentSender();
	        //예외 발생 이유? ContentSender가 추상클래스라서 추상메서드를
	        //자손에서 오버라이딩 해주어야 인스턴스가 생성된다.
	        
	        ContentSender cs1 = new LetterSender("SMS문자", "서수진", "4달라"); //필드의 다형성
	        cs1.sendMsg("이정화");
	        
	        System.out.println();
	        
	        LetterSender ls = new LetterSender("SMS문자", "김민니", "3달라");
	        ls.sendMsg("조미연");
	        
	        System.out.println();
	        
	        ContentSender cs2 = new KakaoSender("카톡", "송우기", "10달라");
	        cs2.sendMsg("전소연");
	    }

}
