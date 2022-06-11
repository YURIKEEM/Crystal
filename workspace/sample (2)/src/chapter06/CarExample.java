package chapter06;

public class CarExample {
  public static void main(String[] args) {
	//설계도는 클래스
	  //클래스로 만들어진 객체는 인스턴스
	  System.out.println("실행");
	  //myCar : 객체, 클래스변수, 인스턴스
	  //String company, String model, String color,int maxSpeed, int speed
	  
	  Car myCar = new Car("현대자동차","그랜저","검정",350,0);
	  System.out.println("제작회사 : " +myCar.company);
      System.out.println("모델명 : " +myCar.modle);
      System.out.println("색깔 : " +myCar.color);
      System.out.println("최고속도 : " +myCar.speed);
      
      //필드값 변경
      myCar.speed=60;
      System.out.println(myCar.toString());
}
}
     
      