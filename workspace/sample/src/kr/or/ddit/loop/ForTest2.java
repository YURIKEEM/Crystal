package kr.or.ddit.loop;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		// �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int su = sc.nextInt();

		// For2 Ŭ���� ��ü ����
		For2 f2 = new For2();
		// hap �Լ��� ȣ���ؼ� ���� ������� �޴´�
		int sum = f2.hap(su);
       // ���
		System.out.println(sum);
	}
}

class For2 {
	int sum = 0;

	public int hap(int a) {
		// 1~ �Է� ���� ������ �� ���ϰ� ����
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}
}