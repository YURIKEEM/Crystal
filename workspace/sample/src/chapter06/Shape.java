package chapter06;

 class Shape {
   String kind;
   
   Shape(){
	   kind = "다각형";
   }
   
   public String getShape() {
	   return kind;
   }
}

class Rectangle extends Shape{

	Rectangle(){
		kind="사각형";
	}
	@Override
	public String getShape() {
		return "다각형의 종류 : "+kind;
	}
}
