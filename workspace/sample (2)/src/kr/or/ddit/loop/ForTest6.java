package kr.or.ddit.loop;

public class ForTest6 {

	public static void main(String[] args) {
		
		//For6 클래스객체생성
		For6 f6 = new For6();
		
		//hap1메소드 호출 - 결과값 받기
		//결과값 출력
		int sum1 =f6.hap1();
		System.out.println("1~10까지의 합= "+sum1);
		//hap2메소드호출
		f6.hap2();
       
	}

}

class For6{
	//1~10 까지 합을 구해서 리턴하는 메소드를 작성
    public int hap1() {
    	int hap = 0;
    	
    	for(int i=1; i<=10; i++) {
    		hap += i;
    	}
    	return hap;
    }
	
	//10~1 까지 합을 구해서 출력하는 메소드를 작성
	public void hap2() {
		int hap = 0;
		
		for (int i=10; i>=1; i--) {
			hap += i;
		}
		System.out.println("10~1까지의 합= "+hap );
	}
}