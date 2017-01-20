package ch4;

public class Dice_Are_Nice {

	public static void main(String[] args) {
		double dice1, dice2;
		int dice1Int, dice2Int;
		boolean win = false;
		while(!win){
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;
			dice1Int = (int)dice1;
			dice2Int = (int)dice2;
			if (dice1Int+dice2Int==2||dice1Int+dice2Int==3||dice1Int+dice2Int==11||dice1Int+dice2Int==12) {
				System.out.println("dice 1 = " +dice1Int + "\ndice 2 equals " + dice2Int);
				System.out.print("The total is ");
				System.out.println(dice1Int+dice2Int);
				System.out.println("You win!");
				win = true;
			}else if (dice1+dice2==7){
				System.out.println("You Lose! HA");
				win = true;
			}else {
				System.out.println("You didnt roll a winning number or a losing number, game will run again");
			}
		}
		
	}

}
