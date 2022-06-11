/* 클래스와 객체
 * - 객체지향 프로그램의 가장 핵심적인프로그램 구성단위
 * - 클래스(설계도로)가 인스턴스화(집이지어지면) 하면 객체(object)(호출해서 점유해야됨)가 됨
 * - 클래스는 필드(field, attribute)와 행위(behavior,method)로 구성
 *  1)클래스
 *   .설계도 또는 제품생산을 위한 틀(frame)에 해당
 *   .클래스의 사용형식
 *   접근지정자 class 클래스명{
 *       변수; ----field (멤버변수 자동초기화)
 *        :
 *       접근지정자 [static|final] [void|리턴타입] 메서드명([매개변수 LIST]){
 *              명령문(들);
 *        }
 *      } 
 *     - '접근지정자' : 해당 클래스를 외부에서 접근할 수 있는 범위
 *      .public : 접근제한이 없음(동일클래스내, 동일패키지내, 다른패키지의 자식클래스
 *                                          다른 패키지)
 *      .protected : 동일패키지내의 클래스와 자식클래스에서 접근가능
 *      .default(생략되면 default) : 동일 패키지내에서만 접근가능
 *      .private : 동일 클래스내에서만 접근가능                                     
 *     -'클래스명' : 사용자 정의 단어 이용
 *      .첫 글자는 영대문자나 특수문자 중 ( $, _ ) 사용
 *      .두번째 글자는 영문자나 숫자 사용가능
 *      .각 단어의 첫 글자는 대문자로 구성
 *      .예약어와 같은 형태이어서는 안됨
 *     -'static' : 정적 메서드나 정적변수를 선언
 *      .정적변수나 정적 메서드는 프로그램이 loading될때 기억장소를
 *       배정받고 한번만 초기화됨
 *      .static 메서드에서 호출하거나 참조하는 변수도 정적변수 또는
 *       정적메서드이어야 함
 *      .정적메서드의 호출을 위해 정적메서드를 가지고 있는 클래스는 객체화하지 않아도 됨
 *       호출은 Student.getName() 형태로 사용       
 *     -객체화
 *      .new 연산자 사용(힙메모리에 해당 클래스 객체가 공간을 할당받음)
 *      .객체참조변수를 이용하여 클래스 내부의 메서드나 변수(멤버변수)를 참조함
 *      (사용형식)
 *      클래스명 개체참조변수=new 클래스명([매개변수list]);
 *      
 *      객체참조변수.메서드명 ([매개변수list]);
 *      객체참조변수.멤버변수
 *        
 */


package chapter06;
public class Sample01 {  
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.kind="강아지";
		dog.setName("멍멍이"); 
		System.out.println("애완동물 종류: " +dog.kind);
		System.out.println("애완동물 이름: " +dog.getName());
		
		Animal cat = new Animal();
		cat.kind="고양이";
		cat.setName("야옹이");
        System.out.println("애완동물 종류: "+cat.kind);
        System.out.println("애완동물 이름: "+cat.getName());

	}    
}
