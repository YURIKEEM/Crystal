package sample;

public class question98_1 {

	public static void main(String[] args) {
		
		// ������ ���� name�� �����͸� �Ҵ� (����)
		String name = "���ڹ�";
		
		// ������ ���� age�� �����͸� �Ҵ�
		int age = 25;
		
		// ������ ���� tel1, tel2, tel3�� ����� ���ÿ� ���� �Ҵ� => �ʱ�ȭ
	   String tel1 = "010", tel2 = "123", tel3 = "4567";
		
	   // �̸� : ���ڹ�
		//   +   : ���տ�����
		System.out.println("�̸�:" +name);
		
		// ���� : 25
		System.out.print("����:" + age + "\n");
		
		// ��ȭ: 010-234-4567
		System.out.printf("��ȭ:%3s-%3s-%4s", tel1,tel2,tel3 );

	}

}
