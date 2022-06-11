 //예제 1] 정수형 배열 5개에 100~500 의 값을 저장하고 인쇄는 코드를 배열 인덱스의 범위에 따른 예외처리를 고려하여 작성하시오…  
package chapter10;

import java.util.Arrays;

public class ExceptionSample01 {

	public static void main(String[] args) {
	   int[] num = new int[5];
	   try {
	   assignValueToArray(num);
	   }catch(NumberFormatException e){
		   e.printStackTrace();		
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	}
	public static void assignValueToArray(int[]num) throws NumberFormatException
	{	
			for(int i=0; i<=num.length; i++) {
			num[i]=(i+1)*100;
			System.out.println(num[i]);
		}
		
	}

}
