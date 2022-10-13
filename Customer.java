
class Customer {
	private double moneySpent = 0;
	private int productTotal = 0;
	
	double getMoneySpent() {return moneySpent;}
	int getproductTotal() {return productTotal;}
	
	void spendMoney(double amount) {
		moneySpent += amount;
		productTotal++;
	}
	
}
