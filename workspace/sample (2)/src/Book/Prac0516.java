package Book;

import java.util.Arrays;
import java.util.Scanner;

public class Prac0516 {

	public static void main(String[] args) {
//	Exam01 e1 = new Exam01();
//	e1.getNum();
//	e1.printResult();
	
//	Exam02 e2= new Exam02();
//	e2.getNumber();
//	e2.printResult();
		
//	Exam03 e3 = new Exam03();
//	e3.getNumber();
//	e3.printResult();
	
		
	Exam04 e4=new Exam04();
	e4.getNumber();
	e4.printResult();
	
	
	
  
	}
}	
//����1] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ 
//*             Ű����� �Է��Ͽ� ������ �� �հ� ����� ���Ͻÿ�
class Exam01{
	Scanner sc = new Scanner(System.in);
	int[]array = new int [10];
	public void getNum() {
		for(int i=0; i<array.length;i++) {
			System.out.println("�����Է�");
			array[i]= sc.nextInt();
		}
		
	}
	public void printResult() {
		int sum=0;
		for(int i=0; i<array.length;i++) {
			
			sum+=array[i];
		}
		System.out.println(Arrays.toString(array));
		System.out.println("�հ�:" +sum);
		System.out.println("���:" +sum/10);
	}
}

//*    ����2] �迭�� ũ�Ⱑ  10�� ������ �迭�� ����� 10���� �ڷḦ 
//*              Ű����� �Է��Ͽ� ¦���� ������ Ȧ���� ������ ����Ͻÿ�
class Exam02{
	Scanner sc = new Scanner(System.in);
	int[] array=new int [10];
	public void getNumber() {
		for(int i=0; i<array.length;i++) {
		System.out.print("�����Է� : ");
		array[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(array));
    }

    public void printResult() {
    	int even=0;
    	int odd=0;
    	for(int i=0; i<array.length; i++) {
    		if(array[i]%2==0) {
    			even++;
    		}else {
    			odd++;
    		}
    	}
    	System.out.println("¦�� : "+even);
    	System.out.println("Ȧ�� : "+ odd);
    }
}	

//*     ����3] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ
//*              Ű����� �Է��Ͽ� ���� ū ���� ���� ���� ���� ����Ͻÿ�
class Exam03{
	Scanner sc = new Scanner(System.in);
	int[]array = new int[10];
	public void getNumber() {
		for(int i=0; i<array.length;i++) {
		System.out.println("�����Է�: ");
		array[i]=sc.nextInt();
		}	
		System.out.println(Arrays.toString(array));
	}
	public void printResult() {
		int max=array[0];
		int min=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max =array[i];
			}if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("�ִ밪: "+max);
	    System.out.println("�ּҰ�: "+min);
	    
	}
}
//*      ����4] �迭�� ũ�Ⱑ 10�� ������ �迭�� ����� 10���� �ڷḦ
//*                Ű����� �Է��Ͽ� ũ������� �����Ͽ� ����Ͻÿ�  
class Exam04{
	Scanner sc= new Scanner(System.in);
	int[]array= new int [10];
	public void getNumber() {
		for(int i=0;i<array.length; i++) {
			System.out.println("�����Է�: ");
			array[i]=sc.nextInt();
		}
	
	}
	
	public void printResult() {
		for(int i=1; i<array.length;i++) {
			for(int j=0; j<array.length-i;j++) {
				if(array[j]>array[j+1]) {
					 int temp=0;
					 temp=array[j];
					 array[j]=array[j+1];
					 array[j+1
					       ]=temp;
				}
			}
		        
			
		}
		System.out.println(Arrays.toString(array));
		
	}
}
