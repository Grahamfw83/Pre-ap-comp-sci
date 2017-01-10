package ch4;

import java.util.Scanner;

public class DoTheTemperatureChecks {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		double temp = keyboard.nextDouble();
		while (temp>=102.5){
			System.out.println("TURN DOWN THE THERMOSTAT MAIN");
			System.out.println("WAIT THE FIVE MINUTES AND REENTER THE TEMP MAIN");
			temp = keyboard.nextDouble();
		}
		System.out.println("The Temperature is acceptable");

	}

}
