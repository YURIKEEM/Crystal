package chapter01;

public class Lec050303 {
    static boolean b; //��������� �ڵ����� �ʱ�ȭ �ȴ�
	public static void main(String[] args) {
		char ch1='a'; //���������� �ʱ�ȭ �� �ؾ��Ѵ�. (�ʱ갪�־���Ѵٴ� �ǹ� ���ߴµ� �����Ǹ� ����)
		char ch2='A';
		char ch3='��';
		char ch4=(char)(ch1+10);
		int res=ch2+100;
				
	    System.out.println("ch1="+ch1);
		System.out.println("ch2="+(int)ch2);
		System.out.println("ch3="+ch3);
		System.out.println("ch4="+ch4);
		System.out.println("res="+res);
		
		boolean b=true;
		if(b) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
