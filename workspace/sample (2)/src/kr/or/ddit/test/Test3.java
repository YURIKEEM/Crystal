package kr.or.ddit.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleComp ss = new SampleComp();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 :");
		
		int x = sc.nextInt();
		System.out.print("두번째 수 :");
		int y = sc.nextInt();
		ss.comp(x, y);

	}

}
class SampleComp{
		/*메소드정의 - 두 개의 수를 입력받아서 
	 *큰 수를 출력
	 */
	public void comp(int a, int b){
	    	
		String res = "";
		    if(a==b){
		      res = " a와 b가 같은 수입니다";
	        } else if(a>=b){
		      res = " a가 더 큰 수입니다";
		    }else {
              res = " b가 더 큰 수입니다"	;	    	
		    }	
	    System.out.println("a=" +a);
	    System.out.println("b=" +b);
	    System.out.println("res=" +res);
	    
	     }    	
	}
