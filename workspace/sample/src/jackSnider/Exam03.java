/*
 * for문을 이용해서

100부터 0까지 찍는데

0이 되면 다시 100으로 가서

다시 내려온다 위 과정을 무한 반복 하시오
 */

package jackSnider;
public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int count=0;
		for(int i=100; i>=0; i--) {
			System.out.println(i);
		   
			if(i==0) {
				i+= 101;
				count++;
				if (count==5) break;
				
			}
			
		}
		
	}

}
