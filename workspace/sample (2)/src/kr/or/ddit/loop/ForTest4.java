package kr.or.ddit.loop;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		// 입력 5
		
		//구구단 출력 - 1,2,3,4,5,6,7,8,9 입력값과 곱해주는 식 만든다
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 수를 입력하세요 ");
		int su = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(su+"*"+i+"=" +su*i);
		}

	}

}
