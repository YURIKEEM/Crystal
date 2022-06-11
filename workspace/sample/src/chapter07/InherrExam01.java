/*상속
 *  부모클래스(상위클래스)의 멤버를 자식클래스(하위클래스)가 정의하지 않고 사용
 *  -클래스의 재사용(간결, 효율적)
 *  -부모클래스의 멤버를 공통으로 사용 (확장성이 용이)
 *  (사용형식)
 *   접근지정자 class 자식클래스명 extends 부모클래스명 {
 *   
 *   } 
 *   - 부모의 생성자, 부모클래스에서 private로 선언된 멤버, 부모와 자식이 서로 다른 패키지에 존재한다면 
 *     부모클래스에서 default로 선언된 멤버는 상속 불가.
 *   - 상품(Product : 상품명, 가격)
 *      TV, 노트북, 스마트폰 : 상품을 상속 받는 자식 클래스
 *   -  TV (화면크기,설치유형)
 *      스마트폰 (5G여부, 메모리크기, 색상) 
 *      노트북(ram의 크기. cpu 타입, 화면크기) 
 */
package chapter07;

public class InherrExam01 {

	public static void main(String[] args) {
		Mac m1=new Mac();
		m1.setPrice(100000);
		System.out.println("맥북의 가격: " +m1.getPrice());
		

	}

}
