package JoustController;

import java.util.ArrayList;
import java.util.List;

import JoustData.Card;
import JoustModel.Model;

public abstract class ControllerA {
	
	public final void calculate(List<CharSequence> opponentDeckList, List<CharSequence> playerDeckList) {
		Model.compare(createDeck(opponentDeckList), createDeck(playerDeckList));
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