package sample;
import java.util.Scanner;

public class question99_2 {

	public static void main(String[] args) {
		//java.util ��Ű���� Scanner Ŭ���� (��ü���� �� �ؿ�Ǵ� ���赵 -�������+�޼ҵ�)
		//scanner : Ŭ����(���赵)�� ����ȭ �� ��ü
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù��° ��:");
		//.nextLine() => ()�� ������ ��ü�� �޼ҵ�(����) =>Enter Ű �������� �Էµ� ���ڿ��� ����
		String strNum1 = scanner.nextLine();  //scanner ��ü�� nextLine()�޼ҵ� 
		
		System.out.println("�ι�° ��:");
		//Enter Ű �������� �Էµ� ���ڿ��� �о strNum2��� ������ ������ �Ҵ�(����)�� ��
		String strNum2 = scanner.nextLine();
		
		System.out.println(strNum1 + strNum2);
		//���������� : "32"
		//Integer.parseInt(����������) => ����
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("������� :" +result);
		
		//strNum1 ������ ���ԵǾ��ִ� ���ڿ��� ���������� ����ȭ =>num1  ������ ������ ����
	}

}
