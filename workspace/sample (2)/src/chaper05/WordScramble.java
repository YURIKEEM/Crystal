/*  5���� ���� �ܾ� �� ������ �ܾ �����Ͽ� �ܾ �����ϴ�ö�ڸ� ���� �� ����ڿ��� �����ϸ� 
 *  ����ڰ� �� �ܾ ���ߴ� ����
 *  �õ� Ƚ���� ����Ͻÿ�.
 *  -����
 *   .��ǻ�͸� �߻���ų �� �ִ� ������ ��
 *   . Math, Random �� ���� Ŭ������ ����
 *   1)Math class ���
 *   -random �޼���� ����
 *   -0.0 ���� ũ�ų� ���� 1.0���� ���� double�� ���� ��ȯ
 *   -������ ������ ������ ���� �߻� ����
 *     (int)((Math.random()*(max-min))+min)
 *     ex) 10-100 ������ ������ ����
 *     (int)((Math.random()* 90)+10)
 *     
 *     2)Random class ���
 *     -Random Ŭ������ nextInt() ���� �̿��Ͽ� ���� �߻�
 *     -seed�� ����Ͽ� ���� �ٸ� ���� �߻���ų �� ����
 *       public Random(long seed){ } ������ ȣ��
 *     - Ư���� �� ������ ������ 
 *        nextInt(���Ѱ�) ������ �޼��� ȣ��       
*   [����]
 * 5���� ���� �ܾ� �� ������ �ܾ �����Ͽ� �ܾ �����ϴ�ö�ڸ� ���� �� ����ڿ��� �����ϸ� 
 *  ����ڰ� �� �ܾ ���ߴ� ����
 *  �õ� Ƚ���� ����Ͻÿ�.
 */

/* 1)�ܾ� ����(5��) - �迭 
 *  2)�ܾ� ����-����
 *  3)���õ� �ܾ��� ö�ڸ� �����ش�
 *  4)����ڷκ��� ������ �Է��Ͽ� ���� ���� 
 *  5)������
 */
package chaper05;
import java.util.Scanner;

public class WordScramble {
	public static void main(String[] args) {
		String[] word= {"apple","banana","persimmon","strawberry","melon"};
		Scramble s1= new Scramble();
		String w=s1.getWord(word);
        s1.getAnswer(s1.suffle(w),w);
	}

}
class Scramble{
	public String getWord(String[] tword) {
		int rnd=(int)((Math.random()*tword.length));
		String chWord=tword[rnd];
		return chWord;
	}
	
	public String suffle(String str){
        char[] ch=str.toCharArray(); //���ڿ��� ���ڹ迭�� �ٲ� 
        for(int i=0; i<=100000; i++) {
        	int r1=(int)(Math.random()*ch.length);
        	char temp=ch[0];
        	ch[0]=ch[r1];
        	ch[r1]=temp;
        }
        return (new String(ch));   //���ڹ迭�� ���ڿ��� ����
	}
	public void getAnswer(String suggest, String str) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Question :" +suggest) ;
		  int cnt=0;
		while(true) {
			System.out.print("Answer : ");
			String ans=sc.next();
			cnt++;
			if(ans.equals(str)) {
				System.out.println("�����Դϴ�...");
				System.out.println("�õ�Ƚ�� : "+cnt);
				System.exit(0);
				
			}else {
				System.out.println("������ �ƴմϴ�. �ٽ� �õ� �ϼ���...");
			}
		}
	}
}
