package haSsemClass;

public class SalesManagerEx {
	   public static void main(String[] args) {
		      Customer cust = new Customer();
		      cust.buy(new Tv());
		      cust.buy(new Computer());
		      cust.buy(new Audio());
		      cust.summary();
		    }
}
