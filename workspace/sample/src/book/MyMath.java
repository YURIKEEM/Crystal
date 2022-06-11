package book;

import java.util.Arrays;
import java.util.Scanner;


public class MyMath {
 final double PI=3.1415927;
 final double E=2.718281;
 
 Scanner sc = new Scanner(System.in);
 public void maximum() {
	 double[]su=new double[10];
	 double max=0;
	 for(int i=0; i<10; i++) {
		 System.out.println("정수 또는 실수 입력 : ");
		 su[i]=sc.nextInt();
		 if(su[i]>su[0]) {
			max=su[i];
		 }
	 }
	 System.out.println("최대값 : "+max);
 }
	 public void minimum() {
		 double[]su=new double[10];
		 double min=0;
		 for(int i=0; i<10;i++) {
			 System.out.println("정수 또는 실수 입력: ");
			 su[i]=sc.nextInt();
			 if(su[i]<su[0]) {
				 min=su[i];
			 }
		 }
		 System.out.println("최소값 : "+min);
	 }
	 
	 public void abs() {
		double[]su=new double[10];
		 for(int i=0; i<su.length; i++) {
			 System.out.println("정수 또는 실수 입력: ");
			 su[i]=sc.nextInt();
			 if (su[i]<0) {
				 su[i]=su[i]*(-1);
			 }
			 
		 }
		 System.out.println(Arrays.toString(su));
	 }
   
 }
 

