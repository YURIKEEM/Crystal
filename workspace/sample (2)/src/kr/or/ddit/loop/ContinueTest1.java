package kr.or.ddit.loop;

public class ContinueTest1 {

	public static void main(String[] args) {
		
		//Q. 1~100������ ¦���� ����Ͻÿ�
		
		String str ="";
		for(int i=1; i<=100; i++) {
		//¦�� ���� ��
			if(i%2==0)  str += i +" ";
		}
         System.out.println("¦�� : " +str);
         System.out.println();
         System.out.println("-----------------------");
         
         str ="";
         
         for(int i=1; i<=100; i++){
        	 //Ȧ���̳�?
        	  if(i%2!=0) continue; //¦���� �ƴϸ� for������ �ö󰡰�
        	   
              str += i + " ";      //������ ����
        		  
         }
         System.out.println("¦�� : " +str);
	}

}
