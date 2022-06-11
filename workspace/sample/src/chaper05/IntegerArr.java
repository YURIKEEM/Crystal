/*   문제1] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를 
 *             키보드로 입력하여 저장한 후 합과 평균을 구하시오
 *             
 *    문제2] 배열의 크기가  10인 정수형 배열을 만들고 10개의 자료를 
 *              키보드로 입력하여 짝수의 갯수와 홀수의 갯수를 출력하시오
 *              
 *     문제3] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를
 *              키보드로 입력하여 가장 큰 수와 가장 작은 수를 출력하시오
 *              
 *      문제4] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를
 *                키보드로 입력하여 크기순으로 정렬하여 출력하시오                         
 */

package chaper05;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArr {

	public static void main(String[] args) {
//	IntEx01 ie01 = new IntEx01();
//	ie01.setInteger();
//	ie01.printResult();

//		IntEx02 ie02 = new IntEx02();
//		ie02.setInteger();
//		ie02.printResult();

//		IntEx03 ie03 = new IntEx03();
//		ie03.setInteger();
//		ie03.printResult();

		IntEx04 ie04 = new IntEx04();
		ie04.setInteger();
		ie04.bubble_sort();

	}

}

class IntEx01 { // 클래스 멤버 메소드는 다 사용할 수 있는변수
	Scanner sc = new Scanner(System.in); // 클래스 안 메소드 밖에 위치>>멤버변수 (자동 초기화된다)
	int[] num = new int[10]; // 키보드로 입력받은 값을 저장할 배열장소 생성

	public void setInteger() {
		for (int i = 0; i < 10; i++) { // 배열의 인덱스로 사용하기 위해 0을 초깃값으로 했음
			System.out.print("정수입력 : ");
			num[i] = sc.nextInt();

		}
	}

	public void printResult() {
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		// 평균은 한번만 구하면 되니까 for문 밖에서
		// enhanced for(':뒤 배열'과 같은 타입 변수명:배열)
		for (int su : num) { // 자기가 알아서 배열 첫 공간부터 마지막 공간까지 들어있는 값을 모두 중복없이 검사
			System.out.print(su + ", "); // 하고 변수명에 넣어주는 애 for(타입 변수:배열명or컬렉션){
			// 배열요소 하나씩 출력
		}
		System.out.println();
		// Array 클래스를 이용한 출력
		System.out.println(Arrays.toString(num));
		System.out.println("합= " + sum);
		System.out.println("평균=" + (sum / num.length));
	}
}

//   문제2] 배열의 크기가  10인 정수형 배열을 만들고 10개의 자료를 
//              키보드로 입력하여 짝수의 갯수와 홀수의 갯수를 출력하시오
class IntEx02 {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];

	public void setInteger() {
		for (int i = 0; i < 10; i++) {
			System.out.print("정수입력 : ");
			num[i] = sc.nextInt();
		}
	}

	public void printResult() {
		int even = 0;
		int odd = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("짝수 갯수: " + even);
		System.out.println("홀수 갯수: " + odd);

	}
}

//문제3] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를
//             키보드로 입력하여 가장 큰 수와 가장 작은 수를 출력하시오

class IntEx03 {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];

	public void setInteger() {
		for (int i = 0; i < 10; i++) {
			System.out.println("정수입력 : ");
			num[i] = sc.nextInt();
		}
	}

	public void printResult() {
		int tempMax = num[0];
		int tempMin = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > tempMax) {
				tempMax = num[i];
			}
			if (num[i] < tempMin) {
				tempMin = num[i];
			}
		}
		System.out.println("가장 큰 값: " + tempMax);
		System.out.println("가장 작은 값: " + tempMin);
	}
}

//문제4] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를
//               키보드로 입력하여 크기순으로 정렬하여 출력하시오    

class IntEx04 {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];

	public void setInteger() {
		for (int i = 0; i < 10; i++) {
			System.out.println("정수입력");
			num[i] = sc.nextInt();
		}
	}

	public void bubble_sort() {
		   for(int i=1; i<num.length; i++) {
			   for(int j=0; j<num.length-i; j++) {
				   if(num[j]>num[j+1]) {
					   swap(num,j,j+1);
				   }
			   }
		   }
		   System.out.println(Arrays.toString(num));
		   }
	   
	public void swap(int [] tar,int a,int b) {
		
		int temp=0;
		temp=tar[a];
	    tar[a]=tar[b];
	    tar[b]=temp;
	}
}


