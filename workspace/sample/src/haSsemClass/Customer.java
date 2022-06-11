package haSsemClass;

public class Customer {
	int money = 1000; // 소유금액
	   int bonusPoint = 0; // 보너스점수
	   int i = 0;//Product 배열의 index
	   Product[] cart=new Product[10];
	   
	   void buy(Product p) {
	      if(money < p.price) {
	         System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
	         return;
	      }
	      
	      money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
	      bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
	      cart[i++] = p; // 제품을 Product[] cart에 저장한다.
	      
	      System.out.println(p + "을/를 구입하셨습니다.");
	   }
	   //반품메서드 
	    void refund( ) {
	       
	    }
	   void summary() { // 구매한 물품에 대한 정보를 요약해서 보여 준다.
	      int sum = 0; // 구입한 물품의 가격합계
	      String itemList =""; // 구입한 물품목록
	      // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
	      for(int i=0; i<cart.length;i++) {
	         if(cart[i]==null) break;
	         sum += cart[i].price;
	         itemList += cart[i].toString() + ", ";
	       }
	      
	      System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
	      System.out.println("구입하신 제품은 " + itemList + "입니다.");
	   }
	}



	/*1. 반품메서드 구현(refund)
	2. 구매수량을 반영한 구매메서드(buy) */

