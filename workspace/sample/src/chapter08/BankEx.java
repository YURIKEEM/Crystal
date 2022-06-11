package chapter08;

public class BankEx {

	public static void main(String[] args) {
		KBBank kb = new KBBank();
		kb.setBalance(500000);
		kb.withdraw(100001);
		
		Bank b = new KBBank(1000000);
		b.deposit(100000);
		System.out.println("잔고 : "+((KBBank)b).getBalance());
	}

}
