package kr.or.ddit.test;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {

		LoginTest log = new LoginTest();
		log.loginProc();

	}

	public void loginProc() {

		// �Է�
		Scanner sc = new Scanner(System.in);
		// ���̵�� ��й�ȣ
		System.out.println("���̵� �Է��ϼ��� : ");
		String id = sc.nextLine();

		System.out.println("�н����� �Է��ϼ��� : ");
		String pass = sc.nextLine();

		String res = "";

		// �� - pass�� ���ڷ� ��
		int ipass = Integer.parseInt(pass);

		if (id.equals("yuri")) {
			if (ipass == 12345) {
				res = "�α��μ���";
			} else {
				res = "�α��� ���� - �н��������";
			}
		} else {
			res = "�α��� ���� - ���̵� ���� ���� ���� ";
		}

		// ���
		String str = "�Է�id =" + id + "\n";
		str += "�Է� pass= " + pass + "\n";
		str += "��� : " + res;

		System.out.println(str);

	}
}