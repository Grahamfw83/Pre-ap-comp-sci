package ch2;

public class Sale {

	public static void main(String[] args) {
		double price, tax, taxrate, total;
		price = 29.75;
		taxrate = .08;
		tax = price*taxrate;
		total = tax+price;
		
		System.out.println("Dis be the price " + price + "\nDis be the tax " + tax + "\nDis be the total " + total);

	}

}
