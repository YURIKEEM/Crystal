package kr.or.ddit.loop;

import java.util.Scanner;

public class MultiLoop4 {

	public static void main(String[] args) {
        //Q. �� �Է��ؼ� ������ ��� 0�Է½� ���� 
		
		Scanner sc = new Scanner(System.in);
         
		//������ �� �Է�
		while(true) {
			System.out.println("�� �Է�");
			int gugu = sc.nextInt();
			
			if(gugu==0) break;
			
			//������ ���
			for(int i =1; i<=9;i++)
				System.out.println(gugu+"*"+i+"=" +gugu*i);
			
		}

	}

}
