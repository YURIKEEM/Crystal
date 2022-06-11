package chapter03;

public class Operator02 {

	public static void main(String[] args) {
		//  관계연산자- 대소관계 비교 
		// >, <, >=, <=, ==, !=,  instanceof
		// 결과는 true or false 반환
		// if문 등의 조건문 구성에 사용
		
		Oper1 op1=new Oper1 () ;
		System.out.println("정수비교:"+op1.comOper(10, 15));
		System.out.println("수비교:"+op1.comOper(10, 10.f));
		System.out.println("문자열비교:"+op1.comOper("홍길동", "홍길동")); //리터럴풀에 있으면 스캔해서 스택안의 같은 주소 쓰기때문에 true
		System.out.println("문자열비교:"+op1.comOper(new String("홍길동"), new String("홍길동"))); //힙에 다른 기억장소로 만들어져있기 때문에 false출력됨
		System.out.println("문자열비교:"+op1.comOperContent(new String("홍길동"), new String ("홍길동")));
		
	}

}

class Oper1 {
    public boolean comOper (int a, int b){
    	boolean res=a>b;
    	return res;
    }
	
    public boolean comOper (String a, String b){
    	boolean res=(a==b); // (객체참조변수==객체참조변수)는 내용 비교가 아니라 주소를 비교하는 연산자 
    	return res;                // 내용비교: a equals b 
    }
    
    public boolean comOperContent (String a,String b){
    	boolean res=a.equals(b);  
    	return res;              
}
    
    public String comOper (int a, float b){    //int가 큰 float에 맞춰 float로 변환이 먼저 된 다음에 크기 비교가 된다.
    	if (a>b) {
    		  return "a가 b보다 크다";   
    	}else if (a<b)	{
    		 return "a가 b보다 작다";
    	}else{
    		 return "a와 b가 같다";
    	}
    }
}
            