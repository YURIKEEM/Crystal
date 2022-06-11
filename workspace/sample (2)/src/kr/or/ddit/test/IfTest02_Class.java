package kr.or.ddit.test;

import java.util.Scanner;

public class IfTest02_Class {

	
	
	
	
	public static void main(String[] args) {
		// 입력

		 Scanner scn= new Scanner(System.in); 
		 
		 System.out.println("정수 입력");
		 int a =scn.nextInt();
		 
		 //Score의 comp메소드 호출 - 결과값 받기
		 Score scr = new Score();
		 String str = scr.comp(a);
		//출력
		 System.out.println("입력점수:" +a);
		 System.out.println("결과:" +str);
	 }
    
	}

class Score{

public String comp(int a){
	String result = "";
	//a값 비교
	if (a>=80){
		result= "우수";
	}else{
		result= "노력";
	}
	return result;
  }
}