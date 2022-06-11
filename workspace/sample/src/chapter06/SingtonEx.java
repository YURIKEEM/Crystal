package chapter06;
// Singleton Class
/*  -전체 프로그램에서 클래스 객체가 하나만 생성되고 해당 객체가 필요 할 때마다 해당 객체의 주소값을 전달
 *  -생성자 메소드의 접근지정자로 private을 사용하여 외부에서 클래스 객체를 직접 생성하지 못함
 *  -클래스 내부에서 자신의 타입의 객체를 생성하여 초기화
 *  -외부에서 호출 가능한 getInstance() 선언 사용
 */
public class SingtonEx {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);

	}

}
