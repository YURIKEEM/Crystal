/* 6-1)field
 * -멤버변수를 의미
 * -클래스 내부(메서드 밖)
 * -자동 초기화
 * -멤버변수의 참조 : 클래스 내부에서는 => 객체 생성없이(객체참조변수 사용하지 않고)
 *                                      외부에서는 => 객체를 생성하고 생성된 객체참조변수를 이용하여 참조
 * -역할 : 클래스의 상태를 표현                                    
 */

package chapter06;

public class MemberVal01 {

	public static void main(String[] args) {
//       = new Circle();
//      c1.setRadius(23.35);
//      System.out.println("원의 면적="+c1.getArea());  //void타입은 못쓰지! 여기로 값 반환해줘야 하니까
      
      Circle c2=new Circle(23.35);
      c2.setRadius(35.21);
      System.out.println("원의 면적="+c2.getArea());
      
      Cylinder y1 = new Cylinder();
      System.out.println("원기둥의 체적="+y1.getVolumn());
      
      Cylinder y2 = new Cylinder(10, new Circle(23.35));
      System.out.println("원기둥의 체적="+y1.getVolumn());
	}

}
