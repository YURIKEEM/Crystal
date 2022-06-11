package kr.or.ddit.loop;

public class ForTest3 {

	public static void main(String[] args) {
		// 1,2,3,4,5,6,7,8,9,10 전체 합 구하기

		int hap = 0;

		for (int i = 1; i <= 10; i++) {

			hap += i; // hap= hap+i;
		}
		System.out.println("1~10까지의 합= " + hap);
	}

}
