//����ȯ
/* 1. �ڵ�����ȯ (auto casting) double>float>long>int>short>byte
 *   - ���α׷� ���� �� �ڵ����� ���� ��ȯ (ū ������ �������� Ÿ���� ��ȯ)
 *   - ex) int + short => int + int (����� int)
 *         long + int => long + long (����� long)
 *         float + double => double + double (����� double)
 *         float + long + char => float + float + float (����� float)
 * 2. ����ȯ ������(Ÿ��) �̿�
 *  �������
 *   (Ÿ�Ը�)����
 *    . �Ͻ������� cast�����ڰ� ���� ��ġ���� ����ȯ  
 *     ex) 20 + (short) 70 => int + int ����� int
 *         20L + (short) 70 => long + long ����� long
 * 3. ���ڿ�
 *  . ����Ÿ�� (String classŸ��) 
 *  . " " �ȿ� ���
 *  . ���ڿ� + anytype, anytype + ���ڿ� => ���ڿ� + ���ڿ� =>����
 *     (���ڿ����ڿ�)
 *     ex) 1990+"10" =>"1990" + "10" => "199010"
 *     ""ȭ��Ʈ �����̽� = NULL ���̸� ���� �ʴ� ������
 *         
*/
package chapter01;

public class Lec050304 {
   
    
	public static void main(String[] args) {
		LecTemp It=new LecTemp();
		It. inititest();
	}

}
class LecTemp{
	int i;
	float f;
	char ch;
	boolean b;
	public void inititest() {
		System.out.println("������ �ʱⰪ="+i);
		System.out.println("������ �ʱⰪ="+f);
		System.out.println("������ �ʱⰪ="+ch);
		System.out.println("������ �ʱⰪ="+b);
		
	}
}
