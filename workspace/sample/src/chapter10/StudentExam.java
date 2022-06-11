package chapter10;

import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class StudentExam {
    List<Student>list = new ArrayList<Student>();
  
	public static void main(String[] args) throws IOException {	
	  List<Student>list = new ArrayList<Student>();
      //메뉴 (1.입력 2.전체list출력 3.조회 4.종료)
		while (true) {
	   System.out.println("----------------------------------------------------");
		System.out.println("|  1.입력   |  2.전체List출력  |  3.조회  |  4.종료  |");
		System.out.println("----------------------------------------------------");
		System.out.println("번호 선택");
		char ch = (char)System.in.read();
		if (ch == 1) {
		  inputScore(list);
		  }else  if
		 
	}
        
	
    public static void inputScore(List<Student>list) {
    	Scanner sc = new Scanner(System.in);
    	while (true)
    	System.out.println("학번 : ");
    	int studentNum = sc.nextInt();
    	if(studentNum==9999) {
    		break;
    	}
    	System.out.println("이름 : ");
    	String studentName = sc.next();
    	
    	Student st= new Student(1000, "홍길동", 90);
    	
    }
    
    public static void selectAll() {
    	
    }
    public static void selectOne() {
    	
    }
}
