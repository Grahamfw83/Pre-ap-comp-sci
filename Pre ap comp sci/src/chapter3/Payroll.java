package chapter3;
import java.util.Scanner;
public class Payroll {

	public static void main(String[] args) {
		double hoursStandard, hoursOvertime, payStandard, payOvertime, payTotal, hoursTotal;
		Scanner keyboard = new Scanner(System.in);
		hoursOvertime = 0;
		System.out.println("Enter the amount of hours you have worked please right now in the last week more specifically based upon a standard work rate of 40 hours");
		hoursStandard = keyboard.nextDouble();
		
		if(hoursStandard>=40){
			hoursOvertime = hoursStandard-40;
			hoursStandard = 40;
		}else if(hoursStandard<0){
			System.out.println("Cannot enter negative number");
		}else{
			hoursOvertime = 0;
		}
		System.out.println("enter pay rate");
		payStandard = keyboard.nextDouble();
		keyboard.close();
		
		payOvertime = hoursOvertime*(payStandard*1.5);
		payStandard = hoursStandard*payStandard;
		hoursTotal = hoursStandard+hoursOvertime;
		payTotal = payStandard+payOvertime;
		
		System.out.println("Hours worked: " + hoursTotal + "\nOvertime hours: " + hoursOvertime + "\nOvertime pay: " + payOvertime + "\nTotal pay " + payTotal);
		

	}

}
