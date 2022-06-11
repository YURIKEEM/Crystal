package kr.or.ddit.loop;

public class WhileTest6 {

	public static void main(String[] args) {
		//1~100까지 랜덤 5개 발생시켜 합을 구하라
		//발생된 랜덤수를 출력
		
		int sum = 0;
		String str = "";
		
		int i = 1;
		while(i<=5) {
			int rand = (int)(Math.random()*100+1);
			sum += rand;       //랜덤을 sum변수에 덧셈으로 누적
			str += rand + " ";  //랜덤을 str변수에 누적
			
			i++;
		}
		System.out.println("랜덤수의 합 : " +sum);
		System.out.println("랜덤으로 나온 수 : "+str);
	}
          
}
