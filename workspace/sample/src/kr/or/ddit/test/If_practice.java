package kr.or.ddit.test;

import java.util.Scanner;

public class If_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� >");
		int z =sc.nextInt();
		
		Result rst =new Result();
		String res=rst.comp2(z);
		
		System.out.print("�ش� �л��� ������ " +z+"�� �̸�, ");
		System.out.println(res);
		
		
	}

}

class Result{
	public String comp2 (int z){
     String res="";
     
     if(z>=70){
    	 res = "�հ��Դϴ�.";
     }else{
    	 res = "���հ��Դϴ�.";
     }
     return res;
	}   
}