//2022-050301)������Ÿ��
/*
 *  �⺻Ÿ�԰� ����Ÿ��
 * 1.�⺻Ÿ��- 8���� (��ü �ƴ� ��ü�� �Ǹ� �ձ��� �빮�� ��)
 *  .������- byte, short, int, long
 *  .�Ǽ���- float, double
 *  .������- char
 *  .�ο���- boolean
 * 2.����Ÿ�� (���� �����Ͱ� �ƴ� ����� �ּڰ�)
 *  .�迭�� Ŭ���� ��ü             �ʱ갪=null
 *  
 * 3.���� ����
 *  �������
 *  Ÿ�Ը� ������ [=�ʱⰪ];
 *  1) ����� ���� �ܾ�(identifier)
 *   - �����ڿ� ���� �� Ư�����ڷ� ����
 *   - ù ���ڴ� �ݵ�� ������
 *   - ������� �޼������ �ҹ��ڷ� ���� (�ι�° �ܾ� ù ���ڴ� �빮��) *������ �޼���� ù���� �� �빮��(Ŭ������� ���ƾ��ؼ�)
 *     ex) firstName, lastName getPara(), setPara(int age)
 *   - Ŭ�����̸��� ù ���ڸ� �빮�ڷ� ���
 *     ex) StudentInfo, FirstClass
 *   - ����� �빮�ڷ� ���
 *     ex) double final PI=3.1415926;
 *   - ����� (��ɹ� ��)�� ����� �� ����  
 *   
 */
package sample;

public class Lec050301 {

	public static void main(String[] args) {
		byte b;
		b=(byte) 20;
		
		byte b1=(byte) 127;
		byte b2=(byte) 128;
		
		System.out.println("b="+b);
		System.out.println("b1="+b1);	
		System.out.println("b2="+b2);
		
		
		short s1;
		s1=(short)32768;
		short s2=(short)127;
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		int res=0;
		int i=100;
		res=i+s2+b1; 
		/*����Ŀ� ���Ǿ��� ������Ÿ�� �� int���� ����Ÿ�� (short byte char)�� ������ int�� ���Ѵ�.*/
		
		byte r1=0;
		r1=(byte)(b1+100); 
		/*��ȣ ���� int���� ���� Ÿ���̶� int�� ��ȯ�ȴ�. 227�� ����ƮŸ������ ������ ��*/
		
		
		
	}

}


 
