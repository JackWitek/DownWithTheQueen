package game;

import java.util.Random;
import java.util.Scanner;

import data.Player;

public class GameInit {
	private int gameID;
	private int serverID;
	private int hostID;
	static int numPlayers;
	private int numRebels;
	private int numRoyal;
	private boolean merc;
	private int cityCount;
	private int reqPlayers;
	static Player[] playerList = new Player[numPlayers];

	public void setPlayerList(Player[] playerList) {
		this.playerList = playerList;
	}

	public static Player[] getPlayerList() {
		return playerList;
	}

	public GameInit() {
		reqPlayers = 4;
		numPlayers = 4;
		playerList = new Player[numPlayers];
	}

	public GameInit(int gameID, int serverID, int hostID, int numPlayers, int numRebels, int numRoyal, boolean merc,
			int cityCount) {
		super();
		this.gameID = gameID;
		this.serverID = serverID;
		this.hostID = hostID;
		this.numPlayers = numPlayers;
		this.numRebels = numRebels;
		this.numRoyal = numRoyal;
		this.merc = merc;
		this.cityCount = cityCount;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}

	public int getServerID() {
		return serverID;
	}

	public void setServerID(int serverID) {
		this.serverID = serverID;
	}

	public int getHostID() {
		return hostID;
	}

	public void setHostID(int hostID) {
		this.hostID = hostID;
	}

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public int getNumRebels() {
		return numRebels;
	}

	public void setNumRebels(int numRebels) {
		this.numRebels = numRebels;
	}

	public int getNumRoyal() {
		return numRoyal;
	}

	public void setNumRoyal(int numRoyal) {
		this.numRoyal = numRoyal;
	}

	public boolean isMerc() {
		return merc;
	}

	public void setMerc(boolean merc) {
		this.merc = merc;
	}

	public int getCityCount() {
		return cityCount;
	}

	public void setCityCount(int cityCount) {
		this.cityCount = cityCount;
	}

	////////////////// Jack's Code //////////////////////////////

	/**
	 * Shorter print function because I'm lazy
	 * 
	 * @param line
	 *            - Object to print
	 */
	static void print(Object line) {
		System.out.println(line);
	}

	// For debugging purposes
	static boolean DEBUG = true;

	//////////////////////////////////////////////////////////////

	// debug method until i iron out role assignment
	public void finalRoleCheck(int rebelMax, int crownMax) {
		int numberOfRebels = 0;
		int numberofCrown = 1;

		for (int i = 0; i < playerList.length; i++) {
			if (playerList[i].getRole() == "Rebel") {
				numberOfRebels++;
			}
			if (playerList[i].getRole() == "Duke") {
				numberofCrown++;
			}
		}

		System.out.println("number of rebels: " + numberOfRebels + " number of crown: " + numberofCrown
				+ " number of rebelMax: " + rebelMax + " number of crownMax " + crownMax);
	}

	public void assignRoles() {
		/**
		 * thinking of either assigning a bunch of values to array and A ---
		 * randomly assign users to values such as array of [0,1,1,2,2] - one
		 * user rolls 0, becomes queen and so on OR B --- have users randomly
		 * generate a number and each number is added to a collection, which
		 * tracks the numbers for equal distribution of roles and which allows
		 * them to determine what they will be through if statements
		 */

		/**
		 * x - can represents the 3 combinations for numbers/roles Queen, rebel,
		 * duke availableRoles - to help hold and force only 1 queen and so on
		 * queenMax - placeholder minimum for time being rebelTeamMin and
		 * theCrownMin - ways of forcing balancing/help with assigning roles
		 * 
		 * a use mod to check for uneven and if uneven give rebels +1
		 */

		int x = 0; //
		int queenMax = 1;
		int rebelTeamMin = numPlayers / 2;
		int theCrownMin = numPlayers / 2;
		int index = 0;
		int assignedC = 0;
		int assignedR = 0;

		if (numPlayers % 2 != 0) {
			rebelTeamMin += 1;
		}

		/*
		 * boolean testY = true; // for help testing the balancing Scanner sc =
		 * new Scanner(System.in);
		 * 
		 * while (testY == true) { int rebelTeamMin = 0; int theCrownMin = 0;
		 * 
		 * numPlayers = sc.nextInt();
		 * 
		 * rebelTeamMin = numPlayers / 2; theCrownMin = numPlayers / 2;
		 * 
		 * if (numPlayers % 2 != 0) { rebelTeamMin += 1; testY = false;
		 * sc.close(); }
		 * 
		 * System.out.println("Rebel team minimum: " + rebelTeamMin +
		 * "The Crown minimum: " + theCrownMin); }
		 */

		// assign roles using thought process from earlier

		Player pl1 = new Player();
		Player pl2 = new Player();
		Player pl3 = new Player();
		Player pl4 = new Player();

		playerList[0] = pl1;
		playerList[1] = pl2;
		playerList[2] = pl3;
		playerList[3] = pl4;

		// assign queen
		for (int q = 0; q < queenMax; q++) {
			index = new Random().nextInt(numPlayers);
			playerList[index].setRole("Queen");

		}

		// assign crown which is - 1 for queen
		do {
			index = new Random().nextInt(numPlayers);

			if (playerList[index].getRole().isEmpty()) {

				playerList[index].setRole("Duke");
				assignedC++;
				System.out.println("\nAssigned " + playerList[index] + " crown role with assignedC of " + theCrownMin
						+ " and a index of " + index + "\n");
			}

		} while (assignedC < theCrownMin - queenMax);

		// assign rebels
		do {
			index = new Random().nextInt(numPlayers);

			if (playerList[index].getRole().isEmpty()) {

				playerList[index].setRole("Rebel");
				assignedR++;
				System.out.println("\nAssigned " + playerList[index] + " rebel role with assignedR of " + assignedR
						+ " and a index of " + index + "\n");
			}

		} while (assignedR < rebelTeamMin);

		// Setting test data, Travis can delete this once his stuff works
		// Should use enum for character and role type

		playerList[0].setCharacter("Medic"); // Doed Medic sound better than
												// ----d000d it does
												// Nurse?
		playerList[1].setCharacter("Queen");
		playerList[2].setCharacter("Florence");
		playerList[3].setCharacter("Florence");

		// playerList[0].setRole("Rebel");
		// playerList[1].setRole("Queen");
		// playerList[2].setRole("Duke");
		// playerList[3].setRole("Rebel");

		// Output list of players and their info
		if (DEBUG) {
			for (int i = 0; i < numPlayers; i++) {
				print("Charcter: " + playerList[i].getCharacter() + " -- Role: " + playerList[i].getRole());

			}
		}

	}

	public void gameInit() {

		// Check required number of players is present
		while (numPlayers < reqPlayers) {
			System.out.println("Waiting for " + (reqPlayers - numPlayers) + " more players");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}

		// reqPlayers has been reached
		// for (int i = 0; i < numPlayers; i++) {
		// playerList[i] =
		// }

		assignRoles();

		GamePlay.start();

	}

}
