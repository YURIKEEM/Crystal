package kr.or.ddit.loop;

import java.util.Scanner;

public class WhileTest7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ��� �Է� �ϴٰ� 0 �Է��ϸ� ����
		String str="";
		int count = 1;
	     while(true) {
			
	    	 System.out.println("��" + count + "�Է�");
			int su = sc.nextInt();
			
			if(su==0)break;
			
			str += su +" ";
			count++;       //while �ݺ� Ƚ���� �ƴ�
		}
	     System.out.println(str);

	}

}
