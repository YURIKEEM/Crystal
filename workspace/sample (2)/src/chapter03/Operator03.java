package chapter03;

public class Operator03 {

	public static void main(String[] args) {
		// �������� 
		// &&(and) , ||(or) : 2�� �̻��� ���迬���ڸ� ����
		// !(not) : ���� �������� ������ ����
		// ! -> && -> || ������ ����
        //-------------------------------------------------------
		/*           �Է�                                  ���
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
	boolean res=op1.logicalOper (10, 10, new String ("������"), "������");
	}
	

}

class Oper2{
	 public boolean logicalOper (int a, int b, String str1, String str2) {
	     boolean res = (a==b) && (str1.equals(str2));
	     return res;
         }
     public String logicalOper (int year) {
    	 if((year%4 == 0&& year%100 != 0) || (year%400 == 0)) {
    		 return year+"�� �����Դϴ�";
    	 }else{
    		 return year+"�� ����Դϴ�";
    	 }	 
    	 }
     }