package kr.or.ddit.test;

import java.util.Scanner;

public class Switch2 {

	public static void calc() {
		
		// �Է�  1~100
				Scanner sc = new Scanner(System.in);
				System.out.print("�����Է�(1~100) ");
				int score = sc.nextInt();
				
				String res="";
				
				// ���� ��
				switch(score/10) { //10���� ������ ��ǥ ���� ��������
				case 10: 
			    case 9: 
					res = "��";
					break;
				case 8:
					res = "��";
					break;
				case 7:
					res = "��";
					break;
				case 6:
					res = "��";
					break;
				default:
				    res = "��";
				break;
				
				}
				
				//������
          System.out.println("�Է����� : ");
          System.out.println("��� : ");
	}
	public static void main(String[] args) {
		calc();

	}

}
