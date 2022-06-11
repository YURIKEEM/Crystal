package book;

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
//문제1] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를 
//*             키보드로 입력하여 저장한 후 합과 평균을 구하시오
class Exam01{
	Scanner sc = new Scanner(System.in);
	int[]array = new int [10];
	public void getNum() {
		for(int i=0; i<array.length;i++) {
			System.out.println("정수입력");
			array[i]= sc.nextInt();
		}
		
	}
	public void printResult() {
		int sum=0;
		for(int i=0; i<array.length;i++) {
			
			sum+=array[i];
		}
		System.out.println(Arrays.toString(array));
		System.out.println("합계:" +sum);
		System.out.println("평균:" +sum/10);
	}
}

//*    문제2] 배열의 크기가  10인 정수형 배열을 만들고 10개의 자료를 
//*              키보드로 입력하여 짝수의 갯수와 홀수의 갯수를 출력하시오
class Exam02{
	Scanner sc = new Scanner(System.in);
	int[] array=new int [10];
	public void getNumber() {
		for(int i=0; i<array.length;i++) {
		System.out.print("정수입력 : ");
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
    	System.out.println("짝수 : "+even);
    	System.out.println("홀수 : "+ odd);
    }
}	

//*     문제3] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를
//*              키보드로 입력하여 가장 큰 수와 가장 작은 수를 출력하시오
class Exam03{
	Scanner sc = new Scanner(System.in);
	int[]array = new int[10];
	public void getNumber() {
		for(int i=0; i<array.length;i++) {
		System.out.println("정수입력: ");
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
		System.out.println("최대값: "+max);
	    System.out.println("최소값: "+min);
	    
	}
}
//*      문제4] 배열의 크기가 10인 정수형 배열을 만들고 10개의 자료를
//*                키보드로 입력하여 크기순으로 정렬하여 출력하시오  
class Exam04{
	Scanner sc= new Scanner(System.in);
	int[]array= new int [10];
	public void getNumber() {
		for(int i=0;i<array.length; i++) {
			System.out.println("정수입력: ");
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
