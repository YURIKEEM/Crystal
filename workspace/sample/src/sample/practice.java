package sample;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//���� p.52
		int hour = 3;
        int minute = 5;
     
           System.out.println(hour+"�ð� "+minute+"��");
     
        int totalMinute = (hour * 60) + minute;
    
           System.out.println("��" + totalMinute + "��");
    
    //���� p.53
      int x = 3;
      int y = 5;
          System.out.println("x:" + x + "y:" + y);
    
      int temp = x;
      x = y;
      y = temp;
         System.out.println("x:" + x + "y:" + y );
         
         
         
        //���� p.61 byte Ÿ�� ����
         
         char var1 = 'A';
         int var2 = 'A';
         System.out.println(var1);
         System.out.println(var2);
         
         
         String name = "ȫ�浿";
         String job = "���α׷���";
         System.out.println(name);
         System.out.println(job);
         
         String str = "���� \"�ڹ�\"�� �����մϴ�.";
         System.out.println(str);
         
         
         byte byteValue = 10;
         int intValue = byteValue;
         System.out.println("intValue="+intValue);
         
         
         char charValue = '��';
         int intValue1 = charValue;
         System.out.println("'��'�� �����ڵ�:" +intValue1);
         
         int intValue2 = 65;
         char charValue2 = (char) intValue2;
         System.out.println(charValue2);
     }

}





