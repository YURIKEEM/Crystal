package kr.or.ddit.test;

import java.util.Scanner;

public class If_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 >");
		int z =sc.nextInt();
		
		Result rst =new Result();
		String res=rst.comp2(z);
		
		System.out.print("해당 학생의 점수는 " +z+"점 이며, ");
		System.out.println(res);
		
		
	}

}

class Result{
	public String comp2 (int z){
     String res="";
     
     if(z>=70){
    	 res = "합격입니다.";
     }else{
    	 res = "불합격입니다.";
     }
     return res;
	}   
}