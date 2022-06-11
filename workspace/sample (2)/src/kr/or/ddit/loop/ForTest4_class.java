package kr.or.ddit.loop;

import java.util.Scanner;

public class ForTest4_class {

	public static void main(String[] args) {
		
     
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int su =sc.nextInt();
		
		For4 f4 = new For4();
        f4.guguProc(su);
        
	}

}

class For4{
	
	public void guguProc(int a) {
		for(int i=1; i<=9; i++) {
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
}