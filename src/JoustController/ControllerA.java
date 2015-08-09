package JoustController;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import JoustData.Card;
import JoustModel.Model;

public abstract class ControllerA {
	
	public final String calculate(List<CharSequence> opponentDeckList, List<CharSequence> playerDeckList) {
		DecimalFormat f = new DecimalFormat("##.00");
		return "The probability of victory is: " + f.format((Model.compare(createDeck(playerDeckList), createDeck(opponentDeckList)) * 100)).toString() + "%!";
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
