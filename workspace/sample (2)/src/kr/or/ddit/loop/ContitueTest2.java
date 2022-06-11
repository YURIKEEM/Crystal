package kr.or.ddit.loop;

public class ContitueTest2 {

	public static void main(String[] args) {
		// Conti2 Ŭ���� ��ü ����
		Conti2 c2 = new Conti2();
		// proc1() �޼ҵ� ȣ��
		c2.proc1();
		// contiProc()�޼ҵ� ȣ��
		c2.continueProc();
	}

}

class Conti2 {
	// 1~100������ �� �߿��� 3�� ��� �� �͸� ���
	// �������� ���� string
	String str = "";

	// continue���� �޼ҵ�
	public void proc1() {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				str += i + " ";
			System.out.println(i);
			str = "";
		}
	}

	// continue�� ����ϴ� �޼ҵ�
	public void continueProc() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0)
				continue;
			str += i + " ";
			System.out.println(i);

		}
	}
}