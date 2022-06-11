package exam02;

//인터페이스 : 객체(회식)의 사용방법(방법:막걸리2병+안주2개)을 정의한 타입
//인터페이스 이름 규칙: 클래스 이름 작성 규칙과 동일
public interface RemoteControl {
      //인터페이스는 생성자가 없다. 왜냐하면
	  //인터페이스는 객체로 생성할 수 없으므로!
	
	//막걸리2병
	public int max_volumn=10; //public static final이 생략되어있음 (final :상수.  항상 같은 수.초기값이 항상 존재)
	//안주2개
	public int min_volumn=0;
	
	
	
	//추상(abstract 생략가능) 메소드
	//리턴 타입, 메소드명, 매개변수 있음
	//중괄호가 없음{}
	public abstract void turnOn();
	public void turnOff();
	//스프링MVC에서 많이 쓰는 리턴 타입??
	//int : insert / update / delete)
	//List<객체타입> : 목록 or List<Map<String,Object>>
	//객체타입 : 상세페이지 or Map<String,Object>
	public void setVolume(int volume);
}
