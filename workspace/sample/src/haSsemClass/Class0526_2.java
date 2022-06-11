/*** SOLID의 원칙(객체지향 설계 5대원칙) 
  . 자신 클래스 안에 응집도는 내부적으로 높이고, 
    타 클래스들 간 결합도는 낮추는 High Cohesion - Loose Coupling 원칙을 객체 지향의 관점에서 도입한 것
    1. SRP (Single Responsibility Principle) 단일 책임 원칙
      - "어떤 클래스를 변경해야 하는 이유는 오직 하나 뿐이어야 한다." -로버트 C. 마틴
      - 클래스의 역할과 책임을 너무 많이 주지 마라.
    2. OCP (Open Closed Principle) 개방 폐쇄 원칙
      - "소프트웨어 엔티티(클래스,모듈,함수 등)는 확장에 대해서는 열려 있어야 하지만 변경에 대해서는 닫혀 있어야 한다." - 로버트 C. 마틴
      - 자신의 확장에는 열려 있고, 주변의 변화에 대해서는 닫혀 있어야 한다
    3. LSP (Liskov Substitution Principle) 리스코프 치환 원칙
      - "서브 타입은 언제나 자신의 기반 타입(base type)으로 교체할 수 있어야 한다." - 로버트 C. 마틴
      - 하위 클래스의 인스턴스는 상위형 객체 참조 변수에 대입해 상위 클래스의 인스턴스 역할을 하는데 문제가 없어야 한다.
      - 즉 Upcating 된 객체 참조 변수가 논리적으로 그 역할이 문제가 없어야 한다
    4. ISP (Interface Segregation Principle) 인터페이스 분리 원칙
      - "클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안된다." - 로버트 C. 마틴
      - 상황과 관련 있는 메서드만 제공해라.
    5. DIP (Dependency Inversion Principle) 의존 역전 원칙
      - "고차원 모듈은 저차원 모듈에 의존하면 안된다. 이 두 모듈 모두 다른 추상화 된 것에 의존해야 한다." 
      - "추상화 된 것은 구체적인 것에 의존하면 안된다. 구체적인 것이 추상화 된 것에 의존해야 한다."
      - "자주 변경되는 구체(Concrete) 클래스에 의존하지 마라" - 로버트 C. 마틴
      - 자신보다 변하기 쉬운 것에 의존하지 마라.*/
package haSsemClass;

public class Class0526_2 {

}
