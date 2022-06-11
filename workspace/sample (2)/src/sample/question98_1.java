package sample;

public class question98_1 {

	public static void main(String[] args) {
		
		// 문자형 변수 name에 데이터를 할당 (대입)
		String name = "감자바";
		
		// 정수형 변수 age에 데이터를 할당
		int age = 25;
		
		// 문자형 변수 tel1, tel2, tel3를 선언과 동시에 값을 할당 => 초기화
	   String tel1 = "010", tel2 = "123", tel3 = "4567";
		
	   // 이름 : 감자바
		//   +   : 결합연산자
		System.out.println("이름:" +name);
		
		// 나이 : 25
		System.out.print("나이:" + age + "\n");
		
		// 전화: 010-234-4567
		System.out.printf("전화:%3s-%3s-%4s", tel1,tel2,tel3 );

	}

}
