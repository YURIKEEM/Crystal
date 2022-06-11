package kr.or.ddit.loop;

import java.util.Scanner;

public class WhileTest8 {

	public static void main(String[] args) {
		//Q.점수(1~100사이)를 5개 입력 후 출력 
		Scanner sc= new Scanner(System.in);
		
		String str= "";
		int count =0;
		String strAll = "";
		
		while(true) {
			//입력
			System.out.println("점수 입력");
			int x = sc.nextInt();
			strAll += x +" ";
					
			//입력값 비교1~100 일때 str에 누적, count++
			if(x>=1 && x<=100) {
				str += x+" ";
				count++;
				}
			
			//break 조건 판단 (count가 5가 되면)
			if(count==5) break;
			}
		System.out.println("입력한 모든 값: " +strAll);
		System.out.println("올바른 값: " +str);
		}


	}


