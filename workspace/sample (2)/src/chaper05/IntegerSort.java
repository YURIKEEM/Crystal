//����(sort)
//-ũ������� ��迭
//-��������(ascending:������->ū��, �⺻����)
//-��������(descending:ū��->������)
//-��������(bubble sort), ��������(selection sort)

package chaper05;
import java.util.Arrays;
public class IntegerSort {

	public static void main(String[] args) {
		BubbleSort b1=new BubbleSort();
		b1.bubble_sort();
		
	}

}

class BubbleSort{
	int[] num= {56,23,81,15,70,17,29};
	
	public void bubble_sort() {
		System.out.println("[����]");
		System.out.println(Arrays.toString(num));
		for(int i=1; i<num.length;i++) {         //���� ȸ�� for��
			for(int j=0;j<num.length-i; j++) {   //�ڸ� �ٲٴ� for��
				if(num[j]>num[j+1]) {         //j �ڸ��� ���ڸ����� ũ�� �ڸ��ٲٱ�
					swap(num,j,j+1);        //voidŸ���̾�߸� ����
					
				}
			}
		}
		System.out.println("[���]");
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+",");
		}
	}
	
	public void swap(int[] tar, int a, int b) {  
		int temp=0;
		temp=tar[a];
		tar[a] = tar[b];
		tar[b]= temp;
		
		
	}
}