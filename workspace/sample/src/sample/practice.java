package sample;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//예제 p.52
		int hour = 3;
        int minute = 5;
     
           System.out.println(hour+"시간 "+minute+"분");
     
        int totalMinute = (hour * 60) + minute;
    
           System.out.println("총" + totalMinute + "분");
    
    //예제 p.53
      int x = 3;
      int y = 5;
          System.out.println("x:" + x + "y:" + y);
    
      int temp = x;
      x = y;
      y = temp;
         System.out.println("x:" + x + "y:" + y );
         
         
         
        //예제 p.61 byte 타입 변수
         
         char var1 = 'A';
         int var2 = 'A';
         System.out.println(var1);
         System.out.println(var2);
         
         
         String name = "홍길동";
         String job = "프로그래머";
         System.out.println(name);
         System.out.println(job);
         
         String str = "나는 \"자바\"를 좋아합니다.";
         System.out.println(str);
         
         
         byte byteValue = 10;
         int intValue = byteValue;
         System.out.println("intValue="+intValue);
         
         
         char charValue = '가';
         int intValue1 = charValue;
         System.out.println("'가'의 유니코드:" +intValue1);
         
         int intValue2 = 65;
         char charValue2 = (char) intValue2;
         System.out.println(charValue2);
     }

}





