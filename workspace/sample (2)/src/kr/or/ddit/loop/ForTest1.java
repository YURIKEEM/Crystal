package kr.or.ddit.loop;

public class ForTest1 {

	public static void main(String[] args) {
		 
		String str =""; //���� ������ ���ڷ� �����ϴ� ��
		
		//1~10���� �� �������� 5���� �߻��ؼ� ���
		for (int i=1; i<=5; i++) {
			int rand = (int)(Math.random() * 10+1);
			str += rand + " ";
	     //'str = str+rand'
		}
	     System.out.println(str);
	}

}
