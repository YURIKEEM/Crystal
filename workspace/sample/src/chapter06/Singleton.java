package chapter06;
//정적 block 이용 : 인스턴스의 생성 시점이 사용시점이 아니라 클래스 로딩 시점
//public class Singleton {
//   private static Singleton s1;
//   private Singleton() {}
//    static {                                 //정적초기화블록  가장먼저 실행됨
//    	try {
//    		  s1=new Singleton();
//    	}catch(Exception e) {
//    			throw new RuntimeException("Create Instance fail error"+"msg="+e.getMessage());
//    		}
//    	}
//    	public static Singleton getInstance() {    //static 때문에 객체 생성은 딱 한번만 됨 여기에서 또 만들었는데.. 처음생긴 주소값이 들어감
//    		return s1;		
  
//인스턴스가 필요한 시점에서 객체 생성 - 멀티스레드 안됨
//
//public class Singleton{
//	private static Singleton s1;
//	private Singleton() {}
//	public static Singleton getInstance() {
//		if(s1==null) {
//			s1= new Singleton();
//		}
//		return s1;
//	}
//}

// 스레드 처리 포함

//public class Singleton{
//	private static Singleton s1;
//	private Singleton() {}
//	public static synchronized Singleton getInstance() {
//		//스레드에서 동시 접근문제 해결
//		if(s1==null) {
//			s1= new Singleton();
//		}
//		return s1;
//	}
//}
//성능 저하. 시간이 많이 소요됨

public class Singleton{
	private Singleton() {}
	private static class InnerInstance{
		final static Singleton s1 = new Singleton();
	}
	public static Singleton getInstance() {
		//스레드에서 동시 접근문제 해결
		return InnerInstance.s1;
	}
}