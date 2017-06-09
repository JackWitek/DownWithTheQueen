package data;

public class Character {
	//Character Specific
	private String name;
	//private String special; //Sepicials will be considered in later versions
	private int initiative;
	private int maxHealth;
	private String nationality;
	
	public Character(String name, String special, int maxHealth, int initiative, String nationality) {
		super();
		this.name = name;
		//this.special = special;
		this.initiative = initiative;
		this.maxHealth = maxHealth;
		this.nationality = nationality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**

	public void setSpecial(String special) {
		this.special = special;
	}
	
	**/

	public int getInitiative() {
		return initiative;
	}

	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
}


