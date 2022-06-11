//2022-050301)데이터타입
/*
 *  기본타입과 참조타입
 * 1.기본타입- 8가지 (객체 아님 객체가 되면 앞글자 대문자 됨)
 *  .정수형- byte, short, int, long
 *  .실수형- float, double
 *  .문자형- char
 *  .부울형- boolean
 * 2.참조타입 (실제 데이터가 아닌 저장된 주솟값)
 *  .배열과 클래스 객체             초깃값=null
 *  
 * 3.변수 선언
 *  사용형식
 *  타입명 변수명 [=초기값];
 *  1) 사용자 정의 단어(identifier)
 *   - 영문자와 숫자 및 특수문자로 구성
 *   - 첫 글자는 반드시 영문자
 *   - 변수명과 메서드명은 소문자로 구성 (두번째 단어 첫 글자는 대문자) *생성자 메서드는 첫글자 꼭 대문자(클래스명과 같아야해서)
 *     ex) firstName, lastName getPara(), setPara(int age)
 *   - 클래스이름은 첫 글자만 대문자로 기술
 *     ex) StudentInfo, FirstClass
 *   - 상수는 대문자로 기술
 *     ex) double final PI=3.1415926;
 *   - 예약어 (명령문 등)는 사용할 수 없다  
 *   
 */
package sample;

public class Lec050301 {

	public static void main(String[] args) {
		byte b;
		b=(byte) 20;
		
		byte b1=(byte) 127;
		byte b2=(byte) 128;
		
		System.out.println("b="+b);
		System.out.println("b1="+b1);	
		System.out.println("b2="+b2);
		
		
		short s1;
		s1=(short)32768;
		short s2=(short)127;
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		int res=0;
		int i=100;
		res=i+s2+b1; 
		/*산술식에 사용되어진 데이터타입 중 int보다 작은타입 (short byte char)은 무조건 int로 변한다.*/
		
		byte r1=0;
		r1=(byte)(b1+100); 
		/*괄호 안은 int보다 작은 타입이라 int로 변환된다. 227이 바이트타입으로 나오게 됨*/
		
		
		
	}

}


 
