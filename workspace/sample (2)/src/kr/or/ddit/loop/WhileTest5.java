package kr.or.ddit.loop;

import java.util.Scanner;

public class WhileTest5 {

	public static void main(String[] args) {

		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("구구단 수 입력 ");
		int su = scanner.nextInt();

		// 구구단 출력 - while
		int i = 1;
		while (i < 10) {
			System.out.println(su + "*" + i + "=" + su * i);
			i++;
		}
	}

}
