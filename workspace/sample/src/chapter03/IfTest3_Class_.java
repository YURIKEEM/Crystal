package chapter03;

import java.util.Scanner;

public class IfTest3_Class_ {

	public static void main(String[] args) {
	
		//입력
		Scanner scn = new Scanner(System.in);
		System.out.println("수 입력 1~100 사이로");
		int x = scn.nextInt();
		
		//Score메소드 호출 - 결과값을 return 받는다
		Score4 sco = new Score4 ();
	    String res = sco.comp(x);
		
		//출력
		System.out.println("입력받은 수: "+x);
		System.out.println("결과: "+res);

		
		
	}

}
  
  class Score4{
  public String comp (int x){
    	String res= "";
    
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
		return res;
    }
 }
    
