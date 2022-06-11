package kr.or.ddit.loop;

public class ContitueTest2 {

	public static void main(String[] args) {
		// Conti2 클래스 객체 생성
		Conti2 c2 = new Conti2();
		// proc1() 메소드 호출
		c2.proc1();
		// contiProc()메소드 호출
		c2.continueProc();
	}

}

class Conti2 {
	// 1~100사이의 수 중에서 3의 배수 인 것만 출력
	// 누적변수 선언 string
	String str = "";

	// continue없는 메소드
	public void proc1() {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				str += i + " ";
			System.out.println(i);
			str = "";
		}
	}

	// continue를 사용하는 메소드
	public void continueProc() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0)
				continue;
			str += i + " ";
			System.out.println(i);

		}
	}
}