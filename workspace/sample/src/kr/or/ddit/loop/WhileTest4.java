package kr.or.ddit.loop;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		//10번 반복 1,2,3,4,5,6,7,8,9,10
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 ="";
		String str2 ="";
		
		//초기식
		int i =1;
		while(i<=10) {
		// 입력
			System.out.print(i +"번째 입력 : ");
			int su = scanner.nextInt();
		   
		//짝수인지 홀수인지 판단
		if(su%2==0) {           //입력한게 짝수냐 홀수냐
			str1 += su +" ";
		}else {
			str2 += su +" ";
		}
	    //증가식
			i++;
		}
		System.out.println("짝수 = " +str1);
		System.out.println("홀수 = " +str2);

	}

}
