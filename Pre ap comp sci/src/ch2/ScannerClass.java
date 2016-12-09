package ch2;


import java.util.Scanner;
public class ScannerClass {
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter number");
		double num = keyboard.nextDouble();
		System.out.print("this is your num: " + num);
		keyboard.close();
		

	}

}
