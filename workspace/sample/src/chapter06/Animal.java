package chapter06;

public class Animal {
   String name;   //멤버변수 글씨 파란색
   String kind;
   public String getName() {
	   return name;
   }
   
   public void setName(String name) {  //(지역변수) 자기가 선언된 블록내에서만 유효
	   this.name=name;   //this.자기가 속한 클래스의 주소값을 참조할때
   }
}
