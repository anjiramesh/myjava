package myjava;

public class Price {

	private int id;
	private double price;
	
	public Price() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Price [id=" + id + ", price=" + price + "]";
	}
	
	
	
}
