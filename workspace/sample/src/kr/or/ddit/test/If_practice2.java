package kr.or.ddit.test;

import java.util.Scanner;

public class If_practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc =new Scanner(System.in);
		System.out.print("������ �Է����ּ��� >");
		int x =sc.nextInt();
		
		if(x>=70){
			System.out.print("�ش� �л��� ������ " +x+"��"+" �̸�,");
			System.out.print("�հ��Դϴ�.");
		}else{
			System.out.print("�ش� �л��� ������ " +x+"��"+" �̸�");
			System.out.print("���հ��Դϴ�.");
		}
	}

}
