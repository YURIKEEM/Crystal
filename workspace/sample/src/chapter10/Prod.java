package chapter10;

public class Prod {

	private String prodId;
	private String prodName;
	private int price;
	
	public Prod() {}
	
	public Prod(String prodId, String prodName, int price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ID="+getProdId()+"\nName=" +getProdName()+"\nPrice="+getPrice();
	}
}
