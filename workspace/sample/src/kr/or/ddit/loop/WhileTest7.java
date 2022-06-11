package kr.or.ddit.loop;

import java.util.Scanner;

public class WhileTest7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 계속 입력 하다가 0 입력하면 종료
		String str="";
		int count = 1;
	     while(true) {
			
	    	 System.out.println("수" + count + "입력");
			int su = sc.nextInt();
			
			if(su==0)break;
			
			str += su +" ";
			count++;       //while 반복 횟수가 아님
		}
	     System.out.println(str);

	}

}
