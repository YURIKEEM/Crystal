package chapter08;

public class SHBank implements Bank {

	@Override
	public int withdraw(int amount) {
		System.out.println("SHBank의 출금 로직 구현");
		if(amount>Bank.MAX_MONEY) {
			System.out.println("하루 허용된 출금 초과");
		return 0;
	}else {
		return amount;
	  }
	}
	@Override
	public void deposit(int amount) {
	   System.out.println("SHBank의 입금 로직 구현");
	}

}
