package ch4;

public class MileTimeCalculator {

	public static void main(String[] args) {
		double avgMileTimeDecimal, minutesInt, secondsInt;
		int indexOfLocation;
		String minutes, seconds;
		
		final String avgMileTime = "7:38";
		double amountOfMiles = 26.2;
		
		
		indexOfLocation = avgMileTime.indexOf(":");
		minutes = avgMileTime.substring(0, indexOfLocation);
		seconds = avgMileTime.substring(indexOfLocation+1);
		
		minutesInt = Integer.parseInt(minutes);
		secondsInt = Double.parseDouble(seconds);
		
		minutesInt *= amountOfMiles;
		secondsInt = secondsInt*amountOfMiles;
		System.out.println(seconds);
		avgMileTimeDecimal = (secondsInt/100)+minutesInt;
		System.out.println(avgMileTimeDecimal);

	}

}
