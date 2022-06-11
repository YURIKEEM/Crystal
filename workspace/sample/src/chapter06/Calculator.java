package chapter06;
 //설계도는 클래스
public class Calculator {
   //메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	//두 개의 파라미터를 받아서 
	//각 x,y라는 매개변수에 할당을 하여
	//덧셈연산을 하고 결과를 result라는 변수에 할당
	//result 결과값을 int 리턴타입을로써 리턴해줌
	//접근제한자가 생략되어 있으므로 default(패키지 내 접근허용)
	int plus(int x,int y) {
		int result = x+y;
		return result;
	}
	//두 개의 파라미터를 받아서 각 x와 y라는 매개변수에 할당을 하여
	//나눗셈 연산을 수행하고 결과값을 double형인 result변수에
	//할당을 하며 그 결과값은double 리턴타입으로써 리턴함
	double divide(int x, int y) {
		//3/2 =< 1 (x)
		//(double)3/(double)2 => 1.5
		double result = (double)x/(double)y;
		return result;
	}
	//리턴타입이 void? return 값이 없다는 뜻.
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
