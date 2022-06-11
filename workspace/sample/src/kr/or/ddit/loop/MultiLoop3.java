package kr.or.ddit.loop;

public class MultiLoop3 {

	public static void main(String[] args) {
		
    Multi3 m3 =new Multi3();
    m3.multi1();
    
	}

}

class Multi3{
	
	public void multi1() {
		
		int sum = 0;     //랜덤 값 담을 그릇 생성
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
              System.out.println("랜덤수의 합: " +sum);          //출력
			  System.out.println("랜덤으로 나온 수: "+str);
			  
			   sum =0;   //작은 루프 속 돌며 채워진 값 비워주기 위해
				str = "";
			   
		}
	}
}