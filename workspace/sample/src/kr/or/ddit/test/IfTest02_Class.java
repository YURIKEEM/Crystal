package kr.or.ddit.test;

import java.util.Scanner;

public class IfTest02_Class {

	
	
	
	
	public static void main(String[] args) {
		// �Է�

		 Scanner scn= new Scanner(System.in); 
		 
		 System.out.println("���� �Է�");
		 int a =scn.nextInt();
		 
		 //Score�� comp�޼ҵ� ȣ�� - ����� �ޱ�
		 Score scr = new Score();
		 String str = scr.comp(a);
		//���
		 System.out.println("�Է�����:" +a);
		 System.out.println("���:" +str);
	 }
    
	}

class Score{

public String comp(int a){
	String result = "";
	//a�� ��
	if (a>=80){
		result= "���";
	}else{
		result= "���";
	}
	return result;
  }
}