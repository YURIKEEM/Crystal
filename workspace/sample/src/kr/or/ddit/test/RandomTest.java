package kr.or.ddit.test;

public class RandomTest {

	public static void main(String[] args) {
		// �����׽�ƮŬ���� ��ü ����
      RandomTest test = new RandomTest();
      test.randProc();
	
	}

	public void randProc() {
		
		// - �ֻ��� ������ - �����߻�1~6
	      int rand = (int)(Math.random()* 6+1);  //double a = Math.random(): 
	                                                              // 0.0 >= a < 1.0
	                                                              //1~10 --> Math.random()*10 + 1
	                                                              // int a = (int)(Math.rand()*10 + 1)
	                                                              // 50~100 : "(�ִ�-�ּ�+1)+�ּ�" 
	                                                              //int a =(int)(Math.random()*51+50)
	                                                              // 65~120 >> *56 +65
	      
	      String str = "";
//��
		  switch(rand) {
		  case 1:
			  str = "���� 1��";
			  break;
		  case 2:
			  str = "���� 2��";
			  break;
		  case 3:
			  str = "���� 3��";
			  break;
		  case 4:
			  str = "���� 4��";
			  break;
		  case 5:
			  str = "���� 5��";
			  break;
		  case 6:
			  str = "���� 6��";
			  break;
		  
		  }
	      
		//���
		
		  System.out.println("�ֻ��� �� : " +rand +"\n");
		  System.out.println("ȹ�� ��ǰ : " + str);
		  
		
	}
}
