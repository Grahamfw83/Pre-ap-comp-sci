package ch2;

import java.util.Scanner;

public class Warmups2 {

	public static void main(String[] args) {
		String name, name2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your primero nombre");
		name = keyboard.nextLine();
		System.out.println("Enter your fin nombre");
		name2 = keyboard.nextLine();
		keyboard.close();
		
		name = name.toUpperCase();
		name2 = name2.toUpperCase();
		char name3 = name.charAt(0);
		char name4 = name2.charAt(0);
		System.out.print("this is your nombre intials " + name3 + name4);

	}

}
