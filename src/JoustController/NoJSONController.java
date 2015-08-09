package JoustController;

import JoustData.Card;

public class NoJSONController extends ControllerA {

	@Override
	public Card getCard(String line) {
		Card ret = null;
		String[] cardData = line.split(",");
		for(int i = 0; i < cardData.length; i++) {
			cardData[i] = cardData[i].trim();
		}
		try {
			ret = new Card(cardData[0], Integer.parseInt(cardData[1]), Integer.parseInt(cardData[2]));
		} catch(IndexOutOfBoundsException e) {
			System.err.println("Error: not enough parameters in card data"  + e);
		}
		return ret;
	}
}
