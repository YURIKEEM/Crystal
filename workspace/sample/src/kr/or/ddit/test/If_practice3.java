package kr.or.ddit.test;

import java.util.Scanner;

public class If_practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.print("정수를 입력해주세요 > ");
		int a = sc.nextInt();
		
		if(a%2==0){
			System.out.println("2의 배수입니다.");
		}else{
			System.out.println("2의 배수가 아닙니다.");
		}
	}
}

