package ch2;
import java.util.Scanner;
public class Warmups {

	public static void main(String[] args) {
		String name;
		double hours, payRate, grossPay;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		name = keyboard.nextLine();
		System.out.println("How many hours do you work a week?");
		hours = keyboard.nextDouble();
		System.out.println("What is your hourly pay rate?");
		payRate = keyboard.nextDouble();
		grossPay = hours*payRate;
		
		System.out.println("Hello " + name);
		System.out.print("Your gross pay is " + grossPay);
		
		
		
		

	}

}
                      