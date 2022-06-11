package kr.or.ddit.test;

import java.util.Scanner;

public class If_Q103 {

	public static void main(String[] args) {
		// 130쪽 11번 문제 풀기
		
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("아이디");
		String name = scanner.nextLine();
		
		System.out.println("패스워드");
		String strpwrd = scanner.nextLine();
		int pwrd = Integer.parseInt(strpwrd);
		
		if(name.equals("java")){
			if(pwrd==12345){
				System.out.println("로그인 성공");
			}else{
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		}else{
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
			}
		
		
		

	}

}
