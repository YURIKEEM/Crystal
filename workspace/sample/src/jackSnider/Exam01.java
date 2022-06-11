package jackSnider;
/*
 * 문제1번~

Main클래스를 생성하고(main메소드를 포함하고 있는) main메소드에서 코드를 작성한다. 

문제는 

int a = 10;
int b = 20;

일때 a의 값과 b의 값을 서로 바꾸시오

즉, a = 20, b = 10이 되도록 작성하면 된다.

출력 형식은

---------------------
변경전 : a = 10, b = 20
변경후 : a = 20, b = 10

으로 출력하면 된다.
 */
public class Exam01 {

	public static void main(String[] args) {
		 
		int a = 10;
		int b = 20;
      System.out.println("변경 전 : a = "+a+", b = "+b);
      
      int temp;
      temp = a;
      a = b;
      b = temp;
      System.out.println("변경 후 : a = "+a+", b = "+b);
	}

}
