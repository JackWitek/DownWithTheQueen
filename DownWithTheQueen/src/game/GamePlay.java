package game;

import java.util.Scanner;

import data.Game;

public class GamePlay {

	/**
	 * Shorter print function because I'm lazy
	 * 
	 * @param line
	 *            - Object to print
	 */
	static void print(Object line) {
		System.out.println(line);
	}

	public static void start() {

		int playerTurn = -1;

		// Get DEBUG status
		boolean DEBUG = GameInit.DEBUG;

		// Game Starts here
		if (DEBUG) {
			print("\nStarting Game! \n");
		}

		// Need to find out who is queen
		for (int i = 0; i < GameInit.numPlayers; i++) {

			if (GameInit.playerList[i].getRole() == "Queen") {
				if (DEBUG) {
					print("Player " + (i + 1) + " is the Queen and goes first! \n");

					playerTurn = i;

				}

			}

		}

		boolean gameOver = false;

		int turnNumber = 1;

		while (gameOver == false) {

			// Turn goes here

			if (DEBUG) {

				print("Starting turn: " + turnNumber);
			}

			// Every player start turn by drawing two cards
			GameInit.playerList[playerTurn].drawTwoCards();

			// Display turn options for current Player

			System.out.println("Player " + (playerTurn + 1) + " please play a card: ");

			PrintPossibleMoves(playerTurn);

			// Get user's input

			Scanner reader = new Scanner(System.in); // Constructs reader to read user inputs

			int move = reader.nextInt();

			// Carry out player's turn
			
			// This will check against player's cards
			if (move == 1) {
				print("Player " + (playerTurn + 1) + " uses their attack card!! ");
			}

			if (move == 9) {
				print("Player " + (playerTurn + 1) + " ends their turn!!");

			}

			playerTurn++; // Get next player goes here
			turnNumber++;
			print("\n");

		}

	}

	private static void PrintPossibleMoves(int playerTurn) {
		// This will actually list available cards
		print("(1: Attack)");
		print("(9: End turn)");

	}

}
