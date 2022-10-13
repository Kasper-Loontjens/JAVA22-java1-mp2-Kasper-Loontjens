
class Product {
	private String name;
	private double price;
	private int stock;
	boolean onSale = false;
	
	Product(String name, double price, int stock){
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	String getName() {return name;}
	double getPrice() {return price;}
	int getStock() {return stock;}
	
	void setPrice(double amount) {price=amount;}
	void purchase(int amount) {stock-=amount;}
}
