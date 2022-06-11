/*
 * String words = “Jack Snider wants to chicken everyday.”;

다음 문자열에서 공백을 모두 @로 변경해서 출력하시오.

제한사항 : 없음
 */
package jackSnider;

public class Exam05 {
	
	public static void main(String[] args) {
		String words = "Jack Snider wants to eat chicken everyday.";
        String answer=" ";
        
        for (int i = 0; i<words.length();i++) {
        	answer=String.valueOf(words.charAt(i));
       
    		if(words.charAt(i)==' ') {
            answer="@";    		
            
			}
    		System.out.print(answer);
		}

       

	}

}
