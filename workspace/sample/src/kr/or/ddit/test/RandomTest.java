package kr.or.ddit.test;

public class RandomTest {

	public static void main(String[] args) {
		// 랜덤테스트클래스 객체 생성
      RandomTest test = new RandomTest();
      test.randProc();
	
	}

	public void randProc() {
		
		// - 주사위 던지기 - 랜덤발생1~6
	      int rand = (int)(Math.random()* 6+1);  //double a = Math.random(): 
	                                                              // 0.0 >= a < 1.0
	                                                              //1~10 --> Math.random()*10 + 1
	                                                              // int a = (int)(Math.rand()*10 + 1)
	                                                              // 50~100 : "(최대-최소+1)+최소" 
	                                                              //int a =(int)(Math.random()*51+50)
	                                                              // 65~120 >> *56 +65
	      
	      String str = "";
//비교
		  switch(rand) {
		  case 1:
			  str = "사탕 1개";
			  break;
		  case 2:
			  str = "사탕 2개";
			  break;
		  case 3:
			  str = "사탕 3개";
			  break;
		  case 4:
			  str = "사탕 4개";
			  break;
		  case 5:
			  str = "사탕 5개";
			  break;
		  case 6:
			  str = "사탕 6개";
			  break;
		  
		  }
	      
		//결과
		
		  System.out.println("주사위 수 : " +rand +"\n");
		  System.out.println("획득 상품 : " + str);
		  
		
	}
}
