package kr.or.ddit.test;

import java.util.Scanner;

public class If_Q103 {

	public static void main(String[] args) {
		// 130�� 11�� ���� Ǯ��
		
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("���̵�");
		String name = scanner.nextLine();
		
		System.out.println("�н�����");
		String strpwrd = scanner.nextLine();
		int pwrd = Integer.parseInt(strpwrd);
		
		if(name.equals("java")){
			if(pwrd==12345){
				System.out.println("�α��� ����");
			}else{
				System.out.println("�α��� ����: �н����尡 Ʋ��");
			}
		}else{
			System.out.println("�α��� ����: ���̵� �������� ����");
			}
		
		
		

	}

}
