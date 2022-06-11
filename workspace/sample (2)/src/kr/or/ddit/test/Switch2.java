package kr.or.ddit.test;

import java.util.Scanner;

public class Switch2 {

	public static void calc() {
		
		// 입력  1~100
				Scanner sc = new Scanner(System.in);
				System.out.print("점수입력(1~100) ");
				int score = sc.nextInt();
				
				String res="";
				
				// 성적 비교
				switch(score/10) { //10으로 나눠서 대표 점수 만들어야함
				case 10: 
			    case 9: 
					res = "수";
					break;
				case 8:
					res = "우";
					break;
				case 7:
					res = "미";
					break;
				case 6:
					res = "양";
					break;
				default:
				    res = "가";
				break;
				
				}
				
				//결과출력
          System.out.println("입력점수 : ");
          System.out.println("결과 : ");
	}
	public static void main(String[] args) {
		calc();

	}

}
