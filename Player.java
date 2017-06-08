package data;
import Cards.*;

public class Player {
	//Static player info
	private String playerName;
	private String ipaddress;
	private String character;
	private String role ="";
	//Dynamic information
	private boolean alive;
	private String equipment;
	private String[] hand;
	private int health;
	private int maxHealth;
	private int maxAtk;
	private int dmgMod;
	
	
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

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String[] getHand() {
		return hand;
	}

	public void setHand(String[] hand) {
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
	
	public int getDmgMod() {
		return dmgMod;
	}

	public void setDmgMod(int dmgMod) {
		this.dmgMod = dmgMod;
	}
	// Adding Game actions here for now

	public void drawTwoCards() {
		// TODO Auto-generated method stub
		
	}
	//////////////////////Card Actions
	public boolean hasDodge(Player target){
	//Checks if Player has dodge
	//if target.hand.contains(Dodge){
		return true;
		//}
	//else return false;
	}
	
	public void discard(Card card){
		//player discards a card from their hand
	}
	
}
