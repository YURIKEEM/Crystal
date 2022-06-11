//(2022-0504-01) 연산자 Operator
/*1. 연산자의 종류
 *  - 산술, 관계, 논리, 대입, 증감, 조건
 *  - 단항, 이항, 삼항
 * 
 * 
 */
package chapter03;

public class Operator01 {

	public static void main(String[] args) {
		//  산술연산자: +, -, /, *, %
		// 연산결과는 값 (value)을 반환
		// % 나머지 연산자
       
		Oper op1=new Oper(); //클래스 객체 생성 'new' 객체/배열 생성할때 쓰인다 힙메모리에 기억공간 만드는애. new 다음은 생성자라서 대문자로 썼다.
        System.out.println("덧셈="+op1. add(10 , 50));
        System.out.println("덧셈="+op1. add(10.5 , 50));
        System.out.println("덧셈="+op1. add(10.5f , 50L));
        System.out.println("덧셈="+op1. add(10 , 'b'));
        System.out.println("나머지="+op1.remainder(2022, 7));
        
	}

}

class Oper{
	
	public int add (int a, int b) {
		int res=a+b; //지역변수라서 괄호 벗어나면 회수되어 사라짐
		return res;
	}
	
		
		public double add (double a, int b) { 
			double res=a+b; //그래서 위와 같은 알파벳이지만 다른 아이임 
			return res;
    }		
		public float add (float a, long b) { 
		 return a+b;
       }
		public short add (int a, char b) { 
			short res= (short) (a+b) ;
			return res;
  }
		public int remainder (int a, int b) {
			 int res=a%b;
			 return res;
      }
   }