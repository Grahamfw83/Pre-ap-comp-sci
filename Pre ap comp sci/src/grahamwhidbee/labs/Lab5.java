package grahamwhidbee.labs;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		double x1, y1, x2, y2, distance, math, math2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert x1, y1, x2, y2");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		keyboard.close();
		
		math = (x2-x1);
		math = Math.pow(math, 2);
		math2 = (y2-y1);
		math2 = Math.pow(math2, 2);
		distance = math + math2;
		distance = Math.sqrt(distance);
		System.out.print("the distance between the two points is " + distance);
		
	}

}
