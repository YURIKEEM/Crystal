package kr.or.ddit.test;

import java.util.Scanner;

public class If_practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.print("������ �Է����ּ��� > ");
		int a = sc.nextInt();
		
		if(a%2==0){
			System.out.println("2�� ����Դϴ�.");
		}else{
			System.out.println("2�� ����� �ƴմϴ�.");
		}
	}
}

