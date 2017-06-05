package data;

public class Player {
	//Static player info
	private String playerName;
	private String ipaddress;
	private String character;
	private String role;
	//Dynamic information
	private boolean alive;
	private int city;
	private int hand;
	private int health;
	private int maxHealth;
	private int maxAtk;
	
	
	public Player() {
		//super();
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getHand() {
		return hand;
	}

	public void setHand(int hand) {
		this.hand = hand;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getMaxAtk() {
		return maxAtk;
	}

	public void setMaxAtk(int maxAtk) {
		this.maxAtk = maxAtk;
	}
///////////////////////////End of Generated Content
	public static void main (String[] args){
		Player Player1 = new Player();
		System.out.println("Done!");
	}
	
}
