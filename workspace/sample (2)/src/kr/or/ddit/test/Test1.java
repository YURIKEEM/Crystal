package kr.or.ddit.test;

public class Test1 {

	public static void main(String[] args) {
		
		//Sample Ŭ������ ���
		
		//Sample Ŭ������ ���- Sample Ŭ������ ��ü������ ����
		// ��ü���� - �ڷ���(Ŭ�����̸�) ������ = new Ŭ�����̸�();
		//�Ϲݺ��� - �ڷ��� ������  int a  String b
		Sample samp = new Sample(); 
		
		//���ϰ���� �����̸� = �޼ҵ��̸� (��)
		int res =samp.add(23, 56);
	    System.out.println("23+56=" +res);
	    
	    int res2 = samp.add(56,12);
	    System.out.println(res2);	    
	   
	    samp.calc(10, 55);
		
	}

}


class Sample{
	//��ɺο� - �޼ҵ� ����
	/*�޼ҵ� ����
	 * public ���ϰ���� �޼ҵ� �̸� (�Ű�����){return �����}
	 * public void �޼ҵ��̸� (�Ű�����){  }
	 */
	public int add(int a, int b){
		  int result = a+b;
		  return result;
	}
	
	public void calc(int a, int b){
		int result= a+b;
		System.out.println(a+"+"+b+"="+result);
	}
	
	
}