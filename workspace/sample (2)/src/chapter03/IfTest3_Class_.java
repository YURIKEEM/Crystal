package chapter03;

import java.util.Scanner;

public class IfTest3_Class_ {

	public static void main(String[] args) {
	
		//�Է�
		Scanner scn = new Scanner(System.in);
		System.out.println("�� �Է� 1~100 ���̷�");
		int x = scn.nextInt();
		
		//Score�޼ҵ� ȣ�� - ������� return �޴´�
		Score4 sco = new Score4 ();
	    String res = sco.comp(x);
		
		//���
		System.out.println("�Է¹��� ��: "+x);
		System.out.println("���: "+res);

		
		
	}

}
  
  class Score4{
  public String comp (int x){
    	String res= "";
    
		//��
		if (x>=90){
			res = "��";
		}else if(x>=80){
			res = "��";
		}else if(x>=70){
			res = "��";
		}else if(x>=60){
			res = "��";
		}else{
			res = "��";
		}
		return res;
    }
 }
    
