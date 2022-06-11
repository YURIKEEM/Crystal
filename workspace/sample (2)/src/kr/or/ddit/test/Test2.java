package kr.or.ddit.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수로 입력하세요");
		int a = sc.nextInt();
		System.out.println("입력 수:" +a);
		
		//int b = a+1;
		a++;//a++; //a = a + 1;
		
		System.out.println("1 증가한 수:" +a);
		
		
		int b = 15;
	    int c = b + a;
	    
	   // int d = b+ a++; //산술 먼저 하고 a값을 증가 15+6 = (d)21 a>>7
	    int d = b + ++a;// a증가 먼저 하고 산술 15 + 7= (d)22      a=7
	    System.out.println("a="+a+" b="+b);
	    System.out.println("c="+c+" d="+d);
	}

}
