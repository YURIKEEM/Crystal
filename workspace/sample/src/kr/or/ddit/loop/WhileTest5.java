package kr.or.ddit.loop;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {

		// �Է�
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �� �Է� ");
		int su = scanner.nextInt();

		// ������ ��� - while
		int i = 1;
		while (i < 10) {
			System.out.println(su + "*" + i + "=" + su * i);
			i++;
		}
	}

}
