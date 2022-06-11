package kr.or.ddit.loop;

import java.util.Scanner;

public class MultiLoop1 {

	public static void main(String[] args) {
		// 구구단 수를 입력
		Scanner scanner = new Scanner(System.in);

		int j = 1;
		while (j <= 3) {
			System.out.println("구구단 수 입력: ");
			int su = scanner.nextInt();

			// 구구단 출력

			int i = 1;
			while (i <= 9) {
				System.out.println(su + "*" + i + "=" + su * i);

				i++;
			}
			i++;
		}
	}
}
