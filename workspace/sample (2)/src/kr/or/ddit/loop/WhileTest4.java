package kr.or.ddit.loop;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		//10�� �ݺ� 1,2,3,4,5,6,7,8,9,10
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 ="";
		String str2 ="";
		
		//�ʱ��
		int i =1;
		while(i<=10) {
		// �Է�
			System.out.print(i +"��° �Է� : ");
			int su = scanner.nextInt();
		   
		//¦������ Ȧ������ �Ǵ�
		if(su%2==0) {           //�Է��Ѱ� ¦���� Ȧ����
			str1 += su +" ";
		}else {
			str2 += su +" ";
		}
	    //������
			i++;
		}
		System.out.println("¦�� = " +str1);
		System.out.println("Ȧ�� = " +str2);

	}

}
