package grahamwhidbee.labs;

public class Retirement {

	public static void main(String[] args) {
	
        //Variable Declarations		
		int monthlySalary, yearlySalary;
		double fivePercent, eightPercent, tenPercent, yearly5, yearly8, yearly10;
		
		
		//Math stuff
		monthlySalary = 6000;
		yearlySalary = monthlySalary*12;
		fivePercent = .05;
		eightPercent = .08;
		tenPercent = .1;
		yearly5 = monthlySalary*fivePercent*12;
		yearly8 = monthlySalary*eightPercent*12;
		yearly10 = monthlySalary*tenPercent*12;
		tenPercent = yearly10-yearly8;
		eightPercent = yearly8-yearly5;
		
		
		//output statements
		System.out.println("Annual Salary is " + yearlySalary);
		System.out.println("Monthly 401K contribution");
		System.out.println("5 percent of salary " + yearly5 + " per year");
		System.out.println("8 percent of salary " + yearly8 + " per year");
		System.out.println("10 percent of salary " + yearly10 + " per year");
		System.out.println("Difference between 10 percent and 8 percent monthly is " + tenPercent);
		System.out.println("Difference between 8 percent and 5 percent monthly is " + eightPercent);
		
		
		
		
		
		

	}

}
