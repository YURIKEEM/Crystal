package book;

// 클래스 작성
public class Rect {
	
	// 맴버변수 
	String name;
	double width;
	double height;

	// 기본생성자 
  Rect() {}
  
  // 생성자(이름)
  Rect(String name) {
	  // this 이용
	 this.name=name;
  }
  
  //생성자(이름,가로,세로)
  Rect(String name, int width, int height) {
	  // this로 초기화 
	  this.name=name;
	  this.width=width;
	  this.height=height;
  }
  
  // 가로설정
  public void setWidth(int width) {
	  this.width=width;
  }
  
  // 세로설정
  public void setHeight(int height) {
	  this.height=height;
  }

  // 가로 반환
  public double returnWidth() {
	  return width; 
	  
  }
  // 세로 반환
  public double returnHeight() {
	  return height;
  }
  
  //면적 반환
  public double area() {
	  return width*height;
  }
  
  
  // 둘레 반환
  public double girth() {
	  return (width*2)+(height*2);
  }
}