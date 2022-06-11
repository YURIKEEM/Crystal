package kr.or.ddit.test;

public class Test1 {

	public static void main(String[] args) {
		
		//Sample 클래스를 사용
		
		//Sample 클래스를 사용- Sample 클래스의 객체변수를 생성
		// 객체변수 - 자료형(클래스이름) 변수명 = new 클래스이름();
		//일반변수 - 자료형 변수명  int a  String b
		Sample samp = new Sample(); 
		
		//리턴결과형 변수이름 = 메소드이름 (값)
		int res =samp.add(23, 56);
	    System.out.println("23+56=" +res);
	    
	    int res2 = samp.add(56,12);
	    System.out.println(res2);	    
	   
	    samp.calc(10, 55);
		
	}

}


class Sample{
	//기능부여 - 메소드 정의
	/*메소드 형식
	 * public 리턴결과형 메소드 이름 (매개변수){return 결과값}
	 * public void 메소드이름 (매개변수){  }
	 */
	public int add(int a, int b){
		  int result = a+b;
		  return result;
	}
	
	public void calc(int a, int b){
		int result= a+b;
		System.out.println(a+"+"+b+"="+result);
	}
	
	
}