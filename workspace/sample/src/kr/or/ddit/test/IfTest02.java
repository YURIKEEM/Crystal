package kr.or.ddit.test;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		
		// �� �Ѱ� �Է�(1 - 100)
		
		//�� 80�̻��̸� ��� �ƴϸ� ���
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�� �Է�");
		int x = scn.nextInt();
		
		String res = "";
		if (x>=80){
			res = "���";
		}else{
			res = "���";
		}
        System.out.println("�Է� ����: "+x);
        System.out.println("���: " +res);
	}

}
