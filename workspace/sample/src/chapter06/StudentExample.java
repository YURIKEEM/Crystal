package chapter06;

public class StudentExample {
	//public 접근제한자 
	//1.public : 어디에서든 접근 가능
	//2.private: class내에서 접근가능
	//3.protected: package내에서 or 상속받은경우 접근가능
	//4.default : package내에서 접근 가능
	// void : 리턴타입=> return이 없다
	//args :매개변수(파라미터를 받아주는 변수. 지역변수
	
    public static void main(String[] args) {
     //설계도 클래스
     //클래스로 만든 객체는 인스턴스
    //설계도 객체명= 생성자 설계도();
	  Student s1= new Student();
	  System.out.println("s1 변수가 Student 객체를 참조합니다");
	  s1.setStId("a001");
	  s1.setStName("개똥이");
	  s1.setTelNum("010-1234-5678");
	  
	  System.out.println("s1 : " +s1.toString());
	  
	  Student s2 = new Student();
	  System.out.println("s2 변수가 또 다른"
			       +"Student 객체를 참조합니다.");
	  s2.setStId("b001");
	  s2.setStName("박명수");
	  s2.setTelNum("010-1111-2222");
	  System.out.println("s2 : "+s2.toString());
}
}
