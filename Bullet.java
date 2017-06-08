package Cards;
import data.Player;

public class Bullet extends Card{

	public Bullet() {
		super("Bullet", "Action", "A bullet for their brain. Choose a target to shoot! Inflicts 1 damage to player, can be dodged.");
	}
	
	public void activate(Player user, Player target){
		//Check if player has a dodge card.
		if (target.hasDodge(target)) {
			Dodge.activate(target);
			}
		else {target.setHealth(target.getHealth()-1*user.getDmgMod()); //Will need to update this function later to account for damage variance
		}
	}
}
