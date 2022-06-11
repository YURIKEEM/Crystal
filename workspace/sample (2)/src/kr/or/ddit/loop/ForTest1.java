package kr.or.ddit.loop;

public class ForTest1 {

	public static void main(String[] args) {
		 
		String str =""; //나온 정수를 문자로 저장하는 법
		
		//1~10사이 수 랜덤으로 5개를 발생해서 출력
		for (int i=1; i<=5; i++) {
			int rand = (int)(Math.random() * 10+1);
			str += rand + " ";
	     //'str = str+rand'
		}
	     System.out.println(str);
	}

}
