/*
 * String words = “Jack sNIdEr alWaYS eaTs ChIKEns”;

다음 문자열에서 대문자는 소문자로, 소문자는 대문자로 바꿔서 출력하시오.
 */
package jackSnider;

public class Exam06 {
    
	public static void main(String[] args) {
	 String words = "Jack sNIdEr alWaYS eaTs ChIKEns";
	 int temp;
	 String answer="";
     for(int i=0; i<words.length();i++) {
       temp = (int)words.charAt(i);
       if(65<=temp && temp <=90) {
    	   answer += (char)(temp+32);
       }if(95<=temp && temp <=122) {
    		answer += (char)(temp-32);
    	}
       if(words.charAt(i) == ' '){
    		answer += ' ';
    	}
       
     }
     System.out.println(answer); 
	

	}

}
