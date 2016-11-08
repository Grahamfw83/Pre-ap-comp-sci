package chapter3;

public class Andrew {

	public static void main(String[] args) {
		double numShares, sharePrice, commision;
		
		numShares = 1000;
		sharePrice = 32.87;
		commision = .02;
		
		double week1Commision = numShares*sharePrice*commision;
		double week1Paid = (numShares*sharePrice*commision) + (numShares*sharePrice);
		
		System.out.println("week one, Joe paid: " + week1Paid);
		System.out.println("week one, Joe paid: " + week1Commision + " in commision to his broker.");
		
		
		double numShares2 = 1000;
		double sharePrice2 = 33.92;
		double commision2 = .02;
		double week2Commision = numShares2*sharePrice2*commision2;
		double week2Profit = (numShares2*sharePrice2) - (numShares2*sharePrice2*commision2);
		
		System.out.println("The amount per share that Joe sold the stock for in Week 2 was : " + sharePrice);
		System.out.println("The total amount that joe sold the stock for was: " + (numShares*sharePrice));
		System.out.println("The total amount that joe paid his broker in week 2 is: " + week2Commision);
		System.out.println("The total profit that Joe made was: " + (week2Profit-week1Paid));
		System.out.println("The totla loss ofver the two weeks is " + (week1Paid+week2Commision));

	}

}
