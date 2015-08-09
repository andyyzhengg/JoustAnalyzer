package JoustModel;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class Model {

	public LinkedHashMap<Integer, Integer> countCost(List<String> deck){
		Iterator<String> deckIterator = deck.iterator();
		String[] cardInfo = new String[3];
		LinkedHashMap map = new LinkedHashMap();
		while (deckIterator.hasNext()){
			String card = deckIterator.next();
			cardInfo = card.split(" ");
			if(map.containsKey(cardInfo[2])){
				map.put(cardInfo[2], map.get(cardInfo));
			}
		}
		return null;
		
	}
	
	public void compare(){
		
	}
}
