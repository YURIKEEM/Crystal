	    // [Q1.] ù���� 100�� �� ���������ʹ� ������ 2�辿
		//������ �� ��� ó������ 100������ �Ѵ� ���� 
		//����ݾ��� ���϶�
		
		//[Q2.] 1~50 ������ �Ǻ���ġ���� ���� ��� ����Ͻÿ�
		//�Ǻ���ġ����: ù��°�� �ι�° ���� 1�� �־�����
		//�� ���� �� ���ʹ� �� �� ���� ���� ������� �Ǵ� ����

package chapter04;

public class LoopTest {

	public static void main(String[] args) {
		
//        SaveMoney sm = new SaveMoney();
//        sm.getMoney();
        
        Fibonacci f1=new Fibonacci();
        f1.getNumber();
        
        
        
			
		}

	}


class SaveMoney{
	public void getMoney() {
		int days =1;  //����
		int amount=100; //�ش� ���ڿ� ������ �׼�
		int sum=0;  //����ݾ��հ�
		
		
		/*int days  = 0; -> �Ʒ� ����� days�� ù ȸ������ �ϳ��ø��� ������ 0���� ����
		 * while(sum<1000000) {
		 * 
		 * sum = sum + amount; 
		 * days++; 
		 * amount = amount*2;
		 * 
		 * }
		 */
		
		while(true) {
			sum = sum + amount; 
			if(sum>=1000000) {
				break;
			}else {
				days++;
				amount = amount*2;
			}
		}
		System.out.println("���� : " +days);
		System.out.println("�ݾ� : " +sum);
			
		
	}
}

class Fibonacci{
	public void getNumber() {
		int preNum=1;  //�� ��
		int ppreNum=1;  //�� �� ��
		int currNum=0; //���� ��
		
		String res = "1, 1, ";
		while(true) {
			currNum=preNum + ppreNum;
			if(currNum>=50) {
				break;
			}else {
				ppreNum=preNum;
				preNum=currNum;
				
				res=res + currNum+", ";
			}
			 
		}
		System.out.println("�Ǻ���ġ ���� : "+res);
		
		
	}
}

//*************[����]  1-2+3-4.....-10=?  (¦���� -�� �ٰ��ִ�)
// **************���� ���� ��µǰ� ����� ��� �ǵ��� ���α׷��Ͻÿ�

 class Homework{
	 public void String () {
		 
	 }
 }
