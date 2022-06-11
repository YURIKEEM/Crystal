package kr.or.ddit.loop;

import java.util.Scanner;

public class MultiLoop4 {

	public static void main(String[] args) {
        //Q. 수 입력해서 구구단 출력 0입력시 중지 
		
		Scanner sc = new Scanner(System.in);
         
		//구구단 수 입력
		while(true) {
			System.out.println("수 입력");
			int gugu = sc.nextInt();
			
			if(gugu==0) break;
			
			//구구단 출력
			for(int i =1; i<=9;i++)
				System.out.println(gugu+"*"+i+"=" +gugu*i);
			
		}

	}

}
