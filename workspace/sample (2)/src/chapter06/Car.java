package chapter06;

  //�ڵ��� Ŭ����(���赵)
public class Car {
  //�ʵ�=�������=�Ӽ�
	//���������� ���� =>default :���� ��Ű������ ���� �����ϴ�
    //������(����)
	String company ;
	//��(����)
	String modle ;
	// ����
	String color ;
	//�ִ뽺�ǵ�(����)
	int maxSpeed ;
	//���罺�ǵ�
	int speed;
	
	//�⺻������
	public Car() {}

		
	//������ : ��ü�� ������ �� �ڵ����� ����(�ʱⰪ�� ���� �� ���)	
	//                  "�����ڵ���","�׷���","����",350,0
	public Car(String company, String modle, String color, int maxSpeed, int speed) {
       super();
		this.company = company;
		this.modle = modle;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}


	@Override
	public String toString() {
		return "Car [company=" + company + ", modle=" + modle + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}

}
