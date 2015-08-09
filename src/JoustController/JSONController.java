package JoustController;

import JoustData.Card;
import JoustData.JSONCardParser;

public class JSONController extends ControllerA {

	@Override
	public Card getCard(String line) {
		JSONCardParser parser = new JSONCardParser();
		Card ret = parser.getCardByName(line.replaceAll("[0-9]+", " ").trim());
		if(ret != null) ret.setCount(Integer.parseInt(line.replaceAll("[^0-9]+", " ").trim()));
		return ret;
	}

}
