package kr.or.ddit.test;

import java.util.Scanner;

public class If_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc =new Scanner(System.in);
		System.out.print("점수를 입력해주세요 >");
		int x =sc.nextInt();
		
		if(x>=70){
			System.out.print("해당 학생의 점수는 " +x+"점"+" 이며,");
			System.out.print("합격입니다.");
		}else{
			System.out.print("해당 학생의 점수는 " +x+"점"+" 이며");
			System.out.print("불합격입니다.");
		}
	}

}
