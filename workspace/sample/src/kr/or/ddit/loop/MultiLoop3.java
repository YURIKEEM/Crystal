package kr.or.ddit.loop;

public class MultiLoop3 {

	public static void main(String[] args) {
		
    Multi3 m3 =new Multi3();
    m3.multi1();
    
	}

}

class Multi3{
	
	public void multi1() {
		
		int sum = 0;     //���� �� ���� �׸� ����
		String str ="";   
		int rand = 0;
		
		for(int i=1; i<=3; i++) {
			
			   
			   int k =1;
			   while(k<=5) {
				  rand = (int)(Math.random()*100+1);
				  sum += rand;
				  str += rand + " ";
				
			   k++;			
			}
              System.out.println("�������� ��: " +sum);          //���
			  System.out.println("�������� ���� ��: "+str);
			  
			   sum =0;   //���� ���� �� ���� ä���� �� ����ֱ� ����
				str = "";
			   
		}
	}
}