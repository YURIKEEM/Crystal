package kr.or.ddit.test;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {

		LoginTest log = new LoginTest();
		log.loginProc();

	}

	public void loginProc() {

		// 입력
		Scanner sc = new Scanner(System.in);
		// 아이디와 비밀번호
		System.out.println("아이디 입력하세요 : ");
		String id = sc.nextLine();

		System.out.println("패스워드 입력하세요 : ");
		String pass = sc.nextLine();

		String res = "";

		// 비교 - pass는 숫자로 비교
		int ipass = Integer.parseInt(pass);

		if (id.equals("yuri")) {
			if (ipass == 12345) {
				res = "로그인성공";
			} else {
				res = "로그인 실패 - 패스워드오류";
			}
		} else {
			res = "로그인 실패 - 아이디 존재 하지 않음 ";
		}

		// 출력
		String str = "입력id =" + id + "\n";
		str += "입력 pass= " + pass + "\n";
		str += "결과 : " + res;

		System.out.println(str);

	}
}