package kr.or.ddit.loop;

public class ForTest6 {

	public static void main(String[] args) {
		
		//For6 Ŭ������ü����
		For6 f6 = new For6();
		
		//hap1�޼ҵ� ȣ�� - ����� �ޱ�
		//����� ���
		int sum1 =f6.hap1();
		System.out.println("1~10������ ��= "+sum1);
		//hap2�޼ҵ�ȣ��
		f6.hap2();
       
	}

}

class For6{
	//1~10 ���� ���� ���ؼ� �����ϴ� �޼ҵ带 �ۼ�
    public int hap1() {
    	int hap = 0;
    	
    	for(int i=1; i<=10; i++) {
    		hap += i;
    	}
    	return hap;
    }
	
	//10~1 ���� ���� ���ؼ� ����ϴ� �޼ҵ带 �ۼ�
	public void hap2() {
		int hap = 0;
		
		for (int i=10; i>=1; i--) {
			hap += i;
		}
		System.out.println("10~1������ ��= "+hap );
	}
}