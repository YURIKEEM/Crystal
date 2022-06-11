package chapter08;

public abstract class KakaoBank implements Bank{
   public void kakaoWithdraw(int amount) {
	   System.out.println("Kakao 은행의 출금로직");
   }
   
   public void kakaoDeposit(int amount) {
	   System.out.println("Kakao 은행의 입금로직");
   }
}
