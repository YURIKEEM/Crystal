package chapter06;

public class CarExample {
  public static void main(String[] args) {
	//���赵�� Ŭ����
	  //Ŭ������ ������� ��ü�� �ν��Ͻ�
	  System.out.println("����");
	  //myCar : ��ü, Ŭ��������, �ν��Ͻ�
	  //String company, String model, String color,int maxSpeed, int speed
	  
	  Car myCar = new Car("�����ڵ���","�׷���","����",350,0);
	  System.out.println("����ȸ�� : " +myCar.company);
      System.out.println("�𵨸� : " +myCar.modle);
      System.out.println("���� : " +myCar.color);
      System.out.println("�ְ�ӵ� : " +myCar.speed);
      
      //�ʵ尪 ����
      myCar.speed=60;
      System.out.println(myCar.toString());
}
}
     
      