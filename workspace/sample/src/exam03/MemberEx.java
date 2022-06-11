package exam03;

public class MemberEx {

	public static void main(String[] args) {
		Member m1 = new Member();
		
		m1.sell();
		m1.buy();
		m1.order();
		System.out.println("지갑의 돈 : " +m1.money);
		
		Sell s= new Member();
		s.sell();
		//s.buy();
		System.out.println("지갑의 돈 : "+s.MONEY);
		
		Buy b= new Member();
		b.buy();
		System.out.println("지갑의 돈 : "+b.MONEY);
		
		

	}

}
