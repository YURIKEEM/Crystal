package exam03;

public class Member implements Sell, Buy {
   
	int money = 10000;

	public void buy() {
		System.out.println("구매하기");
	}


	public void sell() {
		System.out.println("판매하기");
	}
	
	public void order() {
		System.out.println("고객주문");
	}

}
