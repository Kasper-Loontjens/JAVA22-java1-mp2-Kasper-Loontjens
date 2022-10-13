import java.util.Scanner;

class Shop {
	static Product products[] = {new Product("sword", 500, 2) ,new Product("Potion", 25.5,4),new ProductOnSale("Broken dreams", 5, 200, 0.5), new ProductOnSale("sword", 500, 1, 0.2)};
	static Scanner scanner = new Scanner(System.in);
	static Customer customer = new Customer();
	
	static void goShop() {
		int choice = 0;
		
		while (true) {
			for(int i = 0; i < products.length; i++) {
				System.out.print((i+1)+". Buy " + products[i].getName() + ", " + products[i].getPrice() + " SEK, " + products[i].getStock() + " left.");
				if (products[i].onSale) System.out.print(" NOW ON SALE!!!");
				System.out.println("");
			}
			System.out.println(products.length + 1 + ". Quit.");
			choice = choose();
			if (choice <= products.length && choice >0) {
				if (products[choice-1].getStock() > 0)products[choice-1].purchase(1);
				else {
					System.out.println("sorry, We are out");
					continue;
				}
				customer.spendMoney(products[choice-1].getPrice());
			}else if (choice == products.length + 1){
				System.out.println("You purchased a total of " + customer.getproductTotal() + " items. The total cost was " + customer.getMoneySpent() + " SEk.");
				break;
			}
			else {
				System.out.println("Select a valid option.");
				continue;
			}
		}
	}
	static int choose() {
		while (true) {
			try {
				return scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Try again.");
				scanner.next();			
			}
		}

	}
}