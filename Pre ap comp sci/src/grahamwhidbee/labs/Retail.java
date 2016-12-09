package grahamwhidbee.labs;
import java.util.Scanner;
public class Retail {

	public static void main(String[] args) {
		double discountAmount, reducedPrice, taxRate, tax;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter sales price");
		double price = keyboard.nextDouble();
		
		System.out.println("Original Price " + price);
		discountAmount = .2;
		reducedPrice = price*discountAmount;
		System.out.println("Amount of savings " + reducedPrice);
		reducedPrice = price-reducedPrice;
		System.out.println("Discounted retail price " + reducedPrice);
		System.out.println("Subtotal " + reducedPrice);
		taxRate = .08;
		tax = reducedPrice*taxRate;
		System.out.println("Sales tax " + tax);
		reducedPrice = reducedPrice + tax;
		System.out.println("Total with tax " + reducedPrice);
		
		keyboard.close();
		
		
		
		
		
		
		
		

	}

}
