package kr.or.ddit.loop;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요");
		int su = sc.nextInt();

		// For2 클래스 객체 생성
		For2 f2 = new For2();
		// hap 함수를 호출해서 리턴 결과값을 받는다
		int sum = f2.hap(su);
       // 출력
		System.out.println(sum);
	}
}

class For2 {
	int sum = 0;

	public int hap(int a) {
		// 1~ 입력 받은 수까지 합 구하고 리턴
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
}