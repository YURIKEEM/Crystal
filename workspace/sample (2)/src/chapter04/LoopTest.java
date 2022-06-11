	    // [Q1.] 첫날에 100원 그 다음날부터는 전날의 2배씩
		//저축을 할 경우 처음으로 100만원을 넘는 날과 
		//저축금액을 구하라
		
		//[Q2.] 1~50 사이의 피보나치수열 값을 모두 출력하시오
		//피보나치수열: 첫번째와 두번째 수가 1로 주어지고
		//그 다음 수 부터는 전 두 수의 합이 현재수가 되는 수열

package chapter04;

public class LoopTest {

	public static void main(String[] args) {
		
//        SaveMoney sm = new SaveMoney();
//        sm.getMoney();
        
        Fibonacci f1=new Fibonacci();
        f1.getNumber();
        
        
        
			
		}

	}


class SaveMoney{
	public void getMoney() {
		int days =1;  //날수
		int amount=100; //해당 일자에 저축할 액수
		int sum=0;  //저축금액합계
		
		
		/*int days  = 0; -> 아래 방식은 days를 첫 회전부터 하나올리기 때문에 0으로 시작
		 * while(sum<1000000) {
		 * 
		 * sum = sum + amount; 
		 * days++; 
		 * amount = amount*2;
		 * 
		 * }
		 */
		
		while(true) {
			sum = sum + amount; 
			if(sum>=1000000) {
				break;
			}else {
				days++;
				amount = amount*2;
			}
		}
		System.out.println("날수 : " +days);
		System.out.println("금액 : " +sum);
			
		
	}
}

class Fibonacci{
	public void getNumber() {
		int preNum=1;  //전 수
		int ppreNum=1;  //전 전 수
		int currNum=0; //현재 수
		
		String res = "1, 1, ";
		while(true) {
			currNum=preNum + ppreNum;
			if(currNum>=50) {
				break;
			}else {
				ppreNum=preNum;
				preNum=currNum;
				
				res=res + currNum+", ";
			}
			 
		}
		System.out.println("피보나치 수열 : "+res);
		
		
	}
}

//*************[숙제]  1-2+3-4.....-10=?  (짝수에 -가 붙고있다)
// **************위와 같이 출력되고 결과도 출력 되도록 프로그램하시오

 class Homework{
	 public void String () {
		 
	 }
 }
