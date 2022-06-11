package Book;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 문제1] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를 
//	            키보드로 입력하여 저장한 후 합과 평균을 구하시오
		
//		ArrayPractice ap = new ArrayPractice();
//		ap.setNumber();
		
		ArrPrac2 ap2 = new ArrPrac2();
		ap2.setNumber();
		ap2.printResult();
		
		
		
	}

}

//class ArrayPractice{
//	Scanner sc= new Scanner(System.in);
//	int[]num=new int[10];
//	int sum=0;
//	public void setNumber() {
//		for(int i=0; i<num.length; i++) {
//			System.out.println("정수 입력");
//			num[i]=sc.nextInt();
//			
//			sum+=num[i];
//		}
//		System.out.println(Arrays.toString(num));
//		System.out.println("합: " +sum );
//		System.out.println("평균" +sum/num.length);


//문제2] 배열의 크기가  10인 정수형 배열을 만들고 10개의 자료를 
//*              키보드로 입력하여 짝수의 갯수와 홀수의 갯수를 출력하시오

class ArrPrac2{
	Scanner sc= new Scanner(System.in);
	int []num =new int[10];
	public void setNumber() {
		for(int i=0; i<num.length; i++) {
			System.out.print("정수 입력:");
			num[i]=sc.nextInt();
		}
	}
	
	public void printResult() {
		int even=0;
		int odd=0;
		 for(int i=0;i<num.length;i++) {
				if(num[i]%2==0) {
					even ++;
				}else {
					odd++;
				}
		 }
		    System.out.println("짝수 갯수: " +even);
	         System.out.println("홀수 갯수: "+odd);
		}
     
	
}
