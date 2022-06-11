package kr.or.ddit.test;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력 1~100사이로");
		int x =sc.nextInt();
		
		String res ="";
		//비교
		if (x>=90){
			res = "수";
		}else if(x>=80){
			res = "우";
		}else if(x>=70){
			res = "미";
		}else if(x>=60){
			res = "양";
		}else{
			res = "가";
		}
		
		//출력
		System.out.println("입력받은 수: " +x);
		System.out.println("결과: " +res);
		
		
		
	}

}
