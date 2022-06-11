package chapter01;

public class Lec050303 {
    static boolean b; //멤버변수는 자동으로 초기화 된다
	public static void main(String[] args) {
		char ch1='a'; //지역변수는 초기화 꼭 해야한다. (초깃값넣어야한다는 의미 안했는데 참조되면 오류)
		char ch2='A';
		char ch3='대';
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
