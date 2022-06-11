/*   ����1] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ 
 *             Ű����� �Է��Ͽ� ������ �� �հ� ����� ���Ͻÿ�
 *             
 *    ����2] �迭�� ũ�Ⱑ  10�� ������ �迭�� ����� 10���� �ڷḦ 
 *              Ű����� �Է��Ͽ� ¦���� ������ Ȧ���� ������ ����Ͻÿ�
 *              
 *     ����3] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ
 *              Ű����� �Է��Ͽ� ���� ū ���� ���� ���� ���� ����Ͻÿ�
 *              
 *      ����4] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ
 *                Ű����� �Է��Ͽ� ũ������� �����Ͽ� ����Ͻÿ�                         
 */

package chaper05;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerArr {

	public static void main(String[] args) {
//	IntEx01 ie01 = new IntEx01();
//	ie01.setInteger();
//	ie01.printResult();

//		IntEx02 ie02 = new IntEx02();
//		ie02.setInteger();
//		ie02.printResult();

//		IntEx03 ie03 = new IntEx03();
//		ie03.setInteger();
//		ie03.printResult();

		IntEx04 ie04 = new IntEx04();
		ie04.setInteger();
		ie04.bubble_sort();

	}

}

class IntEx01 { // Ŭ���� ��� �޼ҵ�� �� ����� �� �ִº���
	Scanner sc = new Scanner(System.in); // Ŭ���� �� �޼ҵ� �ۿ� ��ġ>>������� (�ڵ� �ʱ�ȭ�ȴ�)
	int[] num = new int[10]; // Ű����� �Է¹��� ���� ������ �迭��� ����

	public void setInteger() {
		for (int i = 0; i < 10; i++) { // �迭�� �ε����� ����ϱ� ���� 0�� �ʱ갪���� ����
			System.out.print("�����Է� : ");
			num[i] = sc.nextInt();

		}
	}

	public void printResult() {
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		// ����� �ѹ��� ���ϸ� �Ǵϱ� for�� �ۿ���
		// enhanced for(':�� �迭'�� ���� Ÿ�� ������:�迭)
		for (int su : num) { // �ڱⰡ �˾Ƽ� �迭 ù �������� ������ �������� ����ִ� ���� ��� �ߺ����� �˻�
			System.out.print(su + ", "); // �ϰ� ������ �־��ִ� �� for(Ÿ�� ����:�迭��or�÷���){
			// �迭��� �ϳ��� ���
		}
		System.out.println();
		// Array Ŭ������ �̿��� ���
		System.out.println(Arrays.toString(num));
		System.out.println("��= " + sum);
		System.out.println("���=" + (sum / num.length));
	}
}

//   ����2] �迭�� ũ�Ⱑ  10�� ������ �迭�� ����� 10���� �ڷḦ 
//              Ű����� �Է��Ͽ� ¦���� ������ Ȧ���� ������ ����Ͻÿ�
class IntEx02 {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];

	public void setInteger() {
		for (int i = 0; i < 10; i++) {
			System.out.print("�����Է� : ");
			num[i] = sc.nextInt();
		}
	}

	public void printResult() {
		int even = 0;
		int odd = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("¦�� ����: " + even);
		System.out.println("Ȧ�� ����: " + odd);

	}
}

//����3] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ
//             Ű����� �Է��Ͽ� ���� ū ���� ���� ���� ���� ����Ͻÿ�

class IntEx03 {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];

	public void setInteger() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�����Է� : ");
			num[i] = sc.nextInt();
		}
	}

	public void printResult() {
		int tempMax = num[0];
		int tempMin = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > tempMax) {
				tempMax = num[i];
			}
			if (num[i] < tempMin) {
				tempMin = num[i];
			}
		}
		System.out.println("���� ū ��: " + tempMax);
		System.out.println("���� ���� ��: " + tempMin);
	}
}

//����4] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ
//               Ű����� �Է��Ͽ� ũ������� �����Ͽ� ����Ͻÿ�    

class IntEx04 {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[10];

	public void setInteger() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�����Է�");
			num[i] = sc.nextInt();
		}
	}

	public void bubble_sort() {
		   for(int i=1; i<num.length; i++) {
			   for(int j=0; j<num.length-i; j++) {
				   if(num[j]>num[j+1]) {
					   swap(num,j,j+1);
				   }
			   }
		   }
		   System.out.println(Arrays.toString(num));
		   }
	   
	public void swap(int [] tar,int a,int b) {
		
		int temp=0;
		temp=tar[a];
	    tar[a]=tar[b];
	    tar[b]=temp;
	}
}


