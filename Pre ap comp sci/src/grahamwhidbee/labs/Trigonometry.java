package grahamwhidbee.labs;

import java.util.Scanner;

public class Trigonometry {
	public static void main(String[] args) {
		double sideA, sideB, sideC, c2, angle;
		//1.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter side A(shorter side)");
		sideA = keyboard.nextDouble();
		
		System.out.println("Enter side B(longer side)");
		sideB = keyboard.nextDouble();
		keyboard.close();
		
		sideA = Math.pow(sideA, 2);
		sideB = Math.pow(sideB, 2);
		sideC = sideA + sideB;
		sideC = Math.sqrt(sideC);
		System.out.println("The hypotenuse length is");
		System.out.println(sideC);
		
		//2.
		c2 = Math.cos(sideA/sideC);
		System.out.print(c2);
		
		c2 = Math.acos(c2);
		c2 = Math.toDegrees(c2);
		
		System.out.println("The angle of the angle between the longer side and hypotenuse is " + c2);
		
		 
		
	}

}
