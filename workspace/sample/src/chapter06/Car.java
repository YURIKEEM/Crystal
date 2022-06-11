package chapter06;

  //자동차 클래스(설계도)
public class Car {
  //필드=멤버변수=속성
	//접근제한자 생략 =>default :같은 패키지에서 접근 가능하다
    //제조사(문자)
	String company ="현대자동차"; 
	//모델(문자)
	String model ;
	// 색깔
	String color ;
	//최대스피드(숫자)
	int maxSpeed ;
	//현재스피드
	int speed;

	//기본생성자
	Car() {}
	
   //오버로딩. 매개변수의 순개타(판)  순서.갯수.타입
	Car(String model) {
		//model : 이곳으로 던져지는 문자형 파라미터를 
		//담아주는 매개변수임(지역변수: 이 블록에서 벗어나면 메모리에서 없어짐)
		//멤버변수<=매개변수를 할당(대입)
//		this.model=model;
//		this.color="은색";
//		this.maxSpeed=250;
		  //this() : 나도 생성자인데.. 다른 생성자를 호출 => 다른 생성자 호출
		 //첫 줄에서만 허용
		//String name ="개똥이" nonono!!
		this(model,"은색",250);
	}
	
	//생성자 오버로딩. 순개!타(판)
		Car(String model,String color) {
			//매개변수의 값을 멤버변수에 할당(대입)
//			this.model=model;
//			this.color=color;
//			this.maxSpeed=250;
			this(model,color,250);
		}
		//생성자 오버로딩. 순개!타(판)
		//파라미터 3개 오고. 매개변수 3개 받기.
		Car(String model,String color,int maxSpeed){
			this.model=model;
			this.color=color;
			this.maxSpeed=maxSpeed;
			
			
		}
		
	
	
}
	
	