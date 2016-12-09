package grahamwhidbee.labs;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab3 {

	public static void main(String[] args) {
		
		double radius, volume, sA;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Insert radius of circle");
		radius = keyboard.nextDouble();
		keyboard.close();
		
		volume = 4/3*Math.PI*Math.pow(radius, 3);
		sA = 4*Math.PI*Math.pow(radius, 2);
		DecimalFormat df = new DecimalFormat("##################.0000");
		String volume2 = df.format(volume);
		String sA2 = df.format(sA);
		
		System.out.print("The Volume is " + volume2 + " The surface area is " + sA2);
		
	}

}
