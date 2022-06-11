package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student(); 
		st.setStId("2020001");
		st.setStName("홍길동");
		st.setTelNum("010-1234-5678");
		printInfo(st);
		
	}
	public static void printInfo(Student st) {
		System.out.println("            [학생정보]");
		System.out.println("학번          이름          전화번호");
		System.out.println("--------------------------------------");
		System.out.println(st.viewInfo());
		System.out.println();
	}

}
