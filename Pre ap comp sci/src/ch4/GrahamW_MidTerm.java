package ch4;

import java.util.Scanner;

public class GrahamW_MidTerm {

	public static void main(String[] args) {
		int firstInputInt, secondInputInt, locationOfOperator;
		double output;
		String inputMain, firstInput, operatorInput, secondInput;
		Scanner keyboard = new Scanner(System.in);
		
		//PLEASE TO GOD WORK I SWEAR I FREAKING SWEAR
		firstInputInt=0;
		secondInputInt=0;
		output = 0;
		locationOfOperator = 1;
		firstInput = "";
		secondInput = "";
		operatorInput = "";
		
		//Also coach you better not make this program crash, the rules are right here
		System.out.println("Calculator 5000 by graham whidbee\n");
		System.out.println("for addition use +\nfor subtraction use -\nfor multiplication use *\nfor division use /");
		System.out.println("\nPlease note that a number greater than 12 or less than 0 cannot be entered");
		System.out.println("Inputs must be formatted like these examples: 3+3, 12/12, 4*5, 6*3");
		System.out.println("If you would like to add, subtract, multiply or divide two random numbers, please follow this formatting: random+random random*random random/random random-random\n");
		System.out.println("Please enter equation to solve");
		inputMain = keyboard.nextLine();
		keyboard.close();
		
		//determining location of operator
		if (inputMain.contains("+")){
			locationOfOperator = inputMain.indexOf("+");
		}else if (inputMain.contains("-")){
			locationOfOperator = inputMain.indexOf("-");
		}else if (inputMain.contains("*")){
			locationOfOperator = inputMain.indexOf("*");
		}else if (inputMain.contains("/")){
				locationOfOperator = inputMain.indexOf("/");
		}else {
			System.out.println("No operator");
		} 
		
		//determining the location of the variables needed for equations
		if (!inputMain.isEmpty()){
			firstInput = inputMain.substring(0, locationOfOperator);
			secondInput = inputMain.substring(locationOfOperator+1);
			operatorInput = inputMain.substring(locationOfOperator, locationOfOperator+1);
		}
		
		//test to confirm there are numbers in the variable
		if (!firstInput.isEmpty() && !secondInput.isEmpty() && !firstInput.contains("random")){
			firstInputInt = Integer.parseInt(firstInput);
			secondInputInt = Integer.parseInt(secondInput);
		}else if (!firstInput.contains("random") && !firstInput.isEmpty()){
			firstInputInt=0;
			secondInputInt=0;
		}
		//test to confirm first input isn't empty
		if (firstInput.isEmpty()){
			System.out.println("No problem to solve");
		
		//test to confirm if numbers inputed are out of range of program
		}else if (firstInputInt>12 || firstInputInt<0 || secondInputInt>12 || secondInputInt<0){
			System.out.println("Cannot solve for values greater than 12 or less than 0");
		//test to determine if variable input is random
		}else if (firstInput.contains("random")){
			if(inputMain.contains("+")) {
				output = (Math.random()*6)+(Math.random()*6);
			}else if(inputMain.contains("-")) {
				output = (Math.random()*6)-(Math.random()*6);
			}else if(inputMain.contains("*")) {
				output = (Math.random()*6)*(Math.random()*6);
			}else if(inputMain.contains("/")) {
				output = (Math.random()*6)/(Math.random()*6);
			}
			
		//test to determine what operation is desired
		}else if (!firstInput.contains("random")&&(operatorInput.contains("+") || operatorInput.contains("-") || operatorInput.contains("*") ||operatorInput.contains("/"))){
			firstInputInt = Integer.parseInt(firstInput);
			secondInputInt = Integer.parseInt(secondInput);
			//operator calculation
			if (operatorInput.contains("+")){
				output = firstInputInt+secondInputInt;
			}else if (operatorInput.contains("-")){
				output = firstInputInt-secondInputInt;
			}else if (operatorInput.contains("*")){
				output = firstInputInt*secondInputInt;
			}else if (operatorInput.contains("/")){
				output = firstInputInt/secondInputInt;
			}
		}
	
		System.out.println("Your output is " + (int)output);
	}

}
