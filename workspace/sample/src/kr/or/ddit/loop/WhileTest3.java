package kr.or.ddit.loop;

public class WhileTest3 {

	public static void main(String[] args) {
		// 1~100 ¦���� �հ� Ȧ���� ���� ���Ѵ�

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
		System.out.println("¦���� ��= " +sum1);
		System.out.println("Ȧ���� ��= " +sum2);

	}

}
