package kr.or.ddit.loop;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 수를 입력하세요 x");
		int su =sc.nextInt();
		
		For5 f5 = new For5();
		String res=f5.guguProc(su);
		
		System.out.println(res);
	}

}

class For5{
	public String guguProc(int a) {
		String str ="";
		for(int i=1; i<=9; i++){
		  str +=a +"*"+i+"="+a*i +"\n";
		}
		return str;
	}
}