package chapter08;

public interface Bank {
    int MAX_MONEY=100000;  //보이지 않지만 public final static 이 있어서 변수처럼 보이지만 상수로 만들어지는 것이다.  
    
    //출금메소드
    int withdraw(int amount);
    
    //입금메소드
    void deposit(int amount);
    
	/*
	 * //default 메소드 default String findDormancyAccount(String usrId) {
	 * System.out.println("휴면계좌를 찾아 계좌번호 반환"); return
	 * "고객님의 휴면계좌번호는 999-999-99-9999"; }
	 * 
	 * static void BCAuth(String bankName) { System.out.println("블록체인 인증"); }
	 */
}
