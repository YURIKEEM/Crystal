/*
 * 2중 for문을 이용하여 2단부터 9단까지 구구단을 전부 출력하시오


예시 출력

2단
2 x 1 = 2
…
2 x 9 = 18

3단

…

9단
 */
package jackSnider;

public class Exam02 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9;j++) {
				System.out.println(i+"*"+j+"=" +(i*j));
			}
		}
				
		
		

	}

}
