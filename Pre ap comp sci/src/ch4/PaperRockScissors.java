package ch4;

import java.util.Scanner;

public class PaperRockScissors {

	public static void main(String[] args) {
		String input, input2;
		int inputInt;
		double oponnentChoiceDouble;
		Scanner keyboard = new Scanner(System.in);
		boolean Continue = true;
		while (Continue){
			
			System.out.println("enter rock, paper, or scissors");
			input = "r";
			input = input.substring(0,1);
			
			if (input=="r"){
				inputInt = 0;
			}else if (input=="p"){
				inputInt = 1;
			}else if (input=="s"){
				inputInt = 2;
			}
			oponnentChoiceDouble = Math.random()*3;
			oponnentChoiceDouble = (int)oponnentChoiceDouble;
			
			if (inputInt==0&&oponnentChoiceDouble==0){
				System.out.println("You tie");
			}else if (inputInt==0&&oponnentChoiceDouble==1){
				System.out.println("You Lose");
			}else if (inputInt==0&&oponnentChoiceDouble==2){
				System.out.println("You win");
			}else if(inputInt==1&&oponnentChoiceDouble==0){
				System.out.println("You win BRU");
			}else if(inputInt==1&&oponnentChoiceDouble==1){
				System.out.println("you tie");
			}else if(){
				
			}
			
		}

	}

}
