package kr.or.ddit.loop;

import java.util.Scanner;

public class WhileTest8 {

	public static void main(String[] args) {
		//Q.����(1~100����)�� 5�� �Է� �� ��� 
		Scanner sc= new Scanner(System.in);
		
		String str= "";
		int count =0;
		String strAll = "";
		
		while(true) {
			//�Է�
			System.out.println("���� �Է�");
			int x = sc.nextInt();
			strAll += x +" ";
					
			//�Է°� ��1~100 �϶� str�� ����, count++
			if(x>=1 && x<=100) {
				str += x+" ";
				count++;
				}
			
			//break ���� �Ǵ� (count�� 5�� �Ǹ�)
			if(count==5) break;
			}
		System.out.println("�Է��� ��� ��: " +strAll);
		System.out.println("�ùٸ� ��: " +str);
		}


	}


