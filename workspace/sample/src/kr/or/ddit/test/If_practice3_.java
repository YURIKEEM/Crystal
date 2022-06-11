package kr.or.ddit.test;

import java.util.Scanner;

public class If_practice3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
     System.out.print("점수를 입력해주세요 > ");
     int num = sc.nextInt();
     
     Judge sc1 =new Judge();
     sc1.pick(num); 
	}

}

class Judge{
  public void pick(int a){
  String str="";
  
  if(a<0||a>100){
	  System.err.println("점수 입력에 오류가 생겼어요!");
  }else if(a>=60){
	  System.out.println("합격 입니다.");
  }else if(a<=60){
	  System.out.println("불합격 입니다.");
  }
	 
  }
  
}