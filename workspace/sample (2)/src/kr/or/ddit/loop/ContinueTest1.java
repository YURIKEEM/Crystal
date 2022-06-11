package kr.or.ddit.loop;

public class ContinueTest1 {

	public static void main(String[] args) {
		
		//Q. 1~100까지의 짝수만 출력하시오
		
		String str ="";
		for(int i=1; i<=100; i++) {
		//짝수 인지 비교
			if(i%2==0)  str += i +" ";
		}
         System.out.println("짝수 : " +str);
         System.out.println();
         System.out.println("-----------------------");
         
         str ="";
         
         for(int i=1; i<=100; i++){
        	 //홀수이냐?
        	  if(i%2!=0) continue; //짝수가 아니면 for문으로 올라가고
        	   
              str += i + " ";      //맞으면 진행
        		  
         }
         System.out.println("짝수 : " +str);
	}

}
