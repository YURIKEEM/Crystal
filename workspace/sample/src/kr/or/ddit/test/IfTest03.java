package kr.or.ddit.test;

import java.util.Scanner;

public class IfTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� 1~100���̷�");
		int x =sc.nextInt();
		
		String res ="";
		//��
		if (x>=90){
			res = "��";
		}else if(x>=80){
			res = "��";
		}else if(x>=70){
			res = "��";
		}else if(x>=60){
			res = "��";
		}else{
			res = "��";
		}
		
		//���
		System.out.println("�Է¹��� ��: " +x);
		System.out.println("���: " +res);
		
		
		
	}

}
