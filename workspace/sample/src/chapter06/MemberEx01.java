package chapter06;

public class MemberEx01 {
    private int age;
    protected String name;
    private boolean gender;
   
    
   public void setAge(int age) {
	   	this.age=age;          //지역변수 안에서는 지역변수가 왕임! 멤버변수와 지역변수가 같을때 this.로 멤버변수와 지역변수 구별
	   	   
   }
   public void setName(String name) {
	   this.name=name;
   }
   public void setGender(boolean gender) {
	   this.gender=gender;
   }
}
