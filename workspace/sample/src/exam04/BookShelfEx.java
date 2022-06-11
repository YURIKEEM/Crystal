package exam04;

public class BookShelfEx {

	public static void main(String[] args) {
		Queue sq = new BookShelf();
		//책장의 책을 채워 넣는 동작
		sq.tailQueue("난장이가 쏘아올린 작은공");
		sq.tailQueue("관계형 데이터베이스 설계 노트");
		sq.tailQueue("소설같은 자바");
		//책을 대출하는 동작
		System.out.println("대출되는 책 : "+sq.frontQueue());
		System.out.println("책장에 있는 책의 수 : " +sq.getSize());
		System.out.println("대출되는 책 : "+sq.frontQueue());
		System.out.println("책장에 있는 책의 수 : " +sq.getSize());
		
		sq.tailQueue("관계형 데이터베이스 설계 노트");
		
		System.out.println("대출되는 책 : "+sq.frontQueue());
		System.out.println("책장에 있는 책의 수 : " +sq.getSize());
		
	}

}
