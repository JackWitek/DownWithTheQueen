package game;

import java.util.Random;
import java.util.Scanner;

import data.Player;

public class DownWithTheQueen {
	private int gameID;
	private int serverID;
	private int hostID;
	private int numPlayers;
	private int numRebels;
	private int numRoyal;
	private boolean merc;
	private int cityCount;
	private int reqPlayers;
	Player[] playerList = new Player[numPlayers];

	public void setPlayerList(Player[] playerList) {
		this.playerList = playerList;
	}

	public Player[] getPlayerList() {
		return playerList;
	}

	public DownWithTheQueen() {
		reqPlayers = 4;
		numPlayers = 4;
		playerList = new Player[numPlayers];
	}

	public DownWithTheQueen(int gameID, int serverID, int hostID, int numPlayers, int numRebels, int numRoyal,
			boolean merc, int cityCount) {
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
		 * use mod to check for uneven and if uneven give rebels +1
		 */

		int x = 0; //
		int queenMax = 1;
		int rebelTeamMin = numPlayers / 2;
		int theCrownMin = numPlayers / 2;
		int index = 0;
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

		// assign crown
		for (int c = 0; c < theCrownMin; c++) {

			do {
				index = new Random().nextInt(numPlayers);

				if (playerList[index].getRole().isEmpty()) {

					playerList[index].setRole("Duke");
				}

			} while (playerList[index].getRole().isEmpty());

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

	}

	/////////////////////////// End of Generated Content
	public static void main(String[] args) {
		System.out.println("Welcome to DOWN with the QUEEN!!!");

		// Create instance of game object
		DownWithTheQueen gameInstance = new DownWithTheQueen();
		gameInstance.gameInit();
	}
}
