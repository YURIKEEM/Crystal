package kr.or.ddit.loop;

import java.util.Scanner;

public class MultiLoop1 {

	public static void main(String[] args) {
		// ������ ���� �Է�
		Scanner scanner = new Scanner(System.in);

		int j = 1;
		while (j <= 3) {
			System.out.println("������ �� �Է�: ");
			int su = scanner.nextInt();

			// ������ ���

			int i = 1;
			while (i <= 9) {
				System.out.println(su + "*" + i + "=" + su * i);

				i++;
			}
			i++;
		}
	}
}
