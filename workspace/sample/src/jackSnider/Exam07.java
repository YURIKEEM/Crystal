/*
 * 숫자 n이 입력되면 그 수가 소수인지 아닌지 판별하시오.

예제입력—
5

예제출력
5는 소수

예제입력—
6

예제출력—
6은 소수아님

예제입력—
3

예제출력—
3은 소수

제한사항 : 없음
 */
package jackSnider;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력하세요 : ");
		int num=sc.nextInt();
		int primeNum=0;
		
		for(int i=num; ;) {
			for(int j=2; j<=3; j++) {
				if(i%j==1) {
					primeNum = i;
					System.out.println("소수입니다.");
				}else if(i%j!=1) {
					System.out.println("소수가 아닙니다");
				}
			}
		}
		

	
		}
	
}
