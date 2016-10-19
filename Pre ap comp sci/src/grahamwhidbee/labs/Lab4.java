package grahamwhidbee.labs;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab4 {

	public static void main(String[] args) {
		double area, side1, side2, side3, s;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Insert sides of triangle");
		side1 = keyboard.nextDouble();
		side2 = keyboard.nextDouble();
		side3 = keyboard.nextDouble();
		keyboard.close();
		
		s = (side1+side2+side3)/2;
		area = s*(s-side1)*(s-side2)*(s-side3);
		area = Math.sqrt(area);
		
		DecimalFormat df = new DecimalFormat("#######.000");
		String area2 = df.format(area);
		
		System.out.print("the area of the triangle is " + area2);
		
	}

}
