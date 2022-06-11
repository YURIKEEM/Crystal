//형변환
/* 1. 자동형변환 (auto casting) double>float>long>int>short>byte
 *   - 프로그램 실행 중 자동으로 형이 변환 (큰 범위로 작은범위 타입이 변환)
 *   - ex) int + short => int + int (결과는 int)
 *         long + int => long + long (결과는 long)
 *         float + double => double + double (결과는 double)
 *         float + long + char => float + float + float (결과는 float)
 * 2. 형변환 연산자(타입) 이용
 *  사용형식
 *   (타입명)변수
 *    . 일시적으로 cast연산자가 사용된 위치에서 형변환  
 *     ex) 20 + (short) 70 => int + int 결과는 int
 *         20L + (short) 70 => long + long 결과는 long
 * 3. 문자열
 *  . 참조타입 (String class타입) 
 *  . " " 안에 기술
 *  . 문자열 + anytype, anytype + 문자열 => 문자열 + 문자열 =>결합
 *     (문자열문자열)
 *     ex) 1990+"10" =>"1990" + "10" => "199010"
 *     ""화이트 스페이스 = NULL 길이를 갖지 않는 데이터
 *         
*/
package chapter01;

public class Lec050304 {
   
    
	public static void main(String[] args) {
		LecTemp It=new LecTemp();
		It. inititest();
	}

}
class LecTemp{
	int i;
	float f;
	char ch;
	boolean b;
	public void inititest() {
		System.out.println("정수형 초기값="+i);
		System.out.println("정수형 초기값="+f);
		System.out.println("정수형 초기값="+ch);
		System.out.println("정수형 초기값="+b);
		
	}
}
