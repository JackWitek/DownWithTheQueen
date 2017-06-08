package Cards;

public class Card {
	//Base Attributes of each card
	private String cardName;
	private String cardType;
	private String cardText;
	
	//Constructor
	public Card(String cardName, String cardType, String cardText) {
		this.cardName = cardName;
		this.cardType = cardType;
		this.cardText = cardText;
	}


	public String getCardName() {
		return cardName;
	}


	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	public String getCardType() {
		return cardType;
	}


	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	public String getCardText() {
		return cardText;
	}


	public void setCardText(String cardText) {
		this.cardText = cardText;
	}

}
