package book;

public class PersonTest {

	public static void main(String[] args) {
		MyDate md = new MyDate();
		Person p1 = new Person();
		Person p2 = new Person("김유리",1990,11,01);
		Person p3 = new Person("김유리",md);
		
		PersonTest.personInfo(p3);
		PersonTest pt = new PersonTest();
		pt.personPrint(p3);

	}
	public static void personInfo(Person p) {
		System.out.println("이름 : " +p.getName());
		System.out.println("생년월일 : "+p.getYear()+","+p.getMonth()+","+p.getDay());
	}

	public void personPrint(Person p) {
		System.out.println("이름 : "+p.getName());
		System.out.println("생년월일 : "+p.getYear()+","+p.getMonth()+","+p.getDay());
		
	}
}
