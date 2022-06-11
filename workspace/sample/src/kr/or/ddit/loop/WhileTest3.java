package kr.or.ddit.loop;

public class WhileTest3 {

	public static void main(String[] args) {
		// 1~100 짝수의 합과 홀수의 합을 구한다

		int sum1 = 0;
		int sum2 = 0;

		int i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
			i++;
		}
		System.out.println("짝수의 합= " +sum1);
		System.out.println("홀수의 합= " +sum2);

	}

}
