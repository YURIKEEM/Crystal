package kr.or.ddit.test;

import java.util.Scanner;

public class If_practice3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
     System.out.print("������ �Է����ּ��� > ");
     int num = sc.nextInt();
     
     Judge sc1 =new Judge();
     sc1.pick(num); 
	}

}

class Judge{
  public void pick(int a){
  String str="";
  
  if(a<0||a>100){
	  System.err.println("���� �Է¿� ������ ������!");
  }else if(a>=60){
	  System.out.println("�հ� �Դϴ�.");
  }else if(a<=60){
	  System.out.println("���հ� �Դϴ�.");
  }
	 
  }
  
}