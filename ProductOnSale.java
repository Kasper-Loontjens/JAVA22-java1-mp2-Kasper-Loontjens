
class ProductOnSale extends Product{
	double sale;
	ProductOnSale(String name, double price, int stock, double sale) {
		super(name, price, stock);
		this.sale = restrictSale(sale);
		this.setPrice(newSalePrice(price));
		onSale = true;
	}
	double restrictSale(double sale) {
		if (sale < 0) return 0;
		else if (sale > 1)return 1;
		else return sale;
	}
	double newSalePrice(double amount) {return getPrice()*(1-sale);}
}