package chapter06;


package book;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rect rt1 = new Rect("네모",12,23); // MainClass 문제1
		
		
		// MainClass 문제2
		Rect rt2 = new Rect();
		System.out.print("이름 입력 : ");
		rt2.name = sc.next();
		System.out.print("가로 입력 : ");
		rt2.width=sc.nextDouble();
		System.out.print("세로 입력 : ");
		rt2.height=sc.nextDouble();
		
		System.out.println();
		System.out.println("이름 : "+rt1.name+" | 가로 : "+ rt1.width+" | 세로 : "+rt1.height);
		System.out.println("면적 : "+rt1.area() + "| 둘레 : "+ rt1.girth());
		System.out.println();
		
		
		System.out.println("이름 : "+rt2.name+" | 가로 : "+ rt2.width+" | 세로 : "+rt2.height);
		System.out.println("면적 : "+rt2.area() + " | 둘레 : "+ rt2.girth());
		System.out.println();
		
		//MainClass 문제4
		rt1.width  += 2;
		
		rt1.area();
		rt1.girth();
		
		System.out.println("이름 : "+rt1.name+" | 가로(+2) : "+ rt1.width+" | 세로 : "+rt1.height);
		System.out.println("면적(재계산) : "+rt1.area() + "| 둘레(재계산) : "+ rt1.girth());

	}

}


public class Cylinder extends MemberEx01{
   private double height;
   private Circle c4;   //Cylinder- Circle 포함관계   멤버로 선언해준다
   
   

public Cylinder() {
	this(10,new Circle(23.35));
   }

    public Cylinder(double height, Circle c6) {
	this.height = height;
	this.c4=c6;
	
}
 public double getVolumn() {
	 return height*c1.getArea();
 }


}