package chapter06;

public class StudentExample {
	//public ���������� 
	//1.public : ��𿡼��� ���� ����
	//2.private: class������ ���ٰ���
	//3.protected: package������ or ��ӹ������ ���ٰ���
	//4.default : package������ ���� ����
	// void : ����Ÿ��=> return�� ����
	//args :�Ű�����(�Ķ���͸� �޾��ִ� ����. ��������
	
    public static void main(String[] args) {
     //���赵 Ŭ����
     //Ŭ������ ���� ��ü�� �ν��Ͻ�
    //���赵 ��ü��= ������ ���赵();
	  Student s1= new Student();
	  System.out.println("s1 ������ Student ��ü�� �����մϴ�");
	  s1.setStId("a001");
	  s1.setStName("������");
	  s1.setTelNum("010-1234-5678");
	  
	  System.out.println("s1 : " +s1.toString());
	  
	  Student s2 = new Student();
	  System.out.println("s2 ������ �� �ٸ�"
			       +"Student ��ü�� �����մϴ�.");
	  s2.setStId("b001");
	  s2.setStName("�ڸ��");
	  s2.setTelNum("010-1111-2222");
	  System.out.println("s2 : "+s2.toString());
}
}
