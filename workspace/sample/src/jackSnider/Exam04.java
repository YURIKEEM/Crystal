/*
 * String name = “Jack Snider always helps other people even though he is already busy to study his own”;
   에서 공백이 몇개 있는지 세는 코드를 작성하시오
 */
package jackSnider;

public class Exam04 {

	
	public static void main(String[] args) {
	  String name= "Jack Snider always helps other people even though he is already busy to study his own" ;
		int space=0;
		
		for (int i = 0; i<name.length();i++) {
			if(name.charAt(i)==' ') {
				space++;
			}
		}
		System.out.println("빈 자리 수 : "+space);
		
		}
}

