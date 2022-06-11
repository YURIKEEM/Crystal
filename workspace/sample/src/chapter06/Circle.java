package chapter06;

public class Circle {
   private double radius;
   private final double PI=3.1415926;  //final로 상수가 되었기때문에 PI는 더이상 = 왼쪽에 사용할 수 없음 
   
   public Circle(double radius) {
      this.radius=radius;	   
   }
   
   public Circle() {} //기본생성자
   
   public void setRadius(double radius) {
	   this.radius=radius;
   }
   
   public double getArea() {
	   return radius*radius*PI;
   }
}
