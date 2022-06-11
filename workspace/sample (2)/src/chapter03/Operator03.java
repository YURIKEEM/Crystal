package chapter03;

public class Operator03 {

	public static void main(String[] args) {
		// 논리연산자 
		// &&(and) , ||(or) : 2개 이상의 관계연산자를 결합
		// !(not) : 현재 데이터의 논리값을 반전
		// ! -> && -> || 순으로 연산
        //-------------------------------------------------------
		/*           입력                                  출력
		 * -------------------------------------------------------
		 *         A      B         A && B          A || B
		 * -------------------------------------------------------
		 *         F       F             F                   F
		 *         F       T             F                   T
		 *         T       F             F                   T
		 *         T       T             T                   T
		 * ------------------------------------------------------- 
		 * 
		 */
	Oper2 op1=new Oper2();
	boolean res=op1.logicalOper (10, 10, new String ("강감찬"), "강감찬");
	}
	

}

class Oper2{
	 public boolean logicalOper (int a, int b, String str1, String str2) {
	     boolean res = (a==b) && (str1.equals(str2));
	     return res;
         }
     public String logicalOper (int year) {
    	 if((year%4 == 0&& year%100 != 0) || (year%400 == 0)) {
    		 return year+"는 윤년입니다";
    	 }else{
    		 return year+"는 평년입니다";
    	 }	 
    	 }
     }