package kr.or.ddit.loop;

public class WhileTest6 {

	public static void main(String[] args) {
		//1~100���� ���� 5�� �߻����� ���� ���϶�
		//�߻��� �������� ���
		
		int sum = 0;
		String str = "";
		
		int i = 1;
		while(i<=5) {
			int rand = (int)(Math.random()*100+1);
			sum += rand;       //������ sum������ �������� ����
			str += rand + " ";  //������ str������ ����
			
			i++;
		}
		System.out.println("�������� �� : " +sum);
		System.out.println("�������� ���� �� : "+str);
	}
          
}
