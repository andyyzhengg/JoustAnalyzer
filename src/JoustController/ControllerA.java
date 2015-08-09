package JoustController;

import java.util.ArrayList;
import java.util.List;

import JoustData.Card;
import JoustModel.Model;

public abstract class ControllerA {
	
	public final String calculate(List<CharSequence> opponentDeckList, List<CharSequence> playerDeckList) {
		return "The probability of victory is: " + Double.toString(Model.compare(createDeck(playerDeckList), createDeck(opponentDeckList)) * 100) + "%!";
	}
	public final List<Card> createDeck(List<CharSequence> paragraphText) {
		List<Card> ret = new ArrayList<Card>();
		for(CharSequence s : paragraphText) {
			ret.add(getCard(s.toString()));
		}
		return ret;
	}
	public abstract Card getCard(String line);
}
