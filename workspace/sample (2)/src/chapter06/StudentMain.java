package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		Student st = new Student(); 
		st.setStId("2020001");
		st.setStName("ȫ�浿");
		st.setTelNum("010-1234-5678");
		printInfo(st);
		
	}
	public static void printInfo(Student st) {
		System.out.println("            [�л�����]");
		System.out.println("�й�          �̸�          ��ȭ��ȣ");
		System.out.println("--------------------------------------");
		System.out.println(st.viewInfo());
		System.out.println();
	}

}
