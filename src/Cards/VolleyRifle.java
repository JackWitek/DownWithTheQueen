package Cards;
import data.Player;

public class VolleyRifle extends Card{

	public VolleyRifle() {
		super("Volley Rifle", "Equipment", "A volley rifle allows the user three attacks against adjacent players. Range:1");
	}
	
	public void activate(Player user){
		user.setEquipment("Volley Rifle");
		user.setMaxAtk(3);
	}

}
