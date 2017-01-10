package ch4;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		int numberOfTeams, numberOfPlayers, numberOfPlayersPerTeam, leftOvers;
		numberOfTeams = 0;
		Scanner keyboard = new Scanner(System.in);
		//football team is being listed, assuming 45 players per team
		System.out.println("Enter the number of players that have signed up for the league");
		
		//number of players entered here
		numberOfPlayers = keyboard.nextInt();
		
		if (numberOfPlayers>=45){
			while (numberOfPlayers>=45){
				numberOfTeams++;
				numberOfPlayers -= 45;
			}
		}
		System.out.println("The number of teams able to be created is "+numberOfTeams);
		System.out.println("The number of players left over is "+numberOfPlayers);
		System.out.println("The number of players per team is calculated based upon 45 players per team");
		
	}

}
