//(2022-0504-01) ������ Operator
/*1. �������� ����
 *  - ���, ����, ��, ����, ����, ����
 *  - ����, ����, ����
 * 
 * 
 */
package chapter03;

public class Operator01 {

	public static void main(String[] args) {
		//  ���������: +, -, /, *, %
		// �������� �� (value)�� ��ȯ
		// % ������ ������
       
		Oper op1=new Oper(); //Ŭ���� ��ü ���� 'new' ��ü/�迭 �����Ҷ� ���δ� ���޸𸮿� ������ ����¾�. new ������ �����ڶ� �빮�ڷ� ���.
        System.out.println("����="+op1. add(10 , 50));
        System.out.println("����="+op1. add(10.5 , 50));
        System.out.println("����="+op1. add(10.5f , 50L));
        System.out.println("����="+op1. add(10 , 'b'));
        System.out.println("������="+op1.remainder(2022, 7));
        
	}

}

class Oper{
	
	public int add (int a, int b) {
		int res=a+b; //���������� ��ȣ ����� ȸ���Ǿ� �����
		return res;
	}
	
		
		public double add (double a, int b) { 
			double res=a+b; //�׷��� ���� ���� ���ĺ������� �ٸ� ������ 
			return res;
    }		
		public float add (float a, long b) { 
		 return a+b;
       }
		public short add (int a, char b) { 
			short res= (short) (a+b) ;
			return res;
  }
		public int remainder (int a, int b) {
			 int res=a%b;
			 return res;
      }
   }