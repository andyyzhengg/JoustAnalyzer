package JoustController;

import java.util.ArrayList;
import java.util.List;

import JoustData.Card;

public abstract class ControllerA {
	public final List<Card> createDeck(List<CharSequence> paragraphText) {
		List<Card> ret = new ArrayList<Card>();
		for(CharSequence s : paragraphText) {
			ret.add(getCard(s.toString()));
		}
		return ret;
	}
	public abstract Card getCard(String line);
}
