package kr.or.ddit.test;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		
		// 수 한개 입력(1 - 100)
		
		//비교 80이상이면 우수 아니면 노력
		
		Scanner scn = new Scanner(System.in);
		System.out.print("수 입력");
		int x = scn.nextInt();
		
		String res = "";
		if (x>=80){
			res = "우수";
		}else{
			res = "노력";
		}
        System.out.println("입력 점수: "+x);
        System.out.println("결과: " +res);
	}

}
