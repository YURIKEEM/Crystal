package Book;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 ����1] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ 
//	            Ű����� �Է��Ͽ� ������ �� �հ� ����� ���Ͻÿ�
		
//		ArrayPractice ap = new ArrayPractice();
//		ap.setNumber();
		
		ArrPrac2 ap2 = new ArrPrac2();
		ap2.setNumber();
		ap2.printResult();
		
		
		
	}

}

//class ArrayPractice{
//	Scanner sc= new Scanner(System.in);
//	int[]num=new int[10];
//	int sum=0;
//	public void setNumber() {
//		for(int i=0; i<num.length; i++) {
//			System.out.println("���� �Է�");
//			num[i]=sc.nextInt();
//			
//			sum+=num[i];
//		}
//		System.out.println(Arrays.toString(num));
//		System.out.println("��: " +sum );
//		System.out.println("���" +sum/num.length);


//����2] �迭�� ũ�Ⱑ  10�� ������ �迭�� ����� 10���� �ڷḦ 
//*              Ű����� �Է��Ͽ� ¦���� ������ Ȧ���� ������ ����Ͻÿ�

class ArrPrac2{
	Scanner sc= new Scanner(System.in);
	int []num =new int[10];
	public void setNumber() {
		for(int i=0; i<num.length; i++) {
			System.out.print("���� �Է�:");
			num[i]=sc.nextInt();
		}
	}
	
	public void printResult() {
		int even=0;
		int odd=0;
		 for(int i=0;i<num.length;i++) {
				if(num[i]%2==0) {
					even ++;
				}else {
					odd++;
				}
		 }
		    System.out.println("¦�� ����: " +even);
	         System.out.println("Ȧ�� ����: "+odd);
		}
     
	
}
