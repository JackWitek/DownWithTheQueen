package Cards;
import data.Player;

public class Dodge extends Card{

	public Dodge() {
		super("Dodge", "Action", "A blur to the eye. Use this card to dodge attacks! Discard after use.");
	}
	
	public static void activate(Player target){
	//Cannot activate unless attacked.
	System.out.println("Dodged!");
	target.discard(null);  //ADD DISCARD DODGE LATER ONCE YOU DETERMINE HOW TO HANDLE THE HAND
	}

}
