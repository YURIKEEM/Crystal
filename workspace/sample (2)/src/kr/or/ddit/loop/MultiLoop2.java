package kr.or.ddit.loop;

public class MultiLoop2 {

	public static void main(String[] args) {
		//Ŭ���� �θ� ��ü����
		Multi2 m2 = new Multi2();
		//out1�Լ� ȣ��
		m2.out1();
        System.out.println("----------------");
        m2.out2();
	}

}

class Multi2{
	
	public void out1() {
		
		for(int i=1; i<=3; i++) {
			
			for(int k=1; k<=5; k++) {
				System.out.print(k+" ");
			}
			System.out.println(); //�� �ٲٱ� ����
		}
	}      //out1 �Լ� ������ ��
	
	public void out2() {
		
		for(int h=1; h<=5; h++ ) {
			
			for(int k=1; k<=5; k++) {
				System.out.print(h+ " ");
			}
			System.out.println();
		}
	}
}    //Multi2 Ŭ���� ��