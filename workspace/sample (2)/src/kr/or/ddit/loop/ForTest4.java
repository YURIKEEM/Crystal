package kr.or.ddit.loop;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		// �Է� 5
		
		//������ ��� - 1,2,3,4,5,6,7,8,9 �Է°��� �����ִ� �� �����
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ ���� �Է��ϼ��� ");
		int su = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(su+"*"+i+"=" +su*i);
		}

	}

}
