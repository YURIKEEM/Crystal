package book;

public class SunjectTest {

	public static void main(String[] args) {
		
		  Subject sub1 = new Subject();
		  sub1.setName("영어");
		  sub1.setJumsu(78);
		  
		  Subject sub2 = new Subject("국어");
		  Subject sub3 = new Subject("수학",180);
		  
		  
		  sub1.print();
		  sub2.print();
		  sub3.print();

	}

}
class Subject{
	 private String name;
	 private int jumsu;
	 
	 public Subject() {}
	 public Subject(String name) {
		 this.name=name;
	 }
	 public Subject(String name, int jumsu) {
		 
		 boolean flag=checkJumsu(jumsu);
		 if(flag==true) { 
		 this.jumsu=jumsu;
		 this.name=name;
		 }else {
			  this.jumsu=-1;
		 }

		 
	 }
	 public void setName(String name){
		 this.name=name;
     }
	 public void setJumsu(int jumsu) {
		 this.jumsu=jumsu;
	 }
	 public boolean checkJumsu(int jumsu) {
		 if(0>jumsu || 100<jumsu) {
			 return false;
		 }else {
	        return true;
	     }
	 }	 
	 public String getGrade() {
		 String grade="";
		 switch(jumsu/10) {
		  case 10 :
		  case 9:
			 grade = "A";
			 break;
		  case 8:
			  grade= "B";
			  break;
		  case 7:
			  grade= "C";
			  break;
		  case 6:
			  grade= "D";
			  break;
		  case 5:
			  grade= "E";
	         break;
			default:
				grade= "F";
			break;
			
			 
		 }
		 return grade;
		     
	 }
	 public void print() {
		 System.out.println("과목 : "+ this.name);
		 System.out.println("점수 : " + this.jumsu);
		 System.out.println("성적 : " +getGrade());
	 }
	 
}