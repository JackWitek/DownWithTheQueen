package game;

public class DownWithTheQueen {
	private int gameID;
	private int serverID;
	private int hostID;
	private int numPlayers;
	private int numRebels;
	private int numRoyal;
	private boolean merc;
	private int cityCount;
	
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
///////////////////////////End of Generated Content
	public static void main (String[] args){
		System.out.println("Welcome to DOWN with the QUEEN!!!");
	}
}
