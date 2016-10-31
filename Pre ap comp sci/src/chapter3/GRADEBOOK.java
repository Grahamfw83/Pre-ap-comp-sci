package chapter3;
import java.util.Scanner;
public class GRADEBOOK {

	public static void main(String[] args) {
		double grade;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter grade");
		grade = keyboard.nextDouble();
		
		if (grade==100){
			System.out.print("YUU GOT THE A");
		}else if (grade>90){
			System.out.print("YUU GOT THE A");
		}else if (grade>80){
			System.out.print("YUU GOT THE B");
		}else if (grade>70){
			System.out.print("YUU GOT THE C");
		}else if (grade>60){
			System.out.print("YUU WASTE OF OXYGEN");
		}
		

		
		

	}

}
