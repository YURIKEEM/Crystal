/*  5개의 영어 단어 중 임의의 단어를 선택하여 단어를 구성하는철자를 섞은 후 사용자에게 제시하면 
 *  사용자가 그 단어를 맞추는 게임
 *  시도 횟수를 출력하시오.
 *  -난수
 *   .컴퓨터를 발생시킬 수 있는 임의의 수
 *   . Math, Random 두 개의 클래스가 제공
 *   1)Math class 사용
 *   -random 메서드로 제공
 *   -0.0 보다 크거나 같고 1.0보다 작은 double형 나수 반환
 *   -범위를 지정한 정수형 난수 발생 공식
 *     (int)((Math.random()*(max-min))+min)
 *     ex) 10-100 사이의 정수형 난수
 *     (int)((Math.random()* 90)+10)
 *     
 *     2)Random class 사용
 *     -Random 클래스의 nextInt() 등을 이용하여 난수 발생
 *     -seed를 사용하여 서로 다른 난수 발생시킬 수 있음
 *       public Random(long seed){ } 생성자 호출
 *     - 특정한 값 이하의 난수는 
 *        nextInt(상한값) 형태의 메서드 호출       
*   [문제]
 * 5개의 영어 단어 중 임의의 단어를 선택하여 단어를 구성하는철자를 섞은 후 사용자에게 제시하면 
 *  사용자가 그 단어를 맞추는 게임
 *  시도 횟수를 출력하시오.
 */

/* 1)단어 정의(5개) - 배열 
 *  2)단어 선택-난수
 *  3)선택된 단어의 철자를 섞어준다
 *  4)사용자로부터 정답을 입력하여 정답 판정 
 *  5)결과출력
 */
package chaper05;
import java.util.Scanner;

public class WordScramble {
	public static void main(String[] args) {
		String[] word= {"apple","banana","persimmon","strawberry","melon"};
		Scramble s1= new Scramble();
		String w=s1.getWord(word);
        s1.getAnswer(s1.suffle(w),w);
	}

}
class Scramble {
	public String getWord(String[] tword) {
		int rnd=(int)((Math.random()*tword.length));
		String chWord=tword[rnd];
		return chWord;
	}
	
	public String suffle(String str){
        char[] ch=str.toCharArray(); //문자열이 문자배열로 바뀜 
        for(int i=0; i<=100000; i++) {
        	int r1=(int)(Math.random()*ch.length);
        	char temp=ch[0];
        	ch[0]=ch[r1];
        	ch[r1]=temp;
        }
        return (new String(ch));   //문자배열을 문자열로 만듬
	}
	public void getAnswer(String suggest, String str) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Question :" +suggest) ;
		  int cnt=0;
		while(true) {
			System.out.print("Answer : ");
			String ans=sc.next();
			cnt++;
			if(ans.equals(str)) {
				System.out.println("정답입니다...");
				System.out.println("시도횟수 : "+cnt);
				System.exit(0);
				
			}else {
				System.out.println("정답이 아닙니다. 다시 시도 하세요...");
			}
		}
	}
}
