package chapter07;

public class Product {
 String prodName;
 int price;
 String prodCompany;
 
 public Product(String prodName, int price, String prodCompany) {
	 this.prodName=prodName;
	 this.price=price;
	 this.prodCompany=prodCompany;	
 }
 public Product() {}
 
 public int sale(int cnt) {   //판매관리
   return cnt*price;
 }	 
 public int refund(int cnt) { //반품처리
   return -(cnt*price);
 }	 
 
}
