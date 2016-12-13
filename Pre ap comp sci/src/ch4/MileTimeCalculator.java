package ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MileTimeCalculator {

	public static void main(String[] args) {
		double avgMileTimeDecimal, minutesInt, secondsInt;
		String raceTime, raceTimeMinutes, raceTimeHours;
		int indexOfLocation;
		String minutes, seconds;
		DecimalFormat df = new DecimalFormat(".##");
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter average mile time and then amount of miles of the race");
		final String avgMileTime = "7:38";
		double amountOfMiles = 26.2;
		
		indexOfLocation = avgMileTime.indexOf(":");
		minutes = avgMileTime.substring(0, indexOfLocation);
		seconds = avgMileTime.substring(indexOfLocation+1);
		
		minutesInt = Integer.parseInt(minutes);
		secondsInt = Double.parseDouble(seconds);
		secondsInt /= 60;
		minutesInt += secondsInt;
		avgMileTimeDecimal = minutesInt*amountOfMiles;
		avgMileTimeDecimal /= 60;
		
		raceTime = Double.toString(avgMileTimeDecimal);
		indexOfLocation = raceTime.indexOf(".");
		raceTimeMinutes = raceTime.substring(indexOfLocation, indexOfLocation+2);
		raceTimeHours = raceTime.substring(0, indexOfLocation);
		
		System.out.println();
		System.out.println("Maintaining a pace of " + avgMileTime + " gives you a race time of " + raceTimeHours+raceTimeMinutes);
		
	}

}
