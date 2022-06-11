package Interface_study;

public class Test {
	
	String name;
	int age;
	boolean gender;
	
	
	Test(){}
	
	Test(String name){
		this.name = name;
	}
	
	Test(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Test(String name, int age, boolean gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
}
