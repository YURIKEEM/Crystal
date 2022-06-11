package chapter06;

  //자동차 클래스(설계도)
public class Car {
  //필드=멤버변수=속성
	//접근제한자 생략 =>default :같은 패키지에서 접근 가능하다
    //제조사(문자)
	String company ;
	//모델(문자)
	String modle ;
	// 색깔
	String color ;
	//최대스피드(숫자)
	int maxSpeed ;
	//현재스피드
	int speed;
	
	//기본생성자
	public Car() {}

		
	//생성자 : 객체가 생성될 때 자동으로 실행(초기값을 세팅 시 사용)	
	//                  "현대자동차","그랜저","검정",350,0
	public Car(String company, String modle, String color, int maxSpeed, int speed) {
       super();
		this.company = company;
		this.modle = modle;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Car [company=" + company + ", modle=" + modle + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}

}
